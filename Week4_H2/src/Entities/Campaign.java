package Entities;

public class Campaign {
	
	private String campaignName;
	
	public Campaign(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
}