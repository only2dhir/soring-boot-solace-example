package com.devglan.soringbootsolaceexample.service;

import com.devglan.soringbootsolaceexample.model.Customer;

public interface SolaceMessageService {

    void processSolaceMessage(Customer customer);
}
