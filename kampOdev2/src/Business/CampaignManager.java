package Business;

import Entity.Campaign;

public class CampaignManager implements CampaignService {

	
	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" eklendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" silindi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" g?ncellendi");
		
	}

	@Override
	public void getAll(Campaign[] campaigns) {
		for(Campaign campaign:campaigns) {
			System.out.println(campaign.getCampaignName()+"'n?n ge?erlilik tarihi "+campaign.getCampaignValidityDate());
		}
	}

}
