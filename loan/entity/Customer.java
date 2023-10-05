package com.loan.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="custId")
	private Integer custId;
	
	@Column(name="custName",nullable=false,length=60)
	private String custName;
	
	@Column(name="Location",nullable=false,length=60)
	private String Location;
	
	
	private Integer roleId;
	@ManyToOne
	@JoinColumn(name="roleId",insertable=false,updatable=false)
	private Role role;
	
	private Integer statusId;
	@ManyToOne
	@JoinColumn(name="statusId",insertable=false,updatable=false)
	private Status status;
	
//	private String loanId;
//	@ManyToOne
//	@JoinColumn(name="loanId",insertable=false,updatable=false)
//	private Loan loan;
	
	@Column(name="Amount",nullable=false,length=60)
	private Integer Amount;
	
	@Column(name="loanType",nullable=false,length=60)
	private String loanType;

	public Customer(Integer custId, String custName, String location, Integer roleId, Role role, Integer statusId,
			Status status, Integer amount, String loanType) {
		super();
		this.custId = custId;
		this.custName = custName;
		Location = location;
		this.roleId = roleId;
		this.role = role;
		this.statusId = statusId;
		this.status = status;
		Amount = amount;
		this.loanType = loanType;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
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

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Integer getAmount() {
		return Amount;
	}

	public void setAmount(Integer amount) {
		Amount = amount;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", Location=" + Location + ", roleId=" + roleId
				+ ", role=" + role + ", statusId=" + statusId + ", status=" + status + ", Amount=" + Amount
				+ ", loanType=" + loanType + "]";
	}
	
	
	
}
	
	
