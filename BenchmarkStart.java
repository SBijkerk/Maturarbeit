import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Event;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;

import java.math.BigInteger;


public class BenchmarkStart extends JFrame {

	private JPanel contentPane;
	
	// Primzahlen
	static long maxAnzahlPrimzahlen = 10000;
		
	// Fibonacci-Zahlen
	static int fibonacciZahl = 20;
		
	// Ackermann-Funktion
	static BigInteger base = BigInteger.valueOf(3);
	static BigInteger exp = BigInteger.valueOf(10);
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BenchmarkStart frame = new BenchmarkStart();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BenchmarkStart() {
		
		//Frame
		JFrame frame = new JFrame("Benchmark - Start");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 350);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		
		//Startbutton
		JButton startBtn = new JButton("Start Benchmark");
		startBtn.setBounds(127, 149, 146, 29);
		frame.getContentPane().add(startBtn);
		
	}
	
	public void BenchmarkDurchlauf() {
		
		//Frame
		JFrame frame2 = new JFrame("Benchmark - Test");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setSize(400, 350);
		frame2.setVisible(true);
		frame2.getContentPane().setLayout(null);
		
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
