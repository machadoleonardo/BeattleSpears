package model;

import br.ufsc.inf.leobr.cliente.Jogada;

public class ImagemDoTabuleiro  implements Jogada{

	protected int posicoes;
	protected String mensagem;
	protected boolean vencedorCampanha = false;
	protected boolean movimentoAtaque = false;

	/**
	 * 
	 * @param mapa
	 */
	public void definePosicoes(int mapa) {
		// TODO - implement ImagemDoTabuleiro.definePosicoes
		throw new UnsupportedOperationException();
	}

	public void setSeVencedorCampanha() {
		// TODO - implement ImagemDoTabuleiro.setSeVencedorCampanha
		throw new UnsupportedOperationException();
	}

	public void setSeAtaque() {
		// TODO - implement ImagemDoTabuleiro.setSeAtaque
		throw new UnsupportedOperationException();
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
		// TODO - implement ImagemDoTabuleiro.getSeVencedorCampanha
		throw new UnsupportedOperationException();
	}

	public boolean getSeAtaque() {
		// TODO - implement ImagemDoTabuleiro.getSeAtaque
		throw new UnsupportedOperationException();
	}

	public int getPosicoes() {
		return this.posicoes;
	}

}