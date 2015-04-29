
public class FibonacciZahlen {

	int count = 0;
	int k;

	public FibonacciZahlen(int fibonacciZahl){
		k = fibonacciZahl;
	}

	public void fibRechnung(){
		System.out.println("fib(" + k + ") = " + fibonacciRech(k));
		System.out.println("wurde " + count + "-Mal aufgerufen");
	}

	public int fibonacciRech(int n) {
		int resultat = n;

		if (n > 1) {
			resultat = fibonacciRech(n-1) + fibonacciRech(n-2);
		}
		else if (n == 1) {
			resultat = 1;
		}
		else {
			resultat = 0;
		}
		count = count + 1;
		return resultat;
	}
}

