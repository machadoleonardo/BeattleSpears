package model;

import br.ufsc.inf.leobr.cliente.Jogada;

public class ImagemDoTabuleiro  implements Jogada{


	private static final long serialVersionUID = 1L;
	protected Posicao[] posicoes;
	protected String mensagem;
	protected boolean vencedorCampanha = false;
	protected boolean movimentoAtaque = false;
	

	public void definePosicoes( Posicao[] posicoes) {
		this.posicoes = posicoes;
	}

	public void setSeVencedorCampanha() {
		this.vencedorCampanha = true;
	}

	public void setSeAtaque() {
		this.movimentoAtaque = true;
	}

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

	public Posicao[] getPosicoes() {
		return this.posicoes;
	}
	
}