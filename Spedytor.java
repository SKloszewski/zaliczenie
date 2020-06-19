public class Spedytor extends Pracownik {

		private String znaneJezyki;
		private double doswiadczenie;
		
		public String znaneJezyki() {
			return znaneJezyki;
		}
		public double getDoswiadczenie() {
			return doswiadczenie;
		}
		public void setZnaneJezyki(String jezyki) {
			this.znaneJezyki = jezyki;
		}
		public void setDoswiadczenie(double d) {
			this.doswiadczenie = d;
		}
		
		public Spedytor() {
			System.out.println("Wywolanie klasy Spedytor");
		}
		public String toString() {
			return "To jest obiekt klasy Spedytor";
		}

}
