package com.example.dgsexample.fetcher

import com.example.dgsexample.model.Company
import org.springframework.stereotype.Service

@Service
class CompanyService(val companyRepository: CompanyRepository) {

    fun findByCompanyName(companyName: String?): List<Company> {
        if (companyName != null) {
            return companyRepository.findByCompanyName(companyName);
        }

        return companyRepository.findAll();
    }
}