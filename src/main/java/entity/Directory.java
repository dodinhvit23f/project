/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author LTC
 */

public class Directory implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6185625218048697934L;
	private Integer id;
	private String username;
	private String phone;
	private String area;
	private int rank;
	private Double freight;
	private String status;

	public Directory() {
	}

	public Directory(String username, String phone, int rank) {
		this.username = username;
		this.phone = phone;
		this.rank = rank;
	}

	public Directory(String username, String phone, String area, int rank, Double freight, String status) {
		this.username = username;
		this.phone = phone;
		this.area = area;
		this.rank = rank;
		this.freight = freight;
		this.status = status;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getRank() {
		return this.rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Double getFreight() {
		return this.freight;
	}

	public void setFreight(Double freight) {
		this.freight = freight;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
