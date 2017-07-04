package com.mar1.web.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.mar1.service.ICatalogueService;
import com.mar1.service.SingletonService;
import com.mar1.web.form.ProduitForm;

public class ProduitAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ICatalogueService service = SingletonService.getService();
		ProduitForm produitForm = (ProduitForm) form;
		if (produitForm != null && produitForm.getReference() != null) {
			service.addProduit(produitForm);
		}
		List<ProduitForm> produitForms = service.listProduits();
		request.getSession().setAttribute("produitForms", produitForms);

		ProduitForm produit = new ProduitForm();

		return mapping.findForward("succes");
	}

}
