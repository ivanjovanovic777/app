package com.idm.repository;

import com.idm.domain.Review;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Ivan on 7/2/2018.
 */
@Repository
public interface ReviewRepository extends CrudRepository<Review, Integer> {

    @Query("SELECT r FROM Review r WHERE r.company.id = :companyId")
    List<Review> findReviewsForCompany(@Param("companyId") Integer companyId);

}
