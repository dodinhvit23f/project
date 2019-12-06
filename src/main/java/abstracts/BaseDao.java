package abstracts;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;

import common.Constant;
import common.JpaConfig;
import common.Utility;
import interfaces.BaseDaoInteface;

public abstract  class BaseDao<Clazz> implements BaseDaoInteface<Clazz>{
	private  EntityManager manager;
	private final Class<Clazz> clazz;
	
	public BaseDao(Class<Clazz> entity) {
		this.clazz = entity;
	}
	
	
	public List<Clazz> selectAll() throws IOException {
		this.manager = JpaConfig.getConnection();
		List<Clazz> list = this.manager
				.createQuery("select e from " +clazz.getSimpleName() + " e  WHERE  status = " + Constant.Status.ACTIVE, this.clazz)
				.getResultList();
		Utility.closeObject(manager);
		return list;
	}
	
	protected abstract boolean vaildateRequest(Clazz clazz);
	protected abstract void setChange(Clazz clazz);
	
	@Override
	public void insertOne(Clazz clazz){
		if(!vaildateRequest(clazz)) {
			return ;
		}
		this.manager = JpaConfig.getConnection();
		try {
			this.manager.getTransaction().begin();
			this.manager.persist(clazz);
			this.manager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			Utility.closeObject(manager);
		}

	}
	
	@Override
	public void updateOne(Clazz clazz) {
		if(!vaildateRequest(clazz)) {
			return ;
		}
		try {
			this.manager.getTransaction().begin();
			
			this.manager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			Utility.closeObject(manager);
		}
	}

	@Override
	public void delete(String id) {
		try {
			this.manager.getTransaction().begin();
			this.manager
					.createQuery(
							"DELETE " + this.clazz.getSimpleName() + "  WHERE id = ?")
					.setParameter(1, id).executeUpdate();
			this.manager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			Utility.closeObject(manager);
		}
	}
}
