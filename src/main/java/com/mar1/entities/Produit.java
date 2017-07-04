package com.mar1.entities;

import java.io.Serializable;

public class Produit implements Serializable {

	private String reference;
	private String designation;
	private double prix;
	private int quantite;
	private boolean promo;

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getPrix() {
		return this.prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQuantite() {
		return this.quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public boolean isPromo() {
		return this.promo;
	}

	public void setPromo(boolean promo) {
		this.promo = promo;
	}

	public Produit(String reference, String designation, double prix, int quantite, boolean promo) {
		super();
		this.reference = reference;
		this.designation = designation;
		this.prix = prix;
		this.quantite = quantite;
		this.promo = promo;
	}

	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

}
