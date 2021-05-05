package service;

import domain.Customer;
import service.CustomerService;

public abstract class BaseCustomerService implements CustomerService {
    @Override
    public void save(Customer customer){
        System.out.println("DBye kayıt edildi. " + customer.getFirstName());
    }
}
