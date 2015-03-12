package th.co.hardcoresoft.common.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public abstract class AbstractDaoImpl<T, PK extends Serializable> implements AbstractDao<T, PK> {

	protected Log log = LogFactory.getLog(getClass());
	protected Class<T> persistentClass;

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public AbstractDaoImpl() {
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	protected Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	protected Criteria createCriteria() {
		return getCurrentSession().createCriteria(persistentClass);
	}

	protected Query createQuery(String hql) {
		return getCurrentSession().createQuery(hql);
	}

	@SuppressWarnings("unchecked")
	public T get(PK id) {
		T entity = (T) this.getCurrentSession().get(this.persistentClass, id);
		if (entity == null) {
			throw new EntityNotFoundException(this.persistentClass + " with id '" + id + "' not found.");
		}
		return entity;
	}

	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		return this.getCurrentSession().createCriteria(persistentClass).list();

		//return this.getCurrentSession(). load(persistentClass);
	}

	/**
	 * Recommended to use T saveOrUpdate(T entity) instead of save/update if you
	 * need an object back !!!
	 */
	@SuppressWarnings("unchecked")
	public T saveOrUpdate(T entity) {
		return ((T) this.getCurrentSession().merge(entity));
	}

	public void save(T entity) {
		this.getCurrentSession().saveOrUpdate(entity);
	}

	public void update(T entity) {
		this.getCurrentSession().update(entity);

	}

	public void delete(T entity) {
		this.getCurrentSession().delete(entity);
	}

	public void delete(PK id) {
		this.getCurrentSession().delete(this.get(id));
	}

	public void delete(PK[] ids) {
		if (ids != null) {
			for (PK id : ids) {
				delete(id);
			}
		}
	}

	public boolean exists(PK id) {
		T entity = (T) this.get(id);
		return (entity == null) ? false : true;
	}

}
