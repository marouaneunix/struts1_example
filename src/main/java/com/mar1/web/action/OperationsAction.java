package com.mar1.web.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class OperationsAction extends DispatchAction {

	public ActionForward ajouter(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		System.out.println("Appel de la methode ajouter()");
		return mapping.findForward("succes");
	}

	public ActionForward modifier(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		System.out.println("Appel de la methode modifier()");
		return mapping.findForward("succes");
	}

	public ActionForward supprimer(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		System.out.println("Appel de la methode supprimer()");
		return mapping.findForward("succes");
	}

}
