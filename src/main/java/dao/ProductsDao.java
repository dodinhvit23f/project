package dao;

import abstracts.BaseDao;
import common.Hibernate;
import common.Utility;
import entity.Products;
import java.util.ArrayList;
import java.util.List;

public class ProductsDao extends BaseDao<Products> {
        private static boolean isSet = true;
	public ProductsDao() {
		super(Products.class);
                if(isSet){
		Hibernate.setClass(Products.class);
                isSet = false;
                }
                
	}

	@Override
	protected boolean vaildateRequest(Products clazz) {
		boolean check = true;
		try {
			if (Utility.formatString(clazz.getName()) == "")
				check = false;
			if (Utility.formatString(clazz.getKind()) == "")
				check = false;
			if (Utility.formatString(clazz.getUrl()) == "")
				check = false;
		} catch (Exception ex) {
			return false;
		}
		return check;
	}

	@Override
	protected void setChange(Products oldClazz, Products newClazz) {
		oldClazz.setName(newClazz.getName());
		oldClazz.setKind(newClazz.getKind());
		//oldClazz.setUrl(newClazz.getUrl());
		oldClazz.setPriceOut(newClazz.getPriceOut());
		oldClazz.setQuantities(newClazz.getQuantities());
		oldClazz.setExpDate(newClazz.getExpDate());
		oldClazz.setStatus(newClazz.getStatus());
	}
        
        public List<Products> searchProduct( String string){
            string = Utility.NullToEmty(string);
            if(string == "")
            return null;
            this.session = Hibernate.getConnection();
            List<Products> list = new ArrayList<Products>();
            try{
                list = this.session.createNativeQuery("select * from products where `Name` = ?1 OR `PriceIn` = ?1 OR `PriceOut` = ?1 OR `Kind` = ?1 OR `Quantities` = ?1 OR `ImportDate` = ?1 OR `ExpDate` = ?1 ", Products.class)
                        .setParameter(1, string).getResultList();
            } catch(Exception ex){
            
            } finally{
                Utility.closeObject(session);
            }
            return list;
        }

}
