package control;

import java.util.*;

import br.ufsc.inf.leobr.cliente.Jogada;
import model.Jogador;
import model.Posicao;
import model.Lance;

public class Tabuleiro implements Jogada {

	protected Collection<Posicao> posicoes;
	protected Jogador jogador1;
	protected Jogador jogador2;
	protected boolean partidaEmAndamento;
	protected Lance ultimoLanceJogador1;
	protected Lance ultimoLanceJogador2;
	protected boolean ehVencedor;

	public Tabuleiro() {
			this.posicoes = new ArrayList<Posicao>();
	}

	public boolean informarConectado() {
		// TODO - implement Tabuleiro.informarConectado
		throw new UnsupportedOperationException();
	}

	public boolean informaSePartidaEmAndamento() {
		// TODO - implement Tabuleiro.informaSePartidaEmAndamento
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param valor
	 */
	public void estabelecerConectado(boolean valor) {
		// TODO - implement Tabuleiro.estabelecerConectado
		throw new UnsupportedOperationException();
	}

	public void iniciar() {
		// TODO - implement Tabuleiro.iniciar
		throw new UnsupportedOperationException();
	}

	public void posicionarPecasJogadores() {
		// TODO - implement Tabuleiro.posicionarPecasJogadores
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idJogador
	 * @param nome
	 */
	public void criarJogador(String idJogador, String nome) {
		// TODO - implement Tabuleiro.criarJogador
		throw new UnsupportedOperationException();
	}

	public void posicionarJogadores() {
		// TODO - implement Tabuleiro.posicionarJogadores
		throw new UnsupportedOperationException();
	}

	public void definirOrdemInicio() {
		// TODO - implement Tabuleiro.definirOrdemInicio
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param umTab
	 */
	public void receberLance(Tabuleiro umTab) {
		// TODO - implement Tabuleiro.receberLance
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param linha
	 * @param coluna
	 * @param tipoMovimento
	 * @param idJogador
	 */
	public int clickJogada(int linha, int coluna, int tipoMovimento, String idJogador) {
		// TODO - implement Tabuleiro.clickJogada
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param linha
	 * @param coluna
	 * @param movimento
	 */
	public Lance informarJogada(int linha, int coluna, int movimento) {
		// TODO - implement Tabuleiro.informarJogada
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param linha
	 * @param coluna
	 * @param movimento
	 */
	public int tratarLance(int linha, int coluna, int movimento) {
		// TODO - implement Tabuleiro.tratarLance
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param linha
	 * @param coluna
	 * @param movimento
	 */
	public void movimentoValido(int linha, int coluna, int movimento) {
		// TODO - implement Tabuleiro.movimentoValido
		throw new UnsupportedOperationException();
	}

	public int avaliarDistanciaMovimento() {
		// TODO - implement Tabuleiro.avaliarDistanciaMovimento
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param linha
	 * @param coluna
	 */
	public void estabeleceMovimento(int linha, int coluna) {
		// TODO - implement Tabuleiro.estabeleceMovimento
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pos
	 */
	public boolean verificaPosicaoOponenteOcupada(Posicao pos) {
		// TODO - implement Tabuleiro.verificaPosicaoOponenteOcupada
		throw new UnsupportedOperationException();
	}

	public void finalizaCampanha() {
		// TODO - implement Tabuleiro.finalizaCampanha
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idJogador
	 */
	public Jogador defineJogadorVencedor(String idJogador) {
		// TODO - implement Tabuleiro.defineJogadorVencedor
		throw new UnsupportedOperationException();
	}

	public void iniciarNovaCapampanha() {
		// TODO - implement Tabuleiro.iniciarNovaCapampanha
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param tab
	 */
	public boolean avaliaVencedor(Tabuleiro tab) {
		// TODO - implement Tabuleiro.avaliaVencedor
		throw new UnsupportedOperationException();
	}

	public void criarPosicoes() {
		// TODO - implement Tabuleiro.criarPosicoes
		throw new UnsupportedOperationException();
	}

	public void operation() {
		// TODO - implement Tabuleiro.operation
		throw new UnsupportedOperationException();
	}

	public Object getJogador1() {
		return this.jogador1;
	}

}