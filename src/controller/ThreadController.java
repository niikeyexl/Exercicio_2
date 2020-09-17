package controller;

public class ThreadController extends Thread {
	private int id;
	private int vetor[];
	public ThreadController(int id, int vetor[]) {
		this.id = id;
		this.vetor = vetor;
	}
	@Override
	public void run() {
		int aux = 0;
		for(int i = 0 ; i < 5; i++) {
			aux = aux + vetor[i];
		}
		System.out.println("O valor somado da " + (id + 1) + "º linha é " + aux);
	}
}
