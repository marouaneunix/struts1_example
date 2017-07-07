package com.mar1.web.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.actions.DispatchAction;

import com.mar1.service.ICatalogueService;
import com.mar1.service.SingletonService;
import com.mar1.web.form.ProduitForm;

public class ProduitAction extends DispatchAction {
	private ICatalogueService service;

	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ProduitForm produitForm = (ProduitForm) form;
		if (produitForm != null && produitForm.getReference() != null) {
			service.addProduit(produitForm);
		}
		List<ProduitForm> produitForms = service.listProduits();
		request.getSession().setAttribute("produitForms", produitForms);

		return mapping.findForward("succes");
	}
	
	
	public ProduitAction() {
		 this.service = SingletonService.getService();
	}

	public ActionForward ajouter(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		
		System.out.println("Appel de la methode ajouter()");
		return mapping.findForward("succes");
	}

	public ActionForward modifier(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		DynaActionForm daf = (DynaActionForm)form;
	    String reference = (String)daf.get("reference");
	    ProduitForm produit = new ProduitForm();//this.service.getProduit(reference);
	  //  produit.
		System.out.println("Appel de la methode modifier()");
		return mapping.findForward("succes");
	}

	public ActionForward supprimer(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		DynaActionForm daf = (DynaActionForm)form;
	     String reference = (String)daf.get("reference");
		
		this.service.deleteProduit(reference);
		List<ProduitForm> produitForms = service.listProduits();
		request.getSession().setAttribute("produitForms", produitForms);
		//request.getSession().setAttribute("produitForms", produitForms);
		System.out.println("Appel de la methode supprimer()");
		return mapping.findForward("succes");
	}

}
