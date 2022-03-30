package com.example.dgsexample.fetcher

import com.example.dgsexample.model.Company
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface CompanyRepository : CrudRepository<Company, Long> {
    @Query("SELECT c.id AS id, c.company_name AS company_name, c.domain AS domain, c.year_founded AS year_founded FROM companies c WHERE c.company_name = :companyName;")
    fun findByCompanyName(@Param("companyName") companyName: String): List<Company>

    @Query("SELECT c.id AS id, c.company_name AS company_name, c.domain AS domain, c.year_founded AS year_founded FROM companies c;")
    override fun findAll(): List<Company>
}