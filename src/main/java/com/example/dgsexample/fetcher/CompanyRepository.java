package com.example.dgsexample.fetcher;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.dgsexample.model.Company;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Long> {
  @Query("SELECT c.`id` AS `id`, c.`company_name` AS `company_name`, c.`domain` AS `domain`, c.`year_founded` AS `year_founded` FROM companies c WHERE c.company_name = :companyName;")
  List<Company> findByCompanyName(@Param("companyName") String companyName);

  List<Company> getCompanies();
}
