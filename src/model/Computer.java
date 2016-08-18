package model;

public class Computer{
	
	
	private String marka;
	private String fiyat;
	private Keyboard keyboard;
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getFiyat() {
		return fiyat;
	}
	public void setFiyat(String fiyat) {
		this.fiyat = fiyat;
	}
	public Keyboard getKeyboard() {
		return keyboard;
	}
	public void setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Computer[marka:"+marka+"fiyat:"+fiyat+"keyboard:"+keyboard+"]";
	}
	

}
