import java.util.ArrayList;
import java.util.Collections;

public class ProgramTestowy {
	public static void main(String[] args) {
		Pracownik p1 = new Pracownik();
		p1.setImie("Sebastian");
		p1.setNazwisko("Kłoszewski");
		p1.setWiek(23);
		
		Kierowca k1 = new Kierowca();
		k1.setImie("Viktoria");
		k1.setNazwisko("Lebid");
		k1.setWiek(22);
		k1.setDoswiadczenie(6);
		k1.setKategoriaPrawaJazdy("A, B, C+E");
		
		Spedytor s1 = new Spedytor();
		s1.setImie("Robert");
		s1.setNazwisko("Więckiewicz");
		s1.setWiek(53);
		s1.setDoswiadczenie(25);
		s1.setZnaneJezyki("ang, ru, pl, de");
		
		
		// z obserwacji widać, że w momencie tworzenia obiektu najpierw wywołuje sie zawsze konstruktor klasy bazowej następnie konstruktor klasy pochodnej
		
		StworzInstancjeISortuj();
		
		Polimorfizm();
		
		
	}
	
	public static void StworzInstancjeISortuj() {
		ArrayList<Pracownik> mojaLista = new ArrayList<>();
		
		Pracownik p1 = new Pracownik();
		p1.setImie("Agnieszka");
		p1.setNazwisko("Mikulska");
		p1.setWiek(50);
		Pracownik p2 = new Pracownik();
		p2.setImie("Piotr");
		p2.setNazwisko("Sanatorski");
		p2.setWiek(33);
		Pracownik p3 = new Pracownik();
		p3.setImie("Monika");
		p3.setNazwisko("Zdziech");
		p3.setWiek(29);
		
		mojaLista.add(p1);
		mojaLista.add(p2);
		mojaLista.add(p3);
		
		Collections.sort(mojaLista);
		System.out.println("Lista posortowana malejąca według imienia pracownika: \n" + mojaLista);
		Collections.sort(mojaLista, Collections.reverseOrder());
		System.out.println("Lista posortowana rosnąco według imienia pracownika: \n" + mojaLista);
	}
	public static void Polimorfizm() {
		Pracownik p1 = new Pracownik();
		System.out.println("Zawartość metody toString():" + p1.toString());
		Pracownik p2 = new Kierowca();
		System.out.println("Zawartość metody toString():" + p2.toString());
		Pracownik p3 = new Spedytor();
		System.out.println("Zawartość metody toString():" + p3.toString());
		
		// dla każdego obiektu wywołuje jego własną metodę toString(), dzięki Polimorfizmowi klasy pochodne nadpisują metodę klasy bazowej na własną
		
	}
}
