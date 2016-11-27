package view;

import control.Tabuleiro;
import br.ufsc.inf.leobr.cliente.exception.NaoConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoJogandoException;
import rede.AtorNetGames;


public class AtorJogador {

	protected Tabuleiro tabuleiro;
	protected AtorNetGames rede;
	protected String idUsuario;
	protected TelaPrincipal tela;

	
	public AtorJogador() {
		this.tabuleiro = new Tabuleiro();
		this.tela = new TelaPrincipal(this);
		this.rede = new AtorNetGames(this);
	}
	
	
	public void conectar(String idUsuario, String servidor) throws Exception {
		this.idUsuario = idUsuario;
		rede.conectar(idUsuario, servidor);
	}

	public void solicitarReinicio() throws NaoJogandoException {
		this.tabuleiro.getJogador1().setTurno(false);
		this.rede.enviarJogada(null);
	}
	
	public void notificarIrregularidades(int cod) {
		
	}

	public void desconectar() throws NaoConectadoException {
		rede.desconectar();
	}

	public void IniciarPartida() {
		
	}

	
	public void clickJogada(int linha, int coluna, int tipoMovimento) {
		
	}

	public void enviarJogada() {
		
	}

	public void exibirEstado() {
		
	}

	
	public void receberLance(Lance jogada) {
		
	}

	public boolean avaliarInterrupcao() {
		
	}

	public void tratarIniciarPartida() {
		
	}


	public Tabuleiro getTabuleiro() {
		return this.tabuleiro;
	}

}