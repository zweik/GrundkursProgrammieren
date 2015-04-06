public class MetallPlatte {
	public double laenge;
	public double breite;
	
	public MetallPlatte(double laenge, double breite) {
		this.laenge = laenge;
		this.breite = breite;
	}
	
	public double flaeche() {
		return laenge * breite;
	}
	
	public boolean schwererAls(MetallPlatte p) {
		return (this.flaeche() > p.flaeche());
	}
}
