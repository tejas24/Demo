package com.demo.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.configs.MyConfig;
import com.demo.data.entities.Company;
import com.demo.manager.DemoManager;

@RefreshScope
@RestController
@RequestMapping("/api/v1")
public class DemoControllerV1 {

	private static final Logger LOG = Logger.getLogger(DemoControllerV1.class);

	@Autowired
	private DemoManager demoManager;
	


	@Autowired
	private MyConfig myConfig;

	@RequestMapping(value = "/company/page/{page}/size/{size}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ResponseEntity<Page<Company>> getCompanyDetails(@PathVariable("page") int page,@PathVariable("size") int size) throws Exception {
		LOG.info("REST call to get company details");

		//int page = myConfig.getPage();
		//int size = myConfig.getSize();
		Page<Company> result = demoManager.getCompanyList(page, size);
		if (result == null) {
			throw new Exception("Unable to fetch comapany details");
		}
		return new ResponseEntity<Page<Company>>(result, HttpStatus.OK);
	}

	@RequestMapping(value = "/company/view", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ResponseEntity<List<Company>> getCompanyViewDetails() throws Exception {
		LOG.info("REST call to get company view details");

		List<Company> result = demoManager.getCompanyViewList();
		if (result == null) {
			throw new Exception("Unable to fetch comapany view details ");
		}
		return new ResponseEntity<List<Company>>(result, HttpStatus.OK);
	}

	@RequestMapping(value = "/company/count", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody long getCompanyDetailsCount() throws Exception {
		LOG.info("REST call to get company count");
		long result = demoManager.getCompanyListCount();
		/*
		 * if (result == null) { throw new
		 * Exception("Unable to fetch comapany details "); }
		 */
		return result;
	}

}
