package Main;

import common.Constant.FilePath;
import common.Utility;
import dao.ProductsDao;

public class Main {
	public static void main(String[] args) throws Exception {
	
	 		
		ProductsDao dao = new ProductsDao();
		/*
		 * String [] field = {"username","phone" ,"area","rank","id"}; String [] param =
		 * {"tiendd","16","Viet Nam","1","14"}; dao.updateOne(field, param)
		 */
                dao.searchProduct("1");
		System.out.println(FilePath.URL);
		System.out.println(Utility.hash("12345678"));
		//	dao.selectAll();
		//	dao.insertOne(new String[] {"a "}, new String[] {"a "});
			/*
			 * list.forEach((ele) ->{ System.out.println(ele.getUsername()); });
			 */       
	}
}
