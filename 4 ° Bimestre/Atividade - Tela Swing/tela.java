import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class tela extends JFrame {

    public tela(){
        configurarJanela();
    }

    private void configurarJanela()  {
        setTitle("Tela de Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);

        setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        panel.setBackground(Color.lightGray);
        
     

        ImageIcon icon = new ImageIcon("assets/imgs/fundo.png");
        JLabel imagem = new JLabel(icon);
        imagem.setBounds(20,20,360,520);
        
        ImageIcon icon1 = new ImageIcon("assets/imgs/logo.png");
        JLabel logo = new JLabel(icon1);
        logo.setBounds(20,20,360,520);
        
        
        ImageIcon icon2 = new ImageIcon("assets/imgs/icone.png");
        JLabel icone = new JLabel(icon2);
        icone.setBounds(435,110,100,100);
        
        JLabel labelConta = new JLabel("CRIAR CONTA");
        labelConta.setBounds(450,100,100,24);

        JLabel labelPrimeiroNome = new JLabel("Primeiro Nome:");
        labelPrimeiroNome.setBounds(450,200,100,24);
        
        JTextField PrimeiroNomeTextField = new JTextField(20);
        PrimeiroNomeTextField.setBounds(450,225,280,24);
        
        JLabel labelSobrenome = new JLabel("Sobrenome");       
        labelSobrenome.setBounds(450,260,100,24);
        
        JTextField SobrenomeoNomeTextField = new JTextField(20);
        SobrenomeoNomeTextField.setBounds(450,285,285,24);
        
       JLabel labelEmail = new JLabel("Email");       
       labelEmail.setBounds(450,310,100,24);
       
       JTextField Email = new JTextField(20);
       Email.setBounds(450,335,280,24);
             
       JLabel labelSenha = new JLabel("Senha:");
       labelSenha.setBounds(450,370,100,24);
       
       JPasswordField senhaTextField = new JPasswordField(20);
       senhaTextField.setBounds(450,395,280,24);
        
       JCheckBox Termo = new JCheckBox("Termos e condições");
       Termo.setBounds(450,430,150,24);
        
       JButton loginBotao = new JButton("ACESSAR");
       loginBotao.setBounds((int) 555.5,480,89,24);
        
       ;

          panel.add(logo);
          panel.add(imagem);
          panel.add(icone);
          panel.add(labelConta);          
          panel.add(labelPrimeiroNome);
          panel.add(PrimeiroNomeTextField);
          panel.add(labelSobrenome);
          panel.add(SobrenomeoNomeTextField);
          panel.add(Email);
          panel.add(labelEmail);
          panel.add(labelSenha);
          panel.add(senhaTextField);
          panel.add(Termo);
          panel.add(loginBotao);
     
       
      
        setContentPane(panel);


       
        setVisible(true);
}
    }