package com.mar1.common.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class LoginForm extends ActionForm {

	private String nomUtilisateur;
	private String mdpUtilisateur;

	public String getMdpUtilisateur() {
		return this.mdpUtilisateur;
	}

	public void setMdpUtilisateur(String mdpUtilisateur) {
		this.mdpUtilisateur = mdpUtilisateur;
	}

	public String getNomUtilisateur() {
		return this.nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.mdpUtilisateur = null;
		this.nomUtilisateur = null;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();

		if (this.nomUtilisateur == null || this.nomUtilisateur.length() == 0) {
			errors.add("nomUtilisateur", new ActionMessage("errors.required", "Name"));
		}
		if (this.mdpUtilisateur == null || this.mdpUtilisateur.length() == 0) {
			errors.add("mdpUtilisateur", new ActionMessage("errors.required", "Password"));
		}
		return errors;
	}

}
