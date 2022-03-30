package com.example.dgsexample.fetcher

import com.example.dgsexample.model.Company
import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsQuery
import com.netflix.graphql.dgs.InputArgument

@DgsComponent
class CompanyDataFetcher(val companyService: CompanyService) {

    @DgsQuery
    fun getCompanies(@InputArgument companyName: String?): List<Company> {
        return companyService.findByCompanyName(companyName)
    }
}