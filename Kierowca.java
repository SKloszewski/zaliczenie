public class Kierowca extends Pracownik{

	private String kategoriaPrawaJazdy;
	private double doswiadczenie;
	
	public String getKategoriaPrawaJazdy() {
		return kategoriaPrawaJazdy;
	}
	public double getDoswiadczenie() {
		return doswiadczenie;
	}
	public void setKategoriaPrawaJazdy(String kat) {
		this.kategoriaPrawaJazdy = kat;
	}
	public void setDoswiadczenie(double d) {
		this.doswiadczenie = d;
	}
	
	public Kierowca() {
		System.out.println("Wywolanie klasy Kierowca");
	}
	public String toString() {
		return "To jest obiekt klasy Kierowca";
	}
}
