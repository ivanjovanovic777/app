package com.idm.web.transformer;

import com.idm.domain.Company;
import com.idm.domain.Review;
import com.idm.web.request.ReviewRequest;
import com.idm.web.response.ReviewResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan on 7/2/2018.
 */
public class ReviewTransformer {


    public static Review toReview(ReviewRequest reviewRequest) {

        Review review = new Review();
        review.setCompany(new Company(reviewRequest.getCompanyId()));
        review.setNotes(reviewRequest.getNotes());
        return review;
    }

    public static List<ReviewResponse> toReviewResponse(Iterable<Review> reviews) {

        List<ReviewResponse> result = new ArrayList<>();

        for (Review review : reviews) {
            ReviewResponse reviewResponse = new ReviewResponse();
            reviewResponse.setId(review.getId());
            reviewResponse.setNotes(review.getNotes());
            result.add(reviewResponse);
        }

        return result;
    }
}
