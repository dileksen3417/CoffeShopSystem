package Test;

import java.time.LocalDate;
import java.util.Date;

import adapters.MernisServiceAdapter;
import domain.Customer;
import service.BaseCustomerService;
import service.impl.StarbucksCustomerImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer(1,"Dilek" , "Şen", "123456789", new Date(1986, 7, 15));
		BaseCustomerService customerManager = new StarbucksCustomerImpl(new MernisServiceAdapter());
		customerManager.save(customer1);
		

	}

}
