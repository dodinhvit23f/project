package dao;

import abstracts.BaseDao;
import common.Hibernate;
import entity.Directory;


public class DirectoryDao extends BaseDao<Directory>{
	public  DirectoryDao() {
		super(Directory.class);
		Hibernate.setClass(Directory.class);
	}
	
	public  void  justTest () {};
 	public static void main(String[] args) {
 		
		DirectoryDao dao = new DirectoryDao();
		String [] field = {"username","phone" ,"area","rank","id"};
		String [] param = {"tiendd","16","Viet Nam","1","14"};
		dao.updateOne(field, param)
		//List<Directory> list = dao.selectAll();
	//	dao.selectAll();
	//	dao.insertOne(new String[] {"a "}, new String[] {"a "});
		/*
		 * list.forEach((ele) ->{ System.out.println(ele.getUsername()); })
		 */;
	}
}
