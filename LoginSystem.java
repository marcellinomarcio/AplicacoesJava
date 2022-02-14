import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.KeyStroke;


public class LoginSystem extends JFrame{
	
	    private JLabel lblStatus;
	    private JPanel painelPrincipal;
	    private JTextField campoUsuario;
	    private JPasswordField campoSenha;
	    private JButton btnLogin;
	    private JButton btnCancelar;
	    
 
	    public LoginSystem() {
	        initComponents();
	        
	    }

	    private void initComponents() {
	        this.setTitle("Login");
	        this.setSize(305,240);
	        this.setResizable(false);
	        this.setLocationRelativeTo(null);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setBackground(new Color(0, 0, 0));

	        
	        this.painelPrincipal = new JPanel();
	        this.painelPrincipal.setLayout(new GridLayout(3,1,5,0));
	        this.painelPrincipal.setBackground(new Color(255,255,255));
	        this.painelPrincipal.setBorder(BorderFactory.createMatteBorder(15,5,15,5, new Color(0,0,0)));
	        this.painelPrincipal.setOpaque(true);
	        this.add(painelPrincipal);

	        this.setUndecorated(true);
	        JPanel painelUsuario = new JPanel();
	        painelUsuario.setLayout(new FlowLayout(1,5,50));
	        painelUsuario.setOpaque(false);
	        
	        
	        JPanel painelSenha = new JPanel();
	        painelSenha.setLayout(new FlowLayout(1,5,15));
	        painelSenha.setOpaque(false);
	        
	        
	        JPanel painelBotoes = new JPanel();
	        painelBotoes.setOpaque(false);
	        painelBotoes.setLayout(new FlowLayout(1,10,5));
	        
	        
	    
	        JLabel lblUsuario = new JLabel("<html>Usuário</html>");
	        lblUsuario.setFont(new Font("Arial", Font.ITALIC, 18));
	        lblUsuario.setForeground(new Color(0,0,0));
	        this.campoUsuario = new JTextField(16);
	        campoUsuario.setFont(new Font("Arial", Font.BOLD, 14));
	        painelUsuario.add(lblUsuario);
	        painelUsuario.add(campoUsuario);
	        
	        
	        JLabel lblSenha = new JLabel("  Senha");
	        lblSenha.setFont(new Font("Arial", Font.ITALIC, 18));
	        lblSenha.setForeground(new Color(0,0,0));
	        
	        this.campoSenha = new JPasswordField(16);
	        campoSenha.setFont(new Font("Arial", Font.BOLD, 14));
	        
	        painelSenha.add(lblSenha);
	        painelSenha.add(campoSenha);
	        
	        this.btnLogin = new JButton("Login");
	        this.btnLogin.setMnemonic(KeyEvent.VK_L);
	        this.btnCancelar = new JButton("Cancelar");
	        this.btnCancelar.setMnemonic(KeyEvent.VK_C);
	        
	        lblStatus = new JLabel("Status");
	        
	        painelBotoes.add(lblStatus);
	        painelBotoes.add(btnCancelar);
	        painelBotoes.add(btnLogin);
	        
	        this.painelPrincipal.add(painelUsuario);
	        this.painelPrincipal.add(painelSenha);
	        this.painelPrincipal.add(painelBotoes);
	        
	    }
	    
	    public static void main(String[] args) {
	        new LoginSystem().setVisible(true);
	    }
	}

