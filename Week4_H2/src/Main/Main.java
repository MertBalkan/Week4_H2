package Main;

import java.time.LocalDate;

import Abstracts.ICampaignService;
import Abstracts.IGameSaleService;
import Abstracts.IInformationCheckService;
import Abstracts.ILogger;
import Abstracts.IUserService;
import Concretes.CampaignManager;
import Concretes.EDevletLogger;
import Concretes.GameSaleManager;
import Concretes.InformationCheckManager;
import Concretes.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
		User user = new User(1, "Mert", "Balkan", date);
		
		Game game1 = new Game("Call of duty MW3", 150);
		Game game2 = new Game("Far Cry 5", 250);
		Game game3 = new Game("Days Gone", 300);
		
		Campaign campaign1 = new Campaign("BUY 3 GAME AND ONLY PAY 2");
		Campaign campaign2 = new Campaign("BUY 2 GAME AND OTHER ONE FREE");
		Campaign campaign3 = new Campaign("BUY 5 GAME AND 2 OF THEM FREE");
		Campaign campaign4 = new Campaign("BUY 1 GAME AND GAIN 30 TURKISH LIRAS");
		
		ILogger logger = new EDevletLogger();
		IInformationCheckService informationCheckService = new InformationCheckManager();
		IUserService userManager = new UserManager(logger, informationCheckService);
		IGameSaleService gameSaleManager = new GameSaleManager();
		ICampaignService campaignService = new CampaignManager();
		
		Campaign[] campaigns1 = {campaign1, campaign4};
		Campaign[] campaigns2 = {campaign1, campaign2, campaign3};
		Campaign[] campaigns3 = {campaign1, campaign3};
		//i sorted campaigns random its totally random do not focus there...
		
		userManager.register(user);
		userManager.update(user);
		userManager.delete(user);

		System.out.println("--------------------------");
		gameSaleManager.sellGame(game1, user, campaignService, campaigns1);
		System.out.println("--------------------------");
		gameSaleManager.sellGame(game2, user, campaignService, campaigns2);
		System.out.println("--------------------------");
		gameSaleManager.sellGame(game3, user, campaignService, campaigns3);
	}
}