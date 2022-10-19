package com.infinite.spring_tut2.repository;

import dto.CustomerLoginDTO;

public interface CustomerLoginRepository {
    public CustomerLoginDTO getCustomerLoginByLoginName(String loginName);

}
