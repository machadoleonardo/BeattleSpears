package model;

import br.ufsc.inf.leobr.cliente.Jogada;

public class Lance implements Jogada {

	protected Jogador jogador;
	protected int tipoMovimento;
	protected int linha;
	protected int coluna;

	/**
	 * 
	 * @param linha
	 * @param coluna
	 * @param movimento
	 */
	public void assumirPosicao(int linha, int coluna, int movimento) {
		// TODO - implement Lance.assumirPosicao
		throw new UnsupportedOperationException();
	}

	public int informaLinha() {
		// TODO - implement Lance.informaLinha
		throw new UnsupportedOperationException();
	}

	public int informarColuna() {
		// TODO - implement Lance.informarColuna
		throw new UnsupportedOperationException();
	}

	public void informaTipoMovimento() {
		// TODO - implement Lance.informaTipoMovimento
		throw new UnsupportedOperationException();
	}

}