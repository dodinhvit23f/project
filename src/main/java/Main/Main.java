package Main;

import common.Utility;
import common.Constant.FilePath;
import dao.ProductsDao;
import entity.Products;
import java.io.Closeable;
import java.io.File;

public class Main {
	public static void main(String[] args) throws Exception {
	
	 		
		ProductsDao dao = new ProductsDao();
		/*
		 * String [] field = {"username","phone" ,"area","rank","id"}; String [] param =
		 * {"tiendd","16","Viet Nam","1","14"}; dao.updateOne(field, param)
		 */
		System.out.println(FilePath.URL);
		//	dao.selectAll();
		//	dao.insertOne(new String[] {"a "}, new String[] {"a "});
			/*
			 * list.forEach((ele) ->{ System.out.println(ele.getUsername()); });
			 */       
	}
}
