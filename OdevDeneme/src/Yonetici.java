import java.util.ArrayList;
import java.util.List;

public class Yonetici extends Calisanlar {
		
	private List<Isci> ekibindekiElemanlar = new ArrayList<Isci>();

	public void EkibeElemanEkle(Isci eleman) {
		this.ekibindekiElemanlar.add(eleman);
	}
	
	public List<Isci> EkiptekiElemanlariGetir() {
		return this.ekibindekiElemanlar;
	}
}
