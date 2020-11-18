package br.univille.app.mvc.conversor;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import br.univille.app.mvc.utils.ImagesUtil;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;



public class ConversorView extends JFrame {

    private JTextField ValorInicialTextField;
    private JLabel status;
    
    
    boolean lCEL=true;
	boolean lKEL=false;
	boolean lFAH=false;
	
	
    boolean rCEL=false;
	boolean rKEL=true;
	boolean rFAH=false;
	
	
   
  

    public ConversorView(){
        junto();
        
        
        
    }

    
    

    
//---------------   
   
    public JPanel configurarJanela() {
    	   	

        setTitle("Convertor de temperatura");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(375,812);
        setResizable(false);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.decode("#ED7878"));
        panel.setPreferredSize(new Dimension(375,812));
        
        
//---------------   
        
        JLabel imagem = new JLabel(ImagesUtil.scaleImage(new ImageIcon("assets/imgs/barra.png"),375,312));
        imagem.setBounds(0,-240,360,520);
        
        JLabel logo = new JLabel(ImagesUtil.scaleImage(new ImageIcon("assets/imgs/logo.png"),375,312));
        logo.setBounds(10,-140,360,520);
        
        
//---------------   
        
        ValorInicialTextField = new JTextField();
        ValorInicialTextField.setBounds(156,300,90,24);
                                     
             
//---------------   
      
        
        JLabel labelValorInicial = new JLabel("VALOR INICIAL");
        labelValorInicial.setFont(new Font("Arial", Font.BOLD, 17)); 
        labelValorInicial.setBounds(30,300,200,24);

               
        JLabel labelPara = new JLabel("PARA:");
        labelPara.setForeground(Color.white);
        labelPara.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 21)); 
        labelPara.setBounds(145,410,200,24);
           
                
//---------------   
              
        
       JButton converterBotao = new JButton("CONVERTER");
       converterBotao.setBorderPainted(false);  
       converterBotao.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 21)); 
       converterBotao.setForeground(Color.decode("#7A7A7A"));
       converterBotao.setBackground(Color.decode("#FFBD4A"));
       converterBotao.setBounds((int) 90,580,170,55);
       
       converterBotao.addActionListener(new ActionListener() {
    	   
    	   @Override
    	   
    	   public void actionPerformed(ActionEvent e) {
    		   converter();
    		   
    	   }
    	   
       });
    		       		            
             
       status = new JLabel( );
       status.setForeground(Color.white);
       status.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18)); 
       status.setBounds(136,650,90,24);
       
      
     
//---------------  
       
       JPanel radioButtonPanel = new JPanel();
                           
       
    radioButtonPanel.setBounds(30,460,300,30);
   	radioButtonPanel.setBackground(Color.decode("#ED7878"));
   	
   	JRadioButton celsius = new JRadioButton("Celsius");
   	celsius.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15)); 
   	celsius.setBackground(Color.decode("#ED7878"));
   	
   	JRadioButton Kelvin = new JRadioButton("Kelvin");
	Kelvin.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15)); 
   	Kelvin.setBackground(Color.decode("#ED7878"));
   	Kelvin.setSelected(true);
    	   	   	
	JRadioButton Fahrenheit = new JRadioButton("Fahrenheit");
	Fahrenheit.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15)); 
	Fahrenheit.setBackground(Color.decode("#ED7878"));
		 	
   	radioButtonPanel.add(celsius);
   	radioButtonPanel.add(Kelvin);
   	radioButtonPanel.add(Fahrenheit);
   	
   	panel.add(radioButtonPanel);
   	
   	ButtonGroup gruposDeRadiosButtons = new ButtonGroup();
    gruposDeRadiosButtons.add(celsius);
    gruposDeRadiosButtons.add(Kelvin);
    gruposDeRadiosButtons.add(Fahrenheit);
    
    radioButtonPanel.add(celsius);
    radioButtonPanel.add(Kelvin);
    radioButtonPanel.add(Fahrenheit);
    
    
    
    
//--------------- 
              
    JPanel comboBoxPanel = new JPanel();
    
    comboBoxPanel.setBounds(215,295,150,30);
    comboBoxPanel.setBackground(Color.decode("#ED7878"));

    String[] medida = {"Celsius","Kelvin","Fahrenheit"};
  
    
    JComboBox<String> comboBox = new JComboBox<>(medida);
    
    comboBoxPanel.add(comboBox);
    
    panel.add(comboBoxPanel);
    
      	          comboBox.addActionListener(new ActionListener() {
    	  
          @Override
          
          public void actionPerformed(ActionEvent e) {
              System.out.println("Item selecionado: "+comboBox.getSelectedItem());           
                      	               
              if (comboBox.getSelectedItem() == "Kelvin" ) {
            	              	 
            	  	lCEL=false;
          			lKEL=true;
          			lFAH=false;
          			
            	  	status.setText("");
	
              } else if (comboBox.getSelectedItem() == "Fahrenheit" ){
            	  
            	  	lCEL=false;
          			lKEL=false;
          			lFAH=true;
              	
            	  	status.setText("");
              	
              }else if (comboBox.getSelectedItem() == "Celsius" ){
            	  
            	  	lCEL=true;
            	  	lKEL=false;
            	  	lFAH=false;    	  	
            	  	status.setText("");
              		}
            
              
              if (comboBox.getSelectedItem() == "Kelvin" && rKEL == true ) {
            	  Fahrenheit .setSelected(true);            	 
            	  	            	           			
          			rCEL=false;
            	  	rKEL=false;
            	  	rFAH=true;
              		
              } else if (comboBox.getSelectedItem() == "Fahrenheit" && rFAH == true ){
            	  celsius.setSelected(true);
          			
          			rCEL=true;
            	  	rKEL=false;
            	  	rFAH=false;
              	
              }else if (comboBox.getSelectedItem() == "Celsius" &&  rCEL == true ){
            	  Kelvin.setSelected(true);             	  	          		
            	  	
            	  	rCEL=false;
            	  	rKEL=true;
            	  	rFAH=false;           	 
              	          	                          	
              }
           
              }
      });
      
      
      
      
      celsius.addActionListener(new ActionListener() {
    	   
    	   @Override
    	   
    	   public void actionPerformed(ActionEvent e) {
    		 
    	       
    	   	rCEL=true;
    	  	rKEL=false;
    	  	rFAH=false;
    	  	
    	  	status.setText("");    	
 	       
    		  if (comboBox.getSelectedItem() == "Celsius" ) {
           		   
    			  	comboBox.setSelectedIndex(2);
            	  	lCEL=false;
            	  	lKEL=false;
            	  	lFAH=true;
            		
            	  	rCEL=true;
            	  	rKEL=false;
            	  	rFAH=false;            	  	
    		  }
    		   
    	   }
    	   
       });
       
       Kelvin.addActionListener(new ActionListener() {
     	   
     	   @Override
     	   
     	   public void actionPerformed(ActionEvent e) {
     		   
     		rCEL=false;
      	  	rKEL=true;
      	  	rFAH=false;
      	  	
      	  	
      		status.setText("");
     		
     		 if (comboBox.getSelectedItem() == "Kelvin") {
     			 
     			 	comboBox.setSelectedIndex(0);
            	  	lCEL=true;
            	  	lKEL=false;
            	  	lFAH=false;
             }
     		   
     	   }
     	   
        });
      
       
       Fahrenheit.addActionListener(new ActionListener() {
     	   
     	   @Override
     	   
     	   public void actionPerformed(ActionEvent e) {
     		   
     		rCEL=false;
      	  	rKEL=false;
      	  	rFAH=true;
      	  	
      		status.setText("");
     		
     		 if (comboBox.getSelectedItem() == "Fahrenheit" ) {
     	   
     			 	comboBox.setSelectedIndex(1);
            	  	lCEL=false;
            	  	lKEL=true;
            	  	lFAH=false;
            		
            	  	rCEL=false;
            	  	rKEL=false;
            	  	rFAH=true;     		 
     		 
     		 }
     		   
     	   }
     	   
        });
       
       
      

      
//---------------       
       	  
          panel.add(imagem);
          panel.add(logo);                        
          panel.add(ValorInicialTextField);     
          panel.add(labelValorInicial); 
          panel.add(labelPara);            
          panel.add(converterBotao);
         
       panel.add(status);
   			
       return panel;
 
      
//---------------   
            	
}
    
    private void  converter() {
    	ConversorConta conta =  new ConversorConta();
       	String numeroInicial = ValorInicialTextField.getText();
       	double numeroI = Integer.parseInt(numeroInicial);
       	conta.setNumInicial(numeroI);
       	
       	if  ( lCEL == true && rFAH == true) {
       		status.setText(ConversorConta.celsiusFahrenheit());
       		
       	} else if (lCEL == true && rKEL == true){
       		status.setText(ConversorConta.celsiusKelvin());
       		
       	}else if (lFAH == true && rKEL == true){
       		status.setText(ConversorConta.fahrenheitKelvin());
       		
       	}else if (lFAH == true && rCEL == true){
       		status.setText(ConversorConta.fahrenheitCelsius());
       		
       	}else if (lKEL == true && rCEL == true){
       		status.setText(ConversorConta.kelvinCelsius());
       		
       	}else if (lKEL == true && rFAH == true){
       		status.setText(ConversorConta.kelvinFahrenheit());
       		
       	}
       	
       }	   
        
    
    
 private void junto() {
    	
    	
	 JPanel ROOT = new JPanel();


	 ROOT.add(configurarJanela());
	
	 
	 
	 setContentPane(ROOT);
	 
     setVisible(true);
       
       
    }
    
    
    
 








    
       
}