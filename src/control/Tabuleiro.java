package control;

import br.ufsc.inf.leobr.cliente.Jogada;

import model.ImagemDoTabuleiro;
import model.Jogador;
import model.Lance;
import model.Posicao;

public class Tabuleiro implements Jogada {

	protected Posicao[][] posicoes;
	protected Jogador jogadorLocal;
	protected Jogador jogadorRemoto;
	protected boolean partidaEmAndamento;
	protected Lance ultimoLanceJogadorLocal;
	protected boolean ehVencedor;

	public Tabuleiro() {
		this.posicoes = new Posicao[2][3];

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

	public void posicionarJogadores() {

	}

	public void definirOrdemInicio() {
		throw new UnsupportedOperationException();
	}

	public void receberLance(ImagemDoTabuleiro umTab) {
		this.posicoes = umTab.getPosicoes();
		boolean ataque = umTab.getSeAtaque();

		if (ataque) {
			boolean vencedor = umTab.getSeVencedorCampanha();
			int numeroDeVitorias;

			if (vencedor) {
				this.jogadorRemoto.incrementaVitoria();
				numeroDeVitorias = this.jogadorRemoto.getNumeroVitorias();

				if (numeroDeVitorias == 3) {
					this.finalizaPartida();
				} else {
					this.finalizaCampanha();
				}
			}
		}
		this.getJogadorLocal().habilitar();
	}

	public void finalizaPartida() {
		// TODO Auto-generated method stub

	}

	public int clickJogada(int linha, int coluna, int tipoMovimento, String idJogador) {
		throw new UnsupportedOperationException();
	}

	public Lance informarJogada(int linha, int coluna, int movimento) {
		throw new UnsupportedOperationException();
	}

	public int tratarLance(int linha, int coluna, int movimento) {
		return movimento;

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

	public Jogador getJogadorLocal() {
		return this.jogadorLocal;
	}

	public Jogador getJogadorRemoto() {
		return this.jogadorRemoto;
	}

	public void criarJogadorLocal(String nome) {
		this.jogadorLocal = new Jogador(nome);
	}

	public void criarJogadorRemoto(String nome) {
		this.jogadorRemoto = new Jogador(nome);
	}

	public void setPartidaEmAndamento(boolean partidaEmAndamento) {
		this.partidaEmAndamento = partidaEmAndamento;
	}

}