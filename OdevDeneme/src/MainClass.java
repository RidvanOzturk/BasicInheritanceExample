import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		Patron patron = new Patron();
		patron.setGunlukCalismaSaati(7);
		patron.setSaatlikUcret(150);
		System.out.println("Patronun Ayl�k maa��:" + patron.getMaas());
		
		
		Yonetici yonetici = new Yonetici();
		yonetici.setGunlukCalismaSaati(7);
		yonetici.setSaatlikUcret(100);
		System.out.println("Y�netici Ayl�k maa��:" + yonetici.getMaas());
		
		Isci isciA = new Isci();
		isciA.setGunlukCalismaSaati(10);
		isciA.setSaatlikUcret(5);
		Isci isciB = new Isci();
		isciB.setGunlukCalismaSaati(20);
		isciB.setSaatlikUcret(50);
		yonetici.EkibeElemanEkle(isciA);
		yonetici.EkibeElemanEkle(isciB);
		List<Isci> yoneticininEkibindekiler = yonetici.EkiptekiElemanlariGetir();
		System.out.println("Y�netici ekibindeki elemanlar�n maa�lar�:");
		for (Isci eleman : yoneticininEkibindekiler) {
			System.out.println(eleman.getMaas());
		}
		
		HaftalikIsci haftalikIsci1 = new HaftalikIsci();
		haftalikIsci1.setSaatlikUcret(10);
		haftalikIsci1.setGunlukCalismaSaati(8);
		System.out.println("Haftal�k i��inin haftal�k maa��:" + haftalikIsci1.getMaas());
		
		Isci isci1 = new Isci();
		isci1.setIsSuresi(5);
		isci1.setGunlukCalismaSaati(12);
		isci1.setSaatlikUcret(10);
		System.out.println("���inin Ayl�k maa��:" + isci1.getMaas());
		System.out.println(isci1.Calisma("Ta��ma")); 
		
		
		

	}



}
