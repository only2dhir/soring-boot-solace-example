package com.devglan.soringbootsolaceexample.service.impl;

import com.devglan.soringbootsolaceexample.model.Customer;
import com.devglan.soringbootsolaceexample.service.SolaceMessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SolaceMessageServiceImpl implements SolaceMessageService {

    private static final Logger logger = LoggerFactory.getLogger(SolaceMessageServiceImpl.class);

    @Override
    public void processSolaceMessage(Customer customer) {

        logger.info(customer.getId());
    }

}
