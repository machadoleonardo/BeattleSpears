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
			jogador1 = new Jogador("Ronan");
			jogador2 = new Jogador("Jorge");
			
	}
	
	public void criarJogadores(String idJogador, String adversario, int posicao) {
		

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
		
	}

	public void definirOrdemInicio() {
		throw new UnsupportedOperationException();
	}

	
	public void receberLance(Tabuleiro umTab) {
		throw new UnsupportedOperationException();
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

	public Object getJogador1() {
		return this.jogador1;
	}

	public void setPartidaEmAndamento(boolean partidaEmAndamento) {
		this.partidaEmAndamento = partidaEmAndamento;
	}

}