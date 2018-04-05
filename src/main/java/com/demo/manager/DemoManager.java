package com.demo.manager;

import java.util.List;

import org.springframework.data.domain.Page;

import com.demo.data.entities.Company;
import com.demo.data.entities.PrepMaterials;

public interface DemoManager {

	public Page<Company> getCompanyList(int page, int size) throws Exception;
	
	public long getCompanyListCount() throws Exception;

	public List<Company> getCompanyViewList()throws Exception;
	
	
}
