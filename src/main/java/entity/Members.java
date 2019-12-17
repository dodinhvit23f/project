package entity;
// Generated Dec 5, 2019 8:22:49 PM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Members generated by hbm2java
 */
@Entity
@Table(name = "members", catalog = "javaproject2")
public class Members implements java.io.Serializable {

	private Integer id;
	private String name;
	private int point;
	private String phoneNumber;
	private Set<Bills> billses = new HashSet<Bills>(0);

	public Members() {
	}

	public Members(String name, int point) {
		this.name = name;
		this.point = point;
	}

	public Members(String name, int point, String phoneNumber, Set<Bills> billses) {
		this.name = name;
		this.point = point;
		this.phoneNumber = phoneNumber;
		this.billses = billses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "Name", nullable = false, length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "Point", nullable = false)
	public int getPoint() {
		return this.point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Column(name = "PhoneNumber", length = 20)
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "members")
	public Set<Bills> getBillses() {
		return this.billses;
	}

	public void setBillses(Set<Bills> billses) {
		this.billses = billses;
	}

}
