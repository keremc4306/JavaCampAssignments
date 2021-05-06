package gameStoreServiceDemo;


import java.time.LocalDate;

public class OrderManager implements OrderService {

	@Override
	public void add(Order order) {
		System.out.println(order.getId() + " isimli siparis eklendi.");
	}

	@Override
	public void buy(Customer customer, Game game, Campaign campaign) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + 
				" isimli kullanici, " + game.getName() + " oyununu " + (campaign != null ? campaign.getName() + " kampayasindaki %" 
				+ campaign.getDiscount() + " indirim ile " + game.getPrice() * (100 - campaign.getDiscount()) / 100
				: game.getPrice()) + " fiyati üzerinden satin aldi.");

		Order order = campaign != null
		? new Order(1, customer.getId(), game.getId(), campaign.getId(), LocalDate.now())
		: new Order(1, customer.getId(), game.getId(), LocalDate.now());
		add(order);
	}
}