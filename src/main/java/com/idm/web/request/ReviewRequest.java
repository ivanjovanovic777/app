package com.idm.web.request;

import lombok.Data;
import lombok.ToString;

/**
 * Created by Ivan on 7/2/2018.
 */
@Data
@ToString
public class ReviewRequest {

    private int companyId;

    private String notes;

}
