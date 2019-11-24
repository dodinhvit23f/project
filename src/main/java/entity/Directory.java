package entity;
// Generated Nov 18, 2019 8:20:39 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Directory generated by hbm2java
 */
@Entity
@Table(name = "directory", catalog = "doan", uniqueConstraints = @UniqueConstraint(columnNames = "phone"))
public class Directory implements java.io.Serializable {

	private Integer id;
	private String username;
	private String phone;
	private String area;
	private int rank;
	private double freight;

	public Directory() {
	}

	public Directory(String username, String phone, String area, int rank, double freight) {
		this.username = username;
		this.phone = phone;
		this.area = area;
		this.rank = rank;
		this.freight = freight;
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

	@Column(name = "username", nullable = false, length = 65535)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "phone", unique = true, nullable = false, length = 11)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "area", nullable = false, length = 30)
	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "rank", nullable = false)
	public int getRank() {
		return this.rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Column(name = "freight", nullable = false, precision = 22, scale = 0)
	public double getFreight() {
		return this.freight;
	}

	public void setFreight(double freight) {
		this.freight = freight;
	}

}
