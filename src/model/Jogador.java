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
		// TODO - implement Jogador.habilitar
		throw new UnsupportedOperationException();
	}

	public boolean jogadorDaVez() {
		return this.jogadarDaVez;
	}

	public void desabilitar() {
		
	}

}