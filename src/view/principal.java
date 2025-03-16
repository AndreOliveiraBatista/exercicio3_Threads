package view;

import controller.ThreadVetor;

public class principal {
	public static void main(String[] args) {
		int[] vetor = new int[1000];
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int)((Math.random()*100)+ 1);
			System.out.println();
		}
	}

}
