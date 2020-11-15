
public class HaftalikIsci extends Calisanlar {

	@Override
	public int getMaas() {
		return getGunlukCalismaSaati()*getSaatlikUcret()*7;
	}
}
