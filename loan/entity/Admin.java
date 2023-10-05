package com.loan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="adminId")
	private Integer adminId;
	
	
	private Integer roleId;
	@ManyToOne
	@JoinColumn(name="roleId",insertable=false,updatable=false)
	private Role role;
	
	private Integer loanOfficerId;
	@ManyToOne
	@JoinColumn(name="loanOfficerId",insertable=false,updatable=false)
	private LoanOfficerName loanofficername;
	
	private Integer custId;
	@ManyToOne
	@JoinColumn(name="custId",insertable=false,updatable=false)
	private Customer customer;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(Integer adminId, Integer roleId, Role role, Integer loanOfficerId, LoanOfficerName loanofficername,
			Integer custId, Customer customer) {
		super();
		this.adminId = adminId;
		this.roleId = roleId;
		this.role = role;
		this.loanOfficerId = loanOfficerId;
		this.loanofficername = loanofficername;
		this.custId = custId;
		this.customer = customer;
	}
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Integer getLoanOfficerId() {
		return loanOfficerId;
	}
	public void setLoanOfficerId(Integer loanOfficerId) {
		this.loanOfficerId = loanOfficerId;
	}
	public LoanOfficerName getLoanofficername() {
		return loanofficername;
	}
	public void setLoanofficername(LoanOfficerName loanofficername) {
		this.loanofficername = loanofficername;
	}
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", roleId=" + roleId + ", role=" + role + ", loanOfficerId="
				+ loanOfficerId + ", loanofficername=" + loanofficername + ", custId=" + custId + ", customer="
				+ customer + "]";
	}
	
}
	
	
	
	
