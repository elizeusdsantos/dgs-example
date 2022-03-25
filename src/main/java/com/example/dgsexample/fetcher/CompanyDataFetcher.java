package com.example.dgsexample.fetcher;

import com.example.dgsexample.model.Company;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;

import java.util.List;


@DgsComponent
public class CompanyDataFetcher {

    private final CompanyRepository companyRepository;

    public CompanyDataFetcher(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @DgsQuery
    public List<Company> getCompanies(@InputArgument String companyName) {

        var companies = companyRepository.findByCompanyName(companyName);

        return companies;
    }

}
