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
@Table(name="LoanOfficerName")
public class LoanOfficerName {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="loanOfficerId")
	private Integer loanOfficerId;
	
	@Column(name="Name",nullable=false,length=60)
	private String Name;

	public LoanOfficerName() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoanOfficerName(Integer loanOfficerId, String name) {
		super();
		this.loanOfficerId = loanOfficerId;
		Name = name;
	}

	public Integer getLoanOfficerId() {
		return loanOfficerId;
	}

	public void setLoanOfficerId(Integer loanOfficerId) {
		this.loanOfficerId = loanOfficerId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "LoanOfficerName [loanOfficerId=" + loanOfficerId + ", Name=" + Name + "]";
	}	

	
}
