package controller;

public class ThreadVetor extends Thread{
	
	private int[] vetor ;
	private int n;
	 
	public ThreadVetor(int[] vetor, int n) {
		this.vetor = vetor;
		this.n = n;
	}
	
	@Override
	public void run() {
		calc();
	}

	private void calc() {
		int resto = n % 2;
		if(resto == 0) {
			double TI0 = System.nanoTime();
				for (int i = 0 ; i < vetor.length; i++) {}
			double Tf0 = System.nanoTime();
			double TT0 = (Tf0 - TI0)/(Math.pow(10, 9));
			System.out.println(" Valor numérico par: \n vetor percorrido com for\n tempo total: "+ TT0 + " .s");
		}else {
			double TI0 = System.nanoTime();
				for (int i : vetor) {}
			double Tf0 = System.nanoTime();
			double TT0 = (Tf0 - TI0)/(Math.pow(10, 9));
			System.out.println(" Valor numérico par: \n vetor percorrido com for\n tempo total: "+ TT0 + " .s");
		}
	}
}
