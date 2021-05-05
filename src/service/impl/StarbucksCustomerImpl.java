package service.impl;

import domain.Customer;
import service.BaseCustomerService;
import service.CustomerCheckService;

public class StarbucksCustomerImpl extends BaseCustomerService {
    CustomerCheckService customerCheckService;

    public StarbucksCustomerImpl(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer){
        if(customerCheckService.checkIfRealPerson(customer)){
            super.save(customer);
        } else {
            try {
                throw new Exception("Not a valid person");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
