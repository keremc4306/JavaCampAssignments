package gameStoreServiceDemo;


public interface OrderService {
	void add(Order order);
	void buy(Customer customer, Game game, Campaign campaign);
}