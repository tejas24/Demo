package com.demo.data.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.demo.data.entities.Company;
import com.demo.data.repositories.custom.DemoRepositoryCustom;

public interface DemoRepository
		extends CrudRepository<Company, Long>, PagingAndSortingRepository<Company, Long>, DemoRepositoryCustom {

}
