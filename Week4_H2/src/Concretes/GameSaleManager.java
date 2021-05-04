package Concretes;

import Abstracts.ICampaignService;
import Abstracts.IGameSaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class GameSaleManager implements IGameSaleService{

	@Override
	public void sellGame(Game game, User user, ICampaignService campaignService, Campaign[] campaigns) {
		
		System.out.println(game.getGameName() + " has been purchased by " + user.getFirstName() + " price: " + game.getGamePrice());
		
		for(Campaign campaign : campaigns) 
			campaignService.addCampaign(campaign);
	}
}