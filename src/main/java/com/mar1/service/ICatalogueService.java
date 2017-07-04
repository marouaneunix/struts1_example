package com.mar1.service;

import java.util.List;

import com.mar1.web.form.ProduitForm;

public interface ICatalogueService {

	void addProduit(ProduitForm p);

	List<ProduitForm> listProduits();

	ProduitForm getProduit(String reference);

	void deleteProduit(String reference);

	void updateProduit(ProduitForm p);

}
