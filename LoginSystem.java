import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;


public class LoginSystem extends JFrame{
	
	    private JLabel lblStatus;
	    private JPanel painelPrincipal;
	    private JPanel painelTopo;
	    private JPanel painelCentro;
	    private JPanel painelInferior;
	    private JTextField campoUsuario;
	    private JPasswordField campoSenha;
	    private JButton btnLogin;
	    private JButton btnCancelar;
	    
 
	    public LoginSystem() {
	    	try {
	    	    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
	    	        if ("Nimbus".equals(info.getName())) {
	    	            UIManager.setLookAndFeel(info.getClassName());
	    	            break;
	    	        }
	    	    }
	    	} catch (Exception e) {
	    	    System.out.println("Erro lookFeel: "+e);
	    	}
	    	
	    	
	        this.setTitle("Login");
	        this.setSize(330,240);
	        this.setResizable(false);
	        this.setLocationRelativeTo(null);
	        this.setUndecorated(true);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setBackground(new Color(0, 0, 0));
	        
	        gerarPainelPrincipal();
	        gerarPainelTopo();
	        gerarPainelCentro();
	        gerarPainelInferior();
	    }

	    private void gerarPainelPrincipal() {
	    	this.painelPrincipal = new JPanel(new BorderLayout());
	    	this.painelPrincipal.setBorder(BorderFactory.createMatteBorder(15,7, 6, 7, new Color(54, 54, 54)));
	    	this.add(painelPrincipal);
	    }
	    
	    private void gerarPainelTopo() {
	    	this.painelTopo = new JPanel();
	    	this.painelTopo.setBackground(new Color(175,238,250));
	    	this.painelTopo.setBorder(BorderFactory.createBevelBorder(0, new Color(255,255,255), new Color(255,255,255)));
	    	JLabel titulo = new JLabel("Identificação Usuário");
	    	titulo.setFont(new Font("Serif", Font.BOLD, 16));
	    	titulo.setBorder(BorderFactory.createEmptyBorder(1,0,5,0));
	    	this.painelTopo.add(titulo);
	    	this.painelPrincipal.add(this.painelTopo, BorderLayout.NORTH);
	    }
	    
	    private void gerarPainelCentro() {
	    	this.painelCentro = new JPanel(new GridLayout(2,1));
	    	this.painelCentro.setBorder(BorderFactory.createBevelBorder(0, new Color(255,255,255), new Color(255,255,255)));
	    	
	    	JPanel painelNome = new JPanel(new FlowLayout(0,5,20));
	    	JLabel lblNome = new JLabel("Usuário");
	    	lblNome.setFont(new Font("Arial", Font.ITALIC, 18));
	    	
	    	this.campoUsuario = new JTextField(16);
	    	this.campoUsuario.setFont(new Font("Arial", Font.BOLD, 15));
	    	this.campoUsuario.setBorder(BorderFactory.createEtchedBorder(new Color(55,55,55), new Color(55,55,55)));
	    	painelNome.add(lblNome);
	    	painelNome.add(this.campoUsuario);
	    	this.painelCentro.add(painelNome);
	    	
	    	
	    	JPanel painelSenha = new JPanel(new FlowLayout(0,5,10));
	    	JLabel lblSenha = new JLabel("Senha  ");
	    	lblSenha.setFont(new Font("Arial", Font.ITALIC, 18));
	    	
	    	this.campoSenha = new JPasswordField(16);
	    	this.campoSenha.setFont(new Font("Arial", Font.BOLD, 15));
	    	this.campoSenha.setBorder(BorderFactory.createEtchedBorder(new Color(55,55,55), new Color(55,55,55)));
	    	painelSenha.add(lblSenha);
	    	painelSenha.add(this.campoSenha);
	    	this.painelCentro.add(painelSenha);	    	
	    	
	    	this.painelPrincipal.add(this.painelCentro, BorderLayout.CENTER);
	    	
	    	

	    }
	    
	    private void gerarPainelInferior() {
	    	this.painelInferior = new JPanel(new FlowLayout());
	    	this.painelInferior.setPreferredSize(new Dimension(0,70));
//	    	this.painelInferior.setBorder(BorderFactory.createEtchedBorder());
	    	
	    	
	    	this.lblStatus = new JLabel("Status");
	    	this.btnLogin = new JButton("Login");
	    	this.btnCancelar = new JButton("Cancelar");
	    	
	    	this.painelInferior.add(this.lblStatus);
	    	this.painelInferior.add(this.btnCancelar);
	    	this.painelInferior.add(this.btnLogin);
	    	this.painelPrincipal.add(this.painelInferior, BorderLayout.SOUTH);
	    	
	    	
	    	//EVENTOS COM BOTÃO
	    	
	    	this.btnLogin.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					lblStatus.setText("Logado");	
					
				}
			});
	    	this.btnCancelar.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					dispose();	
					
				}
			});
	    }
	    
	   
	    
	    public static void main(String[] args) {
	        new LoginSystem().setVisible(true);
	  
	    }
	}

