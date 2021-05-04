package Abstracts;

import Entities.Campaign;
import Entities.Game;
import Entities.User;

public interface IGameSaleService {
	void sellGame(Game game, User user, ICampaignService campaign, Campaign[] campaigns);
}