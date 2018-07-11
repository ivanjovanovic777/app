package com.idm.web;

import com.idm.service.ReviewService;
import com.idm.web.request.ReviewRequest;
import com.idm.web.response.ReviewResponse;
import com.idm.web.transformer.ReviewTransformer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class ReviewController {

    @Autowired
    ReviewService reviewService;

    @PostMapping("/reviews")
    ResponseEntity addReview(@RequestBody ReviewRequest reviewRequest) {

        reviewService.addReview(ReviewTransformer.toReview(reviewRequest));
        return ResponseEntity.ok().build();
    }

    @GetMapping("/reviews")
    @ResponseBody
    public List<ReviewResponse> findReviews() {

        return ReviewTransformer.toReviewResponse(reviewService.findReviews());
    }

}
