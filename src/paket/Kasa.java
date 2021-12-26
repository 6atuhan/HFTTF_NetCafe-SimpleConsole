package paket;

public class Kasa {
	
	private double anaPara=0;

	public void setAnaPara(double anaPara) {
		this.anaPara = anaPara;
	}

	public double getAnaPara() {
		return anaPara;
	}
	
	public void paraEkle(double eklenecekPara)
	{
		anaPara +=eklenecekPara;
	}

}
