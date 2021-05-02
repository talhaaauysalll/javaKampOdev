package Business;



public class EDevletAuthentication implements Authentication {

	private String nationalityIdentity="11111111111";
	private String firstName="Talha";
	private String lastName="UYSAL";
	private String dateTime="23.08.1998";
	@Override
	public boolean verify(String tc, String ad, String soyad, String dogumTarihi) {
		if((this.nationalityIdentity==tc)&&(this.firstName==ad)&&(this.lastName==soyad)&&(this.dateTime==dogumTarihi)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	
	
}

	

	


