package abstracts;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import common.Constant;
import common.Hibernate;
import common.Utility;
import interfaces.BaseDaoInteface;

public abstract  class BaseDao<Clazz> implements BaseDaoInteface {
	private Session session;
	private final Class<Clazz> clazz;
	
	public BaseDao(Class<Clazz> entity) {
		this.clazz = entity;
	}
	
	
	public List<Clazz> selectAll() {
		this.session = Hibernate.getConnection();
		List<Clazz> list = this.session
				.createQuery("select e from " +clazz.getSimpleName() + " e  WHERE  status = " + Constant.Status.ACTIVE, this.clazz)
				.getResultList();
		Utility.closeSession(session);
		return list;
	}
	
	protected abstract boolean vaildateRequest();
	
	@Override
	public void insertOne(String[] field, String[] param) {
		if(!vaildateRequest()) {
			return ;
		}
		StringBuilder ss = new StringBuilder();
		ss.append("INSERT INTO " + this.clazz.getSimpleName() + " ");
		ss.append("(" + seperateByComma(field, 1) + ")");
		ss.append(" VALUES ");
		ss.append("(" + seperateByComma(param, 0) + ")");
		int n = param.length;
		this.session = Hibernate.getConnection();
		try {
			this.session.getTransaction().begin();
			Query<?> query = this.session.createNativeQuery(ss.toString());
			for (int i = 1; i <= n; i++) {
				query.setParameter(i, param[i-1]);
			}
			query.executeUpdate();
			this.session.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			Utility.closeSession(session);
		}

	}
	
	@Override
	public void updateOne(String[] field, String[] param) {
		if(!vaildateRequest()) {
			return ;
		}
		int n = param.length - 1;
		String[] newParam = new String[n];
		for (int i = 0; i < n; i++) {
			newParam[i] = field[i] + " = " + " ? ";
		}
		StringBuilder ss = new StringBuilder();
		ss.append("UPDATE " + this.clazz.getSimpleName() + " SET ");
		ss.append(seperateByComma(newParam, 1));
		ss.append("WHERE " + field[n] + " =  ?");
		this.session = Hibernate.getConnection();
		n++;
		try {
			this.session.getTransaction().begin();
			Query<?> query = this.session.createNativeQuery(ss.toString());
			for (int i = 1; i <= n; i++) {
				query.setParameter(i, param[i-1]);
			}
			query.executeUpdate();
			this.session.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			Utility.closeSession(session);
		}
	}

	@Override
	public void delete(String id) {
		try {
			this.session.getTransaction().begin();
			this.session
					.createQuery(
							"UPDATE " + this.clazz.getSimpleName() + " SET status = " + Constant.Status.INACTIVE + " WHERE id = ?")
					.setParameter(1, id).executeUpdate();
			this.session.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			Utility.closeSession(session);
		}
	}
}
