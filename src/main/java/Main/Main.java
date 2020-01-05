package Main;

import common.Constant.FilePath;
import common.Utility;
import dao.ProductsDao;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws Exception {
	
	 		
	  Calendar calendar = Calendar.getInstance();
          calendar.setTimeInMillis(System.currentTimeMillis());
          SimpleDateFormat datetime = new SimpleDateFormat("YYYY-MM-DD");
          Date date = datetime.parse(datetime.format(calendar.getTime()));
          SimpleDateFormat year = new SimpleDateFormat("YYYY");
          SimpleDateFormat month = new SimpleDateFormat("MM");
          SimpleDateFormat day = new SimpleDateFormat("EEEE");
                calendar.set(Utility.convertInt(year.format(date))
                        ,Utility.convertInt(month.format(date))
                        ,Utility.convertInt(day.format(date)));
		//	dao.selectAll();
		//	dao.insertOne(new String[] {"a "}, new String[] {"a "});
			/*
			 * list.forEach((ele) ->{ System.out.println(ele.getUsername()); });
			 */       
                System.out.println("Altered year is :" + calendar.getTime()); 
                 System.out.println("Altered year is :" + datetime.format(calendar.getTime())); 
	}
}
