package Main;

import common.Utility;
import dao.ProductsDao;
import entity.Products;

public class Main {
	public static void main(String[] args) throws Exception {
	
	 		
		ProductsDao dao = new ProductsDao();
		/*
		 * String [] field = {"username","phone" ,"area","rank","id"}; String [] param =
		 * {"tiendd","16","Viet Nam","1","14"}; dao.updateOne(field, param)
		 */
			Products a = new Products();
			a.setKind("Gà");
			a.setName("Gà xả tương ớt");
			a.setUrl("CO gi dau");
			a.setExpDate(Utility.fomatDate("2019/12/3 11:16:45"));
			a.setImportDate(Utility.fomatDate("2019/12/3 11:16:45"));
			a.setPriceIn(90);
		//	dao.selectAll();
		//	dao.insertOne(new String[] {"a "}, new String[] {"a "});
			/*
			 * list.forEach((ele) ->{ System.out.println(ele.getUsername()); })
			 */;
			 dao.insertOne(a);
			
	}
}
