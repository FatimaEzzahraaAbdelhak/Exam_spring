package com.fati.exam.Grh.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.fati.exam.Grh.entity.Departement;


public interface DepartmentService {
	List<Departement> getAllDepartemets();
	void saveDepartemet(Departement departement);
	Departement getDepartementById(long id);
	void deleteDepartementById(long id);
	Page<Departement> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
