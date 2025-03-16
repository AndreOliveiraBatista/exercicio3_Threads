package view;

import controller.ThreadVetor;

public class principal {
	public static void main(String[] args) {
		int[] vetor = new int[1000];
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int)((Math.random()*100)+ 1);
//			System.out.println("vetor " + i + " -> " + vetor[i]);
		}
		ThreadVetor t1 = new ThreadVetor(vetor, 1);
		ThreadVetor t2 = new ThreadVetor(vetor, 2);
		t1.start();
		t2.start();
	}

}
