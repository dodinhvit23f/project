package Main;

import java.sql.Date;

import common.Utility;
import dao.DirectoryDao;

public class Main {
	public static void main(String[] args) throws Exception {
	
	 		
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
			Date date = new Date(System.currentTimeMillis());
			System.out.println(Utility.dateToString(Utility.fomatDate("2019/12/3 11:16:45")));
	}
}
