package com.mar1.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mar1.entities.Produit;

public class CatalogueDAOImpl implements ICatalogueDAO {

	private final Map<String, Produit> produits = new HashMap<String, Produit>();

	public void addProduit(Produit p) {
		this.produits.put(p.getReference(), p);
	}

	public List<Produit> listProduits() {
		return new ArrayList<>(this.produits.values());
	}

	public Produit getProduit(String reference) {
		return this.produits.get(reference);
	}

	public void deleteProduit(String reference) {
		this.produits.remove(reference);

	}

	public void updateProduit(Produit p) {
		this.produits.put(p.getReference(), p);
	}

	public void initiasation() {
		this.addProduit(new Produit("A12", "ABC", 800, 5, true));
		this.addProduit(new Produit("A13", "JIK", 100, 5, true));
		this.addProduit(new Produit("A14", "CXW", 50, 2, true));
	}

}
