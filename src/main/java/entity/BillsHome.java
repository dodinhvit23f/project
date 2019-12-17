package entity;
// Generated Dec 5, 2019 8:22:49 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Bills.
 * @see entity.Bills
 * @author Hibernate Tools
 */
@Stateless
public class BillsHome {

	private static final Log log = LogFactory.getLog(BillsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Bills transientInstance) {
		log.debug("persisting Bills instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Bills persistentInstance) {
		log.debug("removing Bills instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Bills merge(Bills detachedInstance) {
		log.debug("merging Bills instance");
		try {
			Bills result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Bills findById(Integer id) {
		log.debug("getting Bills instance with id: " + id);
		try {
			Bills instance = entityManager.find(Bills.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
