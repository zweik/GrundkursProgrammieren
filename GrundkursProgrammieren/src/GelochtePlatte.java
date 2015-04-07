public class GelochtePlatte extends MetallPlatte{
	private int anzahlLoecher;
	private double lochLaenge;
	private double lochBreite;
	private MetallPlatte[] loch;
	
	public GelochtePlatte(double laenge, double breite, int m) {
		super(laenge, breite);
		this.loch = new MetallPlatte[m];
		this.lochLaenge = (1/m) * laenge;
		this.breite = (1/m) * breite;
	}
	
	public void neuesLochStanzen() {
		for(int i = 0; i < this.loch.length; i++) {
			if (this.loch[i] == null) {
				this.loch[i] = new MetallPlatte(this.lochLaenge, this.lochBreite);
				anzahlLoecher++;
				System.out.println("Loch erfolgreich gestanzt");
			}
			else {
				System.out.println("Loch stanzen nicht möglich");
			}
		}
	}
	
	public double flaeche() {
		double f;
		f = super.flaeche();
		return f - (this.anzahlLoecher * (this.lochLaenge * this.lochBreite));
	}
}
