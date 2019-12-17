
package entity;
// Generated Dec 5, 2019 8:22:49 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Bills generated by hbm2java
 */
@Entity
@Table(name = "bills", catalog = "javaproject2")
public class Bills implements java.io.Serializable {

	private Integer id;
	private Members members;
	private Products products;
	private int quantities;
	private String addresss;
	private Date receiveDate;
	private double disCount;

	public Bills() {
	}

	public Bills(Members members, Products products, int quantities, String addresss, Date receiveDate,
			double disCount) {
		this.members = members;
		this.products = products;
		this.quantities = quantities;
		this.addresss = addresss;
		this.receiveDate = receiveDate;
		this.disCount = disCount;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MemId", nullable = false)
	public Members getMembers() {
		return this.members;
	}

	public void setMembers(Members members) {
		this.members = members;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ProId", nullable = false)
	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	@Column(name = "Quantities", nullable = false)
	public int getQuantities() {
		return this.quantities;
	}

	public void setQuantities(int quantities) {
		this.quantities = quantities;
	}

	@Column(name = "Addresss", nullable = false, length = 200)
	public String getAddresss() {
		return this.addresss;
	}

	public void setAddresss(String addresss) {
		this.addresss = addresss;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ReceiveDate", nullable = false, length = 10)
	public Date getReceiveDate() {
		return this.receiveDate;
	}

	public void setReceiveDate(Date receiveDate) {
		this.receiveDate = receiveDate;
	}

	@Column(name = "DisCount", nullable = false, precision = 22, scale = 0)
	public double getDisCount() {
		return this.disCount;
	}

	public void setDisCount(double disCount) {
		this.disCount = disCount;
	}

}

