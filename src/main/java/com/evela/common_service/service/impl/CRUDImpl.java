package com.evela.common_service.service.impl;

import com.evela.common_service.exception.NewModelNotFoundException;
import com.evela.common_service.repository.IGenericRepo;
import com.evela.common_service.service.ICRUD;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(propagation = Propagation.REQUIRED)
public abstract class CRUDImpl<T, ID> implements ICRUD<T, ID> {

    protected abstract IGenericRepo<T, ID> getRepo();
    @Autowired
    private EntityManager entityManager;

    @Transactional
    @Override
    public T save(T t) throws Exception {
            return getRepo().save(t);
    }
    @Transactional
    @Override
    public T update(T t, ID id) throws Exception {
        getRepo().findById(id).orElseThrow(()->new NewModelNotFoundException("ID NOT FOOUND " + id));
        return getRepo().save(t);
    }
    @Transactional
    @Override
    public List<T> findAll() throws Exception {
        return getRepo().findAll();
    }
    @Transactional
    @Override
    public T findById(ID id) throws Exception {
        return getRepo().findById(id).orElse(null);
    }
    @Transactional
    @Override
    public void delete(ID id) throws Exception {
        getRepo().deleteById(id);
    }

     private boolean isEntityDetached(T entity) {
        // Comprobar si la entidad tiene un ID establecido y no está en el contexto de persistencia
        // Esto puede requerir comprobar si el EntityManager la conoce, o si el ID está vacío
        // Un ejemplo podría ser comprobar si el ID es null (si usas @GeneratedValue)
        return entity != null && getEntityId(entity) != null && !entityManager.contains(entity);
    }

    private ID getEntityId(T entity) {
        // Aquí deberías obtener el ID de la entidad dependiendo de cómo esté modelada
        // Esto se puede hacer usando reflexión si no quieres especificar el campo ID manualmente
        // o utilizando un getter si lo tienes disponible.
        try {
            // Ejemplo con reflexión
            return (ID) entity.getClass().getMethod("getId").invoke(entity);
        } catch (Exception e) {
            return null;
        }
    }
}
