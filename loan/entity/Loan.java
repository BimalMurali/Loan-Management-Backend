package com.loan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Loan")
public class Loan {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="loanId")
	private Integer loanId;
	
	@Column(name="Amount",nullable=false,length=60)
	private Integer Amount;
	
	@Column(name="Type",nullable=false,length=60)
	private String Type;

	
}
