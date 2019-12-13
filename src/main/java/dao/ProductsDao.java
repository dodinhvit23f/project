package dao;

import abstracts.BaseDao;
import common.Hibernate;
import common.Utility;
import entity.Products;

public class ProductsDao extends BaseDao<Products> {
	public ProductsDao() {
		super(Products.class);
		Hibernate.setClass(Products.class);
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

}
