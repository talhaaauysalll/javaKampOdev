package Entity;

public class Campaign implements Entity{
	private int id;
	private String campaignName;
	private String campaignValidityDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public String getCampaignValidityDate() {
		return campaignValidityDate;
	}
	public void setCampaignValidityDate(String campaignValidityDate) {
		this.campaignValidityDate = campaignValidityDate;
	}
}
