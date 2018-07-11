package com.idm.web.transformer;

import com.idm.domain.Company;
import com.idm.web.request.CompanyRequest;
import com.idm.web.response.CompanyResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan on 6/19/2018.
 */
public class CompanyTransformer {

    public static List<CompanyResponse> toCompanyResponse(Iterable<Company> companies) {

        List<CompanyResponse> companyResponses = new ArrayList<>();

        for (Company company : companies) {

            CompanyResponse companyResponse = new CompanyResponse();
            companyResponse.setId(company.getId());
            companyResponse.setName(company.getName());
            companyResponse.setAddress(company.getAddress());
            companyResponse.setPib(company.getPib());
            companyResponse.setPhone(company.getPhone());

            companyResponses.add(companyResponse);
        }

        return companyResponses;
    }

    public static Company toCompany(CompanyRequest companyRequest) {

        Company company = new Company();

        company.setName(companyRequest.getName());
        company.setPhone(companyRequest.getPhone());
        company.setPib(companyRequest.getPib());
        company.setAddress(companyRequest.getAddress());

        return company;
    }

}
