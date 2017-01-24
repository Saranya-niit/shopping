package com.niit.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USERROLE")
public class UserRole {
	@Id
	@SequenceGenerator(name = "user_seq1", sequenceName = "user_seq1")
	@GeneratedValue(strategy=GenerationType.AUTO,generator = "user_seq1")
	@Column(name="UID")
	private int uid;
	
	@Column(name="authority")
	String authority;
  
	@OneToOne
	@JoinColumn(name="custId")
	Customer cust;

		public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
		public void setUid(int id)
	{
		uid=id;
	}
	public int getUid()
	{
		return uid;
	}

	public void setAuthority(String nm)
	{
		authority=nm;
	}
	
	public String getAuthority()
	{
		return authority;
	}
}
