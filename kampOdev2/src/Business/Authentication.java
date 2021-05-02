package Business;



public interface Authentication {
	
	boolean verify(String tc,String ad,String soyad,String dogumTarihi);
}
