package org.perso.spring.model;

public class Loisir {

	private String loisir;
	private String date;
	
	public Loisir(String loisir, String date) {
		super();
		this.loisir = loisir;
		this.date = date;
	}

	public Loisir() {
		super();
	}

	public String getloisir() {
		return loisir;
	}

	public void setloisir(String loisir) {
		this.loisir = loisir;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Competence : " + loisir + ", Date : " + date + ".";
	}

}