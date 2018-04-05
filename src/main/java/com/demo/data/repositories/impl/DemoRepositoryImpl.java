package com.demo.data.repositories.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.data.entities.Company;
import com.demo.data.repositories.custom.DemoRepositoryCustom;

public class DemoRepositoryImpl implements DemoRepositoryCustom {

	@Autowired
	private EntityManager em;

	@Override
	public List<Company> findCompanyList() {
		Query query = em.createNativeQuery("SELECT * FROM dbo.Company", Company.class);
		
		query.setFirstResult(0);
		query.setMaxResults(10);
		List<Company> result = query.getResultList();
		
		
		if (CollectionUtils.isNotEmpty(result) && (null != result.get(0))) {
			return result;
		}
		return null;
	}

}
