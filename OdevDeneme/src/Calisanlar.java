




//Superclass
public class Calisanlar {
	private int gunlukCalismaSaati;
	private int saatlikUcret;
	private int maas;
	
	
	public int getGunlukCalismaSaati() {
		return gunlukCalismaSaati;
	}

	public void setGunlukCalismaSaati(int gunlukCalismaSaati) {
		this.gunlukCalismaSaati = gunlukCalismaSaati;
	}

	public int getSaatlikUcret() {
		return saatlikUcret;
	}

	public void setSaatlikUcret(int saatlikUcret) {
		this.saatlikUcret = saatlikUcret;
	}

	public int getMaas() {
		return gunlukCalismaSaati*saatlikUcret*30;
	}

	

}
