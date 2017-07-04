package com.mar1.service;

import java.util.List;
import java.util.stream.Collectors;

import org.dozer.DozerBeanMapper;

import com.mar1.dao.ICatalogueDAO;
import com.mar1.entities.Produit;
import com.mar1.web.form.ProduitForm;

public class CatalogueServiceImpl implements ICatalogueService {

	private ICatalogueDAO dao;
	private DozerBeanMapper mapper;

	public void setDao(ICatalogueDAO dao) {
		this.dao = dao;
	}

	public void setMapper(DozerBeanMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public void addProduit(ProduitForm p) {
		// TODO Auto-generated method stub
		this.dao.addProduit(this.mapper.map(p, Produit.class));
	}

	@Override
	public List<ProduitForm> listProduits() {
		// TODO Auto-generated method stub
		return this.dao.listProduits().stream().map(produit -> this.mapper.map(produit, ProduitForm.class))
				.collect(Collectors.toList());
	}

	@Override
	public ProduitForm getProduit(String reference) {
		// TODO Auto-generated method stub
		return this.mapper.map(this.dao.getProduit(reference), ProduitForm.class);
	}

	@Override
	public void deleteProduit(String reference) {
		// TODO Auto-generated method stub
		this.dao.deleteProduit(reference);
	}

	@Override
	public void updateProduit(ProduitForm p) {
		// TODO Auto-generated method stub
		this.dao.updateProduit(this.mapper.map(p, Produit.class));
	}

}
