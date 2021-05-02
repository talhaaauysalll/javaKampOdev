package Business;

import Entity.Campaign;

public interface CampaignService {
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);
	void getAll(Campaign[] campaigns);
}
