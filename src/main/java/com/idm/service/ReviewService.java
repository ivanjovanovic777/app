package com.idm.service;

import com.idm.domain.Review;
import com.idm.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ivan on 7/2/2018.
 */
@Service
public class ReviewService {

    @Autowired
    ReviewRepository repository;

    public Review addReview(Review review) {

        repository.save(review);
        return review;
    }

    public Iterable<Review> findReviews() {

        return repository.findAll();
    }

    public Iterable<Review> findReviewsForCompany(Integer companyId) {

        return repository.findReviewsForCompany(companyId);
    }
}
