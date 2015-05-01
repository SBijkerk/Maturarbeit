import java.math.BigInteger;


public class Ackermann {
	
	BigInteger a;
	BigInteger b;
	
	public Ackermann(BigInteger base, BigInteger exp) {
		a = base;
		b = exp;
	}
	
	public BigInteger ackRech(BigInteger m, BigInteger n) {

			if (m.signum() == 0) {
				return n.add(BigInteger.ONE);
			}
			else if (n.signum() == 0) {
				return ackRech(m.subtract(BigInteger.ONE), BigInteger.ONE);
			}
			else {
				return ackRech(m.subtract(BigInteger.ONE), ackRech(m, n.subtract(BigInteger.ONE)));
			}
	}
	
	public void ackermannRechnung() {
		System.out.println(ackRech(a, b));
	}
}
