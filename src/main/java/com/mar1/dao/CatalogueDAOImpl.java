package com.mar1.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mar1.entities.Produit;

public class CatalogueDAOImpl implements ICatalogueDAO {

	private final Map<String, Produit> produits = new HashMap<String, Produit>();

	@Override
	public void addProduit(Produit p) {
		// TODO Auto-generated method stub
		this.produits.put(p.getReference(), p);
	}

	@Override
	public List<Produit> listProduits() {
		// TODO Auto-generated method stub
		return new ArrayList<>(this.produits.values());
	}

	@Override
	public Produit getProduit(String reference) {
		// TODO -generated method stub
		return this.produits.get(reference);
	}

	@Override
	public void deleteProduit(String reference) {
		this.produits.remove(reference);

	}

	@Override
	public void updateProduit(Produit p) {
		// TODO Auto-generated method stub
		this.produits.put(p.getReference(), p);
	}

	public void initiasation() {
		this.addProduit(new Produit("A12", "ABC", 800, 5, true));
		this.addProduit(new Produit("A13", "JIK", 100, 5, true));
		this.addProduit(new Produit("A14", "CXW", 50, 2, true));
	}

}
