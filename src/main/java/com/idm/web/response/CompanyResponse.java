package com.idm.web.response;

import java.io.Serializable;
import lombok.Data;
import lombok.ToString;

/**
 * Created by Ivan on 6/19/2018.
 */
@Data
@ToString
public class CompanyResponse implements Serializable {

    private long id;

    private String name;

    private String address;

    private long pib;

    private String phone;

}
