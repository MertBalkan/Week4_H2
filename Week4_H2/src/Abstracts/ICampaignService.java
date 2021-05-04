package Abstracts;

import Entities.Campaign;

public interface ICampaignService {
	
	void addCampaign(Campaign campaign);
	void updateCampaign(Campaign campaign);
	void deleteCampaign(Campaign campaign);
}