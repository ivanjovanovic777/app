package com.idm.web.request;

import lombok.Data;
import lombok.ToString;

/**
 * Created by Ivan on 6/19/2018.
 */
@Data
@ToString
public class CompanyRequest {

    private String name;

    private String address;

    private long pib;

    private String phone;

}
