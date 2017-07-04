package com.mar1.common.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.mar1.common.form.LoginForm;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String resultat = "echec";
		String nomUtilisateur = ((LoginForm) form).getNomUtilisateur();
		String mdpUtilisateur = ((LoginForm) form).getMdpUtilisateur();

		if (nomUtilisateur.equals("mar1") && mdpUtilisateur.equals("azerty")) {
			resultat = "succes";
		}
		return mapping.findForward(resultat);
	}
}
