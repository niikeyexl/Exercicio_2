package view;

import controller.ThreadController;

public class Principal {
	
	public static void main(String[] args) {
		int [][]matriz = new int [3][5];
		for (int i = 0 ; i < 3 ; i++) {
			for (int j = 0 ; j < 5 ; j++) {
				matriz[i][j] = (int) (Math.random() * 99); 
			}
		}
		for (int threadId = 0; threadId < 3; threadId++) {
			new ThreadController(threadId, matriz[threadId]).start();
		}
	}
}