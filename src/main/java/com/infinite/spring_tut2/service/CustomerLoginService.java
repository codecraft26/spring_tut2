package com.infinite.spring_tut2.service;

import com.hnd.infinite.Exception.HnDBankException;
import dto.CustomerLoginDTO;

public interface CustomerLoginService {
    public String authenticateCustomer(CustomerLoginDTO customerLogin) throws HnDBankException;

}
