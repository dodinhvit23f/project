package dao;

import abstracts.BaseDao;
import common.Hibernate;
import entity.Directory;


public class DirectoryDao extends BaseDao<Directory>{
	public  DirectoryDao() {
		super(Directory.class);
		Hibernate.setClass(Directory.class);
	}

	@Override
	protected boolean vaildateRequest() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
 	
}
