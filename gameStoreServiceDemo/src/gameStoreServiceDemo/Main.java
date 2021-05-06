package gameStoreServiceDemo;


import java.time.LocalDate;

public class Main {

	public static void main(String[] args) throws Exception {
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer(1, "mkcandangil@gmail.com", "camaroqual4342", "Mehmet Kerem", 
				"Candangil", "keremc4306", LocalDate.of(1997, 1, 1), "16085567086");
		customerManager.add(customer);

		GameManager gameManager = new GameManager();
		Game game = new Game(1, "GTA 5", 106.90);
		gameManager.add(game);

		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign = new Campaign(1, "Ogrenci", (byte) 25, true);
		campaignManager.add(campaign);

		OrderManager orderManager = new OrderManager();
		orderManager.buy(customer, game, campaign);
	}
}