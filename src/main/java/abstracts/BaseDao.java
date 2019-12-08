package abstracts;

import java.util.List;

import org.hibernate.Session;

import common.Hibernate;
import common.Utility;
import interfaces.BaseDaoInteface;

public abstract  class BaseDao<Clazz> implements BaseDaoInteface<Clazz>{
	protected Session session;
	private final Class<Clazz> clazz;
	
	public BaseDao(Class<Clazz> entity) {
		this.clazz = entity;
	}
	
	
	public List<Clazz> selectAll() {
		this.session = Hibernate.getConnection();
		List<Clazz> list = this.session
				.createQuery("select e from " +clazz.getSimpleName() + " e  ", this.clazz)
				.getResultList();
		Utility.closeObject(session);
		return list;
	}
	
	protected abstract boolean vaildateRequest(Clazz clazz);
	protected abstract void setChange(Clazz oldclazz , Clazz newClazz);
	
	@Override
	public void insertOne(Clazz clazz){
		if(!vaildateRequest(clazz)) {
			return ;
		}
		this.session = Hibernate.getConnection();
		try {
			this.session.getTransaction().begin();
			this.session.persist(clazz);
			this.session.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			Utility.closeObject(session);
		}

	}
	
	@Override
	public void updateOne(Clazz clazz, int id) {
		if(!vaildateRequest(clazz)) {
			return ;
		}
		this.session = Hibernate.getConnection();
		try {
			this.session.getTransaction().begin();
			Clazz oldCalzz = this.session.find(this.clazz, id);
			setChange(oldCalzz,clazz);
			this.session.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			Utility.closeObject(session);
		}
	}

	@Override
	public void delete(String id) {
		try {
			this.session.getTransaction().begin();
			this.session
					.createQuery(
							"DELETE " + this.clazz.getSimpleName() + "  WHERE id = ?")
					.setParameter(1, id).executeUpdate();
			this.session.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			Utility.closeObject(session);
		}
	}
}
