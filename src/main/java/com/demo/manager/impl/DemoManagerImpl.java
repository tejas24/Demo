package com.demo.manager.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.demo.data.entities.Company;
import com.demo.data.repositories.DemoRepository;
import com.demo.manager.DemoManager;

@Service
public class DemoManagerImpl implements DemoManager {

	private static final Logger LOG = Logger.getLogger(DemoManagerImpl.class);

	@Autowired
	private DemoRepository demoRepository;

	/*
	 * @Override public List<Company> getCompanyList() throws Exception {
	 * LOG.debug("Fetching company details"); return
	 * demoRepository.findCompanyList(); }
	 */

	@Override
	public Page<Company> getCompanyList(int page, int size) throws Exception {
		LOG.info("Fetching company details");
		return demoRepository.findAll(new PageRequest(page, size));
	}

	@Override
	public long getCompanyListCount() throws Exception {
		LOG.info("Fetching company count");
		long result = demoRepository.count();
		LOG.info("*****" + result + "*****");
		return result;
	}

	@Override
	public List<Company> getCompanyViewList() throws Exception {
		LOG.info("Fetching company count");
		List<Company> result = demoRepository.findCompanyList();
		LOG.info("*****" + result + "*****");
		return result;
	}

}
