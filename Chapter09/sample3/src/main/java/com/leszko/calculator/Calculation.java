package com.leszko.calculator;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/** Calculation entity class. */
@Entity
public class Calculation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String a;

	private String b;

	private String result;

	private String sum;
	
	private String div;

	private Timestamp createdAt;

	protected Calculation() {
	}

	public Calculation(String a, String b, String sum, String div, Timestamp createdAt) {
		this.a = a;
		this.b = b;
		this.sum = sum;
		this.div = div;
		this.result = sum;
		this.result = div
		this.createdAt = createdAt;
	}

	public String getSum() {
		return sum != null ? sum : result;
	}
	public String getDiv() {
		return div != null ? div : result;
	}
}
