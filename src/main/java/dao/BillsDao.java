/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import abstracts.BaseDao;
import common.Hibernate;
import entity.Bills;

/**
 *
 * @author HaiDao
 */
public class BillsDao extends BaseDao<Bills> {
    public  BillsDao() {
		super(Bills.class);
		Hibernate.setClass(Bills.class);
	}
    @Override
    protected boolean vaildateRequest() {
    
        return true;
    }
    
}
