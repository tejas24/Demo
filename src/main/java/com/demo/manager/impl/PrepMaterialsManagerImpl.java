package com.demo.manager.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.data.entities.PrepMaterials;
import com.demo.data.repositories.PrepMaterialRepository;
import com.demo.manager.PrepMaterialManager;

@Service
public class PrepMaterialsManagerImpl implements PrepMaterialManager {
	
	private static final Logger LOG = Logger.getLogger(DemoManagerImpl.class);
	
	@Autowired
	private PrepMaterialRepository prepMaterialRepository;

	@Override
	public List<PrepMaterials> updatePrepMaterialsList() throws Exception {
		//return prepMaterialRepository.save(PrepMaterials);
		return null;
	}

	

}
