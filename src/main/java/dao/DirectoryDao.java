package dao;

import abstracts.BaseDao;
import common.JpaConfig;
import entity.Directory;


public class DirectoryDao extends BaseDao<Directory>{
	public  DirectoryDao() {
		super(Directory.class);
		JpaConfig.setClass(Directory.class);
	}

	

	@Override
	protected boolean vaildateRequest(Directory clazz) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	protected void setChange(Directory clazz) {
		// TODO Auto-generated method stub
		
	}
	
	
 	
}
