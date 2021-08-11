package in.com.springboot.crudapi.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Employee {

	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer customer_id;
	@Column
	private String first_name;
	@Column
	private String last_name;
	@Column
	private String email;
	@Column
	private Integer active;
	
	@Column
	private Date create_date;

	public Integer getId() {
		return customer_id;
	}

	public void setId(Integer id) {
		this.customer_id = id;
	}

	public String getName() {
		return last_name;
	}

	public void setName(String name) {
		this.last_name = name;
	}

	
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateDate() {
		return create_date;
	}

	public void setCreateDate(Date create_date) {
		this.create_date = create_date;
	}

	@Override
	public String toString() {
		return "Employee [id=" + customer_id + ", name=" + first_name + ", lastname=" + last_name + ", email=" + email + ", createdate="
				+ create_date + "]";
	}
	
	
}
