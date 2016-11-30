package model;

import br.ufsc.inf.leobr.cliente.Jogada;

public class Posicao implements Jogada {

	protected Jogador ocupante;
	protected boolean ocupada;
	
	public Posicao(){
		this.ocupante = null;
		this.ocupada = false;
	}
	public Jogador getOcupante() {
		return ocupante;
	}
	public boolean isOcupada() {
		return ocupada;
	}
	public void setOcupante(Jogador ocupante) {
		this.ocupante = ocupante;
	}
	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

}