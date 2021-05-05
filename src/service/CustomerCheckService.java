package service;

import domain.Customer;

public interface CustomerCheckService {
    boolean checkIfRealPerson(Customer customer);
}
