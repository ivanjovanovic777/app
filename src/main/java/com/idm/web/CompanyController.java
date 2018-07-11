package com.idm.web;

import com.idm.service.CompanyService;
import com.idm.service.ReviewService;
import com.idm.web.request.CompanyRequest;
import com.idm.web.response.CompanyResponse;
import com.idm.web.response.ReviewResponse;
import com.idm.web.transformer.CompanyTransformer;
import com.idm.web.transformer.ReviewTransformer;
import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class CompanyController {

    @Autowired
    CompanyService companyService;

    @Autowired
    ReviewService reviewService;

    @PostMapping("/companies")
    ResponseEntity addCompany(@RequestBody CompanyRequest companyRequest) {

        companyService.addCompany(CompanyTransformer.toCompany(companyRequest));
        return ResponseEntity.ok().build();
    }

    @GetMapping("/companies")
    @ResponseBody
    public List<CompanyResponse> findCompanies() {

        return CompanyTransformer.toCompanyResponse(companyService.findCompanies());
    }

    @GetMapping("/companies/{companyId}/reviews")
    @ResponseBody
    public List<ReviewResponse> findReviews(@PathVariable("companyId") Integer companyId) {

        return ReviewTransformer.toReviewResponse(reviewService.findReviewsForCompany(companyId));
    }

}
