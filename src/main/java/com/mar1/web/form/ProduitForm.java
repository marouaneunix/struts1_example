package com.mar1.web.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class ProduitForm extends ActionForm {

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

	public ProduitForm() {
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

	public ProduitForm(String reference, String designation, double prix, int quantite, boolean promo) {
		super();
		this.reference = reference;
		this.designation = designation;
		this.prix = prix;
		this.quantite = quantite;
		this.promo = promo;
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.reference = null;
		this.designation = null;
		this.prix = 0.0;
		this.promo = false;
		this.quantite = 0;

	}

	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
		ActionErrors errors = new ActionErrors();

		if (this.prix < 0) {
			errors.add("prix", new ActionMessage("erreur.nomutilisateur.obligatoire"));
		}
		if (this.quantite < 0) {
			errors.add("quantite", new ActionMessage("erreur.nomutilisateur.obligatoire"));
		}

		return errors;

	}

}
