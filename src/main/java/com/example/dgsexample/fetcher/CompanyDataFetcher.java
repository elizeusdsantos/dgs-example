package com.example.dgsexample.fetcher;

import java.util.ArrayList;
import java.util.List;

import com.example.dgsexample.model.Company;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;

import org.springframework.beans.factory.annotation.Autowired;


@DgsComponent
public class CompanyDataFetcher {



  @DgsQuery
  public List<Company> getCompanies(@InputArgument String companyName) {

    var companies = companyRepository.findByCompanyName(companyName);

    return companies;
  }
  
}
