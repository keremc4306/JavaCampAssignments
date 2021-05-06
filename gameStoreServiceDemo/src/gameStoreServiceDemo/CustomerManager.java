package gameStoreServiceDemo;


public class CustomerManager implements CustomerService {
	CustomerCheckService cstCheckService;
	
	public CustomerManager(CustomerCheckService cstCheckService) {
		this.cstCheckService = cstCheckService;
	}

	@Override
	public void add(Customer customer) throws Exception {
		if (!cstCheckService.CheckIfRealPerson(customer))
			throw new Exception("Not a valid");
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " isimli musteri kayit oldu.");
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " isimli musteri guncellendi.");	
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " isimli musteri silindi.");
	}
}