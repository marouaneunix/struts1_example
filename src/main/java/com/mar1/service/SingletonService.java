package com.mar1.service;

import org.dozer.DozerBeanMapper;

import com.mar1.dao.CatalogueDAOImpl;

public class SingletonService {

	private static CatalogueServiceImpl service;

	static {
		CatalogueDAOImpl dao = new CatalogueDAOImpl();
		DozerBeanMapper mapper = new DozerBeanMapper();
		dao.initiasation();
		service = new CatalogueServiceImpl();
		service.setDao(dao);
		service.setMapper(mapper);
	}

	public static CatalogueServiceImpl getService() {
		return service;
	}

}
