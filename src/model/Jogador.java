package model;

import br.ufsc.inf.leobr.cliente.Jogada;

public class Jogador implements Jogada {

	protected String nome;
	protected boolean jogadarDaVez;
	protected boolean vencedor;
	protected int numeroDeVitorias;

	public Jogador(String nome){
		this.nome = nome;
		this.numeroDeVitorias = 0;
		
	}
	
	
	public void habilitar() {
		this.jogadarDaVez = true;
	}

	public boolean jogadorDaVez() {
		return this.jogadarDaVez;
	}

	public void desabilitar() {
		this.jogadarDaVez = false;
	}


	public void incrementaVitoria() {
		this.numeroDeVitorias++;
		
	}


	public int getNumeroVitorias() {
		return this.numeroDeVitorias;
	}

}