package com.fati.exam.Grh.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fati.exam.Grh.entity.Departement;

@Repository
public interface DepartmentRepository extends JpaRepository<Departement, Long>{

}
