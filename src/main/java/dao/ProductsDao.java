package dao;

import abstracts.BaseDao;
import common.JpaConfig;
import entity.Products;


public class ProductsDao extends BaseDao<Products>{
	public  ProductsDao() {
		super(Products.class);
		JpaConfig.setClass(Products.class);
	}

	@Override
	protected boolean vaildateRequest(Products clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void setChange(Products clazz) {
		// TODO Auto-generated method stub
		
	}
	
	
 	
}
