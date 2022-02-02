package com.example.dgsexample.fetcher;

import java.util.List;

import com.example.dgsexample.model.Company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
  @Autowired
  CompanyRepository companyRepository;

  public List<Company> findByCompanyName(String companyName) {
      return companyRepository.findByCompanyName(companyName);
  }

  public Company findCompanies() {
    
  }
}
