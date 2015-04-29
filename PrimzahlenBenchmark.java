
public class PrimzahlenBenchmark {

	long limit;

	public PrimzahlenBenchmark(long maxAnzahlPrimzahlen) {
		limit = maxAnzahlPrimzahlen;
	}

	public void primzahlenAusrechnen() {
		
		for (long x=2; x<=limit; x++) {
			if (istPrimzahl(x)) { 
				System.out.println(x + " ist eine Primzahl.");
			}
		}
	}

	public boolean istPrimzahl(long x) {

		for (int j=2; j<x; j++) {
			if(x % j == 0) {
				return false;
			}
		}
		return true;

	}
}

