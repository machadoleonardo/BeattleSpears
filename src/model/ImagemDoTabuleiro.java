package model;

import java.lang.reflect.Array;

import br.ufsc.inf.leobr.cliente.Jogada;

public class ImagemDoTabuleiro  implements Jogada{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Array[][] posicoes;
	protected String mensagem;
	protected boolean vencedorCampanha = false;
	protected boolean movimentoAtaque = false;
	protected Jogador jogador;



	/**
	 * 
	 * @param mapa
	 */
	public void definePosicoes( Array[][] posicoes) {
		this.posicoes = posicoes;
	}

	public void setSeVencedorCampanha() {
		this.vencedorCampanha = true;
	}

	public void setSeAtaque() {
		this.movimentoAtaque = true;
	}

	/**
	 * 
	 * @param mensagem
	 */
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return this.mensagem;
	}

	public boolean getSeVencedorCampanha() {
		return this.vencedorCampanha;
	}

	public boolean getSeAtaque() {
		return this.movimentoAtaque;
	}

	public Array[][] getPosicoes() {
		return this.posicoes;
	}
	
	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

}