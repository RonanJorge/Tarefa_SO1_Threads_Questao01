package controller;

public class ThreadVetor extends Thread{
	private int n;
	private int[] vetor;
	
	public ThreadVetor(int n, int[] vetor) {
		this.n = n;
		this.vetor = vetor;
	}
	
	@Override
	public void run() {
		if(n % 2 == 0) {
			double tempoInicial = System.nanoTime();
			for(int i = 0; i < vetor.length; i++) {
				vetor[i] = i;
			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			System.out.println("Tempo total com for     = "+tempoTotal+" nanossegundos = "+tempoTotal/Math.pow(10, 9)+" segundos.");
		}
		else {
			double tempoInicial = System.nanoTime();
			for(int i: vetor) {
				vetor[i] = i;
			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			System.out.println("Tempo total com forEach = "+tempoTotal+" nanossegundos = "+tempoTotal/Math.pow(10, 9)+" segundos.");
		}
		
	}
}
