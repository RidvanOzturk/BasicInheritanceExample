//subclass extends superclass
//subclass extends baseclass
//Subclass
public class Isci extends Calisanlar{

	private int isSuresi;
	

	public int getIsSuresi() {
		return isSuresi;
	}

	public void setIsSuresi(int isSuresi) {
		this.isSuresi = isSuresi;
	}
	
	public String Calisma(String is) { 
		try
		{
		    Thread.sleep(this.isSuresi*1000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		return is + " tamamlandý.";
	}
	
	
}
