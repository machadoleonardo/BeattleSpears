package control;

import java.lang.reflect.Array;
import java.util.*;

import model.ImagemDoTabuleiro;
import model.Jogador;
import model.Lance;
import model.Posicao;

public class Tabuleiro {

	protected  Array[][] posicoes;
	protected Jogador jogadorLocal;
	protected Jogador jogadorRemoto;
	protected boolean partidaEmAndamento;
	protected Lance ultimoLanceJogadorLocal;
	protected boolean ehVencedor;

	public Tabuleiro() {
		// TODO - implement Tabuleiro.Tabuleiro
		throw new UnsupportedOperationException();
	}

	public boolean informarConectado() {
		throw new UnsupportedOperationException();
	}

	public boolean informaSePartidaEmAndamento() {
		return this.partidaEmAndamento;
	}


	public void estabelecerConectado(boolean valor) {
		throw new UnsupportedOperationException();
	}

	public void iniciar() {
		throw new UnsupportedOperationException();
	}

	public void posicionarPecasJogadores() {
		throw new UnsupportedOperationException();
	}

	
	public void criarJogador(String idJogador, String nome) {
		throw new UnsupportedOperationException();
	}

	public void posicionarJogadores() {
		throw new UnsupportedOperationException();
	}

	public void definirOrdemInicio() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param umTab
	 */
	public void receberLance(ImagemDoTabuleiro umTab) {
		posicoes = umTab.getPosicoes();
		boolean ataque = umTab.getSeAtaque();
		
		if (ataque){
			boolean vencedor = umTab.getSeVencedorCampanha();
			int numeroDeVitorias;
			
			if(vencedor){
				
				this.jogadorRemoto.incrementaVitoria();
				numeroDeVitorias = this.jogadorRemoto.getNumeroVitorias();
				
				
				if(numeroDeVitorias == 3){
					this.finalizaPartida();
				}else{
					this.finalizaCampanha();
				}
			}
		}
		this.jogadorLocal.setJogadorDaVez(true);
			
	}

	
	public int clickJogada(int linha, int coluna, int tipoMovimento, String idJogador) {
		throw new UnsupportedOperationException();
	}

	
	public Lance informarJogada(int linha, int coluna, int movimento) {
		throw new UnsupportedOperationException();
	}

	
	public int tratarLance(int linha, int coluna, int movimento) {
		throw new UnsupportedOperationException();
	}

	public void movimentoValido(int linha, int coluna, int movimento) {
		throw new UnsupportedOperationException();
	}

	public int avaliarDistanciaMovimento() {
		throw new UnsupportedOperationException();
	}

	
	public void estabeleceMovimento(int linha, int coluna) {
		throw new UnsupportedOperationException();
	}

	public boolean verificaPosicaoOponenteOcupada(Posicao pos) {
		throw new UnsupportedOperationException();
	}

	public void finalizaCampanha() {
		throw new UnsupportedOperationException();
	}

	
	public Jogador defineJogadorVencedor(String idJogador) {
		throw new UnsupportedOperationException();
	}

	public void iniciarNovaCapampanha() {
		throw new UnsupportedOperationException();
	}

	public boolean avaliaVencedor(Tabuleiro tab) {
		throw new UnsupportedOperationException();
	}

	public void criarPosicoes() {
		throw new UnsupportedOperationException();
	}

	public void operation() {
		throw new UnsupportedOperationException();
	}

	public void finalizaPartida() {
		// TODO - implement Tabuleiro.finalizaPartida
		throw new UnsupportedOperationException();
	}

	public void setPartidaEmAndamento(boolean partidaEmAndamento) {
		this.partidaEmAndamento = partidaEmAndamento;
	}

}