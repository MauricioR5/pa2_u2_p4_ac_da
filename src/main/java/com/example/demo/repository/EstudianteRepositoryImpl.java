package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import aj.org.objectweb.asm.Type;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepositoryImpl implements EstudianteRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Estudiante estudiante) {
		this.entityManager.persist(estudiante); // permite insertar una entidad en la base de datos
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		this.entityManager.merge(estudiante); // permite actualizar una entidad en la base de datos
	}

	@Override
	public void eliminar(String cedula) {
		Estudiante estu = this.seleccionar(cedula);
		this.entityManager.remove(estu);
	}

	@Override
	public Estudiante seleccionar(String cedula) {

		// this.entityManager.find(Estudiante.class, cedula);
		return this.entityManager.find(Estudiante.class, cedula); // indica que se va a trabajar con una clase
																	// Estudiante
	}
	
	@Override
	public Estudiante seleccionarPorApellido(String apellido) {
		// SQL
		// Select* From estudiante where e.estu_apellido =
		// JPQL
		// SELECT e FROM Estudiante e WHERE e.apellido =
		Query myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido");
		myQuery.setParameter("datoApellido", apellido);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> seleccionarListPorApellido(String apellido) {
		Query myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido");
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getResultList();

	}

	@Override
	public Estudiante seleccionarPorApellidoyNombre(String apellido, String nombre) {
		Query myQuery = this.entityManager
				.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido AND e.nombre =: datoNombre");
		myQuery.setParameter("datoApellido", apellido);
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoTyped(String apellido) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> seleccionarListaPorApellidoTyped(String apellido) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getResultList();
	}

	@Override
	public Estudiante seleccionarPorApellidoNamed(String apellido) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscaPorApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNamedQuery(String apellido) {
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscaPorApellido");
		myQuery.setParameter("DatoApellido", apellido);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQuery(String apellido) {
		Query myQuery =  this.entityManager.createNativeQuery("SELECT * FROM estudiante WHERE estu_apellido =:datoApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQueryNamed(String apellido) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorNombreNamedQuery(String nombre) {
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscaPorNombre");
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante) myQuery.getSingleResult();

	}

	@Override
	public Estudiante seleccionarPorNombreNativeQueryNamed(String nombre) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombre", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarEstudianteDinamico(String nombre, String apellido, Double peso) {
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
		
		// 1. Especificar el tipo de retorno que tiene mi Query
		
		CriteriaQuery<Estudiante> myCriteriaQuery = myBuilder.createQuery(Estudiante.class);
		
		// 2. Empezamos a crear el SQL
		//2.1 Definimos el FROM (Root)
		Root<Estudiante> miTablaFrom = myCriteriaQuery.from(Estudiante.class);//FROM Estudiante
		
		//3. Construye las condiciones
		//peso > 100 e.nombre =? AND e.apellido =?
		//peso <= e.nombre=? OR e.apellido =?
		
		//e.nombre =?
		Predicate pNombre = myBuilder.equal(miTablaFrom.get("nombre"),nombre);
		
		//e.apellido =?
		Predicate pApellido = myBuilder.equal(miTablaFrom.get("apellido"),apellido);
		
		Predicate predicadoFinal = null;
		
		if(peso.compareTo(Double.valueOf(100))<=0) {
			predicadoFinal = myBuilder.or(pNombre, pApellido);
			
		}else {
			predicadoFinal = myBuilder.and(pNombre, pApellido);
			
		}
		
		//4. Armamos mi SQL final
		myCriteriaQuery.select(miTablaFrom).where(predicadoFinal);
		
		//5. La ejecucion del Query lo realizamos con TypedQuery
		TypedQuery<Estudiante> myQueryFinal = this.entityManager.createQuery(myCriteriaQuery);
		return myQueryFinal.getSingleResult();
	}

	@Override
	public int eliminarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery =  this.entityManager.createQuery("DELETE FROM Estudiante e WHERE e.nombre =: datoNombre");
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.executeUpdate();
	}

	@Override
	public int actualizarPorApellido(String nombre, String apellido) {
		Query myQuery =  this.entityManager.createQuery("UPDATE Estudiante e SET e.nombre =: datoNombre WHERE e.apellido =: datoApellido");
		myQuery.setParameter("datoNombre", nombre);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.executeUpdate();
		
	}


}
