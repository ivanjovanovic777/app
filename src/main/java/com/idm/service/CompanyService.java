package com.idm.service;

import com.idm.domain.Company;
import com.idm.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public Company addCompany(Company company) {

        companyRepository.save(company);
        return company;
    }

    public Iterable<Company> findCompanies() {

        return companyRepository.findAll();
    }

}
