import java.math.BigInteger;


public class Benchmark {

	// Primzahlen
	static long maxAnzahlPrimzahlen = 10000;
	
	// Fibonacci-Zahlen
	static int fibonacciZahl = 20;
	
	// Ackermann-Funktion
	static BigInteger base = BigInteger.valueOf(3);
	static BigInteger exp = BigInteger.valueOf(10);


	public static void main(String[] args) {

		//zeit starten
		long zeitStart = System.currentTimeMillis();


		//benchmark starten
		PrimzahlenBenchmark prim = new PrimzahlenBenchmark(maxAnzahlPrimzahlen);
		prim.primzahlenAusrechnen();
		FibonacciZahlen fib = new FibonacciZahlen(fibonacciZahl);
		fib.fibRechnung();
		Ackermann ack = new Ackermann(base, exp);
		ack.ackermannRechnung();

		
		//zeit stoppen
		long zeitEnde = System.currentTimeMillis();
		long zeitGesamt = zeitEnde - zeitStart;
		double sekundenZeit = ((double)zeitGesamt)/1000;

		System.out.println(sekundenZeit + " sec");

	}
}
