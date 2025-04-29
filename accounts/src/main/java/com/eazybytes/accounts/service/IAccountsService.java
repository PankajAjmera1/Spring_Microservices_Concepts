package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *  Create account
     * @param customerDto -CustomerDto object
     */
    void createAccount(CustomerDto customerDto);



    /**
     * Fetch account details
     * @param mobileNumber -Input Mobile Number
     * @return Account details based on mobile number
     */
    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);
}


