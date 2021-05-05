package service.impl;

import domain.Customer;
import service.CustomerCheckService;

public class CustomerCheckServiceImpl implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
