package view;
import model.ImagemDoTabuleiro;

import control.Tabuleiro;
import model.Lance;
import br.ufsc.inf.leobr.cliente.exception.NaoConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoJogandoException;
import rede.AtorNetGames;


public class AtorJogador {

	protected AtorJogador interfaceGrafica;

	/**
	 * 
	 * @param servidor
	 * @param nome
	 */
	public void conectar(String servidor, String nome) {
		// TODO - implement AtorNetGames.conectar
		throw new UnsupportedOperationException();
	}

	public boolean desconectar() {
		// TODO - implement AtorNetGames.desconectar
		throw new UnsupportedOperationException();
	}

	public void iniciarPartida() {
		// TODO - implement AtorNetGames.iniciarPartida
		throw new UnsupportedOperationException();
	}
	
	public void notificar(String mensagem) {
		tela.notificar(mensagem);
	}
	
	public void notificarErro(String erro) {
		this.tabuleiro.setPartidaEmAndamento(false);
		tela.notificar(erro);
	}

	public void IniciarPartida() throws NaoConectadoException {
		rede.iniciarPartida();
	}

	/**
	 * 
	 * @param jogada
	 */
	public void receberLance(ImagemDoTabuleiro jogada) {
		// TODO - implement AtorNetGames.receberLance
		throw new UnsupportedOperationException();
	}

	public void iniciarNovaPartida() {
		// TODO - implement AtorNetGames.iniciarNovaPartida
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idUsuario
	 */
	public void informaIdAdversario(String idUsuario) {
		// TODO - implement AtorNetGames.informaIdAdversario
		throw new UnsupportedOperationException();
	}

	
	public void receberLance(Lance jogada) {
		
	}

	public boolean avaliarInterrupcao() {
		return false;
		
	}

	public void tratarIniciarPartida() {
		
	}


	public Tabuleiro getTabuleiro() {
		return this.tabuleiro;
	}

}