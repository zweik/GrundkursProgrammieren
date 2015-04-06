public class GelochtePlatte extends MetallPlatte{
	private int anzahlLoecher;
	private double lochLaenge;
	private double lochBreite;
	private MetallPlatte[] loch;
	
	public GelochtePlatte(double laenge, double breite, int m) {
		super(laenge, breite);
		this.loch = new MetallPlatte[m];
		this.lochLaenge = 1/m;
		this.breite = 1/m;
	}
	
	public void neuesLochStanzen() {
		if (anzahlLoecher < loch.length) {
			
		}
	}
}
