
public class Benchmark {


	static long maxAnzahlPrimzahlen = 10000;
	static int fibonacciZahl = 5;


	public static void main(String[] args) {

		//zeit starten
		long zeitStart = System.currentTimeMillis();


		//benchmark starten
		PrimzahlenBenchmark benchmark = new PrimzahlenBenchmark(maxAnzahlPrimzahlen);
		benchmark.primzahlenAusrechnen();
		FibonacciZahlen fibonacci = new FibonacciZahlen(fibonacciZahl);
		fibonacci.fibRechnung();


		//zeit stoppen
		long zeitEnde = System.currentTimeMillis();
		long zeitGesamt = zeitEnde - zeitStart;
		double sekundenZeit = ((double)zeitGesamt)/1000;

		System.out.println(sekundenZeit + " sec");

	}
}
