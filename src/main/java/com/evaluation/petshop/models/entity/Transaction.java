package com.evaluation.petshop.models.entity;

import com.evaluation.petshop.models.enums.TransactionStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "transactions")
@Data
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transaction_id")
	private int transactionId;
	@Column(name = "transaction_date")
    private String transactionDate;
    private double amount;
    
    //used to specify how an enum type is mapped to a database column
    @Enumerated(EnumType.STRING)
    @Column(name="transaction_status")
    private TransactionStatus transactionStatus;
    
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    
    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
    
    
}
