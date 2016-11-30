package view;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TelaPrincipal extends JFrame {

	// atributos
	protected AtorJogador ator;
	protected JPanel jContentPane;
	protected LabelImg[] labels;
	protected Integer atual;
	protected Integer destino;
	protected JMenuBar menu;
	protected JMenu menuDd;
	protected JMenuItem conectar, iniciarPartida, desconectar, reiniciar;
	protected JButton atacar;
	protected JButton mover;
	protected JLabel user;
	private int posicaoX1 = 50;
	private int posicaoY1 = 10;	
	private int posicaoX2 = 50;
	private int posicaoY2 = 100;
	
	

	public TelaPrincipal(final AtorJogador ator) {
		
		// parâmetros gerais do tabuleiro
		this.ator = ator;
		this.setSize(350, 300);
		this.setResizable(false);
		this.user = new JLabel();
		this.setContentPane(getJContentPane());
		this.setTitle("Battle Spears");
		this.setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	
	// criando a imagem de tabuleiro
	private JPanel getJContentPane() {
		
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			labels = new LabelImg[6];
			

			// criar casas, e coloca imagens padrão
			for(int i=0; i<=5; i++){
								
				if(i== 0 || i==1 || i==2){
					labels[i] = new LabelImg(i);
					labels[i].setImagem("quadBr.png");
					labels[i].setBounds(new Rectangle(posicaoX1, posicaoY1, 70, 70));
					labels[i].setIcon(new ImageIcon(getClass().getResource(labels[i].retornaImagem())));
					jContentPane.add(labels[i], null);
					posicaoX1 = posicaoX1 + 75; // 75 pois ai pula um quadrado (70pixels) e +5 para distanciamento entre eles.
					
				}
				if(i== 3 || i==4 || i==5){
					labels[i] = new LabelImg(i);
					labels[i].setImagem("quadPr.png");
					labels[i].setBounds(new Rectangle(posicaoX2, posicaoY2, 70, 70));
					labels[i].setIcon(new ImageIcon(getClass().getResource(labels[i].retornaImagem())));
					jContentPane.add(labels[i], null);
					posicaoX2 = posicaoX2 + 75;
					
				}
			}
			
			
			//tratador de eventos de cada poição
			labels[0].addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					clickPosicao(0);
				}
			});
			labels[1].addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					clickPosicao(1);
				}
			});
			labels[2].addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					clickPosicao(2);
				}
			});
			labels[3].addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					clickPosicao(3);
				}
			});
			labels[4].addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					clickPosicao(4);
				}
			});
			labels[5].addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					clickPosicao(5);
				}
			});
			
		// chama o método pra construir o menu.	
		criarMenu();

		// frame interno.
		user.setBounds(new Rectangle(25, 10, 200, 20));
		jContentPane.add(user);
		
		//criar botoes
		criarBotoes();
	}
	return jContentPane;
}
	
	
	public void criarMenu() { 
		menu = new JMenuBar();
		menuDd = new JMenu("Partida");
		
		
		//Cria cada texto de botão e o tratador de eventos de cada um.
		conectar = menuDd.add("Conectar");
		conectar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				try {
					String nomeJogador = solicitar("Insira seu nome:", null);
					String servidor = solicitar("Insira o servidor:", "localhost");
					user.setText("Jogador: " + nomeJogador);
					ator.conectar(nomeJogador, servidor);
					iniciarPartida.setEnabled(true);
					desconectar.setEnabled(true);
					conectar.setEnabled(false);
					notificar("Conexão estabelecida com sucesso!");
				} catch (Exception ex) {
					notificar(ex.getMessage());
					ex.printStackTrace();
				}
			}
		});
		
		
		
		iniciarPartida = menuDd.add("Iniciar Partida");
		iniciarPartida.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				try {
					ator.IniciarPartida();
					if (ator.getTabuleiro().informaSePartidaEmAndamento()) {
						reiniciar.setEnabled(true);
						iniciarPartida.setEnabled(false);
					}
				} catch (Exception e1) {
					notificar(e1.getMessage());
					e1.printStackTrace();
				}
			}
		});
		
		
		
		desconectar = menuDd.add("Desconectar");
		desconectar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				try {
					ator.desconectar();
					desconectar.setEnabled(false);
					conectar.setEnabled(true);
					reiniciar.setEnabled(false);
					iniciarPartida.setEnabled(false);
					notificar("Conexão encerrada com sucesso!");
				} catch (Exception ex) {
					notificar(ex.getMessage());
					ex.printStackTrace();
				}
			}
		});
		
		
		reiniciar = menuDd.add("Reiniciar");
		reiniciar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				try {
					int opt = perguntar("Deseja realmente enviar uma solicitação de reinicio de partida?\nO outro jogador começara a partida com o time do Olimpo se aceitar.");
					if (opt == 0) {
						reiniciar.setEnabled(false);
						ator.solicitarReinicio();
					}
				} catch (Exception ex) {
					notificar(ex.getMessage());
				}
			}
		});
		
		
		// adiciona os botões configurados a barra de menu.
		menu.add(menuDd);
		this.setJMenuBar(menu);

	}

	public void criarBotoes(){
		atacar = new JButton("Atacar!");
		atacar.setBounds(60, 200, 100, 30);
		atacar.setVisible(true);
		atacar.setEnabled(false);
		atacar.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e)
			  {
			    System.out.println("SUCESSO BOTAO");
			  }	
		});
		
		jContentPane.add(atacar);
		
		
		mover = new JButton("Mover");
		mover.setBounds(160, 200, 100, 30);
		mover.setVisible(true);
		mover.setEnabled(false);
		mover.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e)
			  {
			    System.out.println("SUCESSO BOTAO");
			  }	
		});
		jContentPane.add(mover);
	}
	
	
	
	public void notificar(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}

	
	public String solicitar(String msg, String def) {
		return JOptionPane.showInputDialog(msg, def);
	}

	
	public void clickPosicao(int posicao) {
		System.out.println("CLICOU EM UMA POSICAO !");
	}



	public void posicionarPecasJogadores() {
		
	}
	
	
	
	public int perguntar(String pergunta) {
		int opt = JOptionPane.showConfirmDialog(null, pergunta, "Question", 0, 3);
		return opt;
	}

	public void reiniciar() {
		this.jContentPane = null;
		this.setContentPane(getJContentPane());
		//this.iniciaImagensPersonagens();
	}

	public void limpar(){
		for(LabelImg l : labels){
			l.setImagem2(null);
			l.setIcon(new ImageIcon(getClass().getResource(l.retornaImagem())));
		}
	}

}