package com.mar1.dao;

import java.util.List;

import com.mar1.entities.Produit;

public interface ICatalogueDAO {

	void addProduit(Produit p);

	List<Produit> listProduits();

	Produit getProduit(String reference);

	void deleteProduit(String reference);

	void updateProduit(Produit p);

}
