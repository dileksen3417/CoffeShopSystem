package adapters;

import java.rmi.RemoteException;

import domain.Customer;
import service.CustomerCheckService;
import tr.gov.nvi.tckimlik.WS.*;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false; 
		try {
			result = soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
												  customer.getFirstName().toUpperCase(), 
												  customer.getLastName().toUpperCase(),
												  customer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
