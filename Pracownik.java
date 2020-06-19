public class Pracownik implements java.lang.Comparable<Pracownik>{

	private String imie;
	private String nazwisko;
	private int wiek;
	
	public String getImie() {
		return imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public int getWiek() {
		return wiek;
	}
	public void setImie(String i) {
		this.imie = i;
	}
	public void setNazwisko(String n) {
		this.nazwisko = n;
	}
	public void setWiek(int w) {
		this.wiek = w;
	}
	public Pracownik() {
		System.out.println("Wywolanie klasy Pracownik");
	}
	public String toString() {
		return "Pracownik: " + getImie() + " " + getNazwisko() + " " + getWiek() + "lat";
	}
	@Override
	public int compareTo(Pracownik o) {
		return this.getImie().compareTo(o.getImie());
	}
	
	
	
	
}
