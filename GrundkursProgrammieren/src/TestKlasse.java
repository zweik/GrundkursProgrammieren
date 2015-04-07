public class TestKlasse {

	public GelochtePlatte lochen(MetallPlatte mp, int aL) {
		GelochtePlatte gp = new GelochtePlatte(mp.laenge, mp.breite, 10);
		for(int i = 0; i < aL; i++) {
			gp.neuesLochStanzen();
		}
		return gp;
	}
	
	public static void main(String[] args) {
		
		//Einlesen Laenge und Breite
		double laenge1 = 5;
		double breite1 = 4;
		
		double laenge2 = 2;
		double breite2 = 3.5;
		
		MetallPlatte mp1 = new MetallPlatte(laenge1, breite1);
		MetallPlatte mp2 = new MetallPlatte(laenge2, breite2);
		

		
	}

}
