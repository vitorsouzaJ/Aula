package br.univille.poo.logger;

import java.io.File;
import java.io.FileWriter;


class Main {
    public static void main(String[] args) {
    	
    	
    	
    	Logger   loggerC = LoggerFactory.getInstance().createConsoleLogger();
        Logger loggerF =LoggerFactory.getInstance().createFileLogger();
        
        
        
        loggerC.mensagem("Iniciou o Sistema");
        loggerC.mensagem("Executando o Sistema");
        loggerC.mensagem("Finalizou o Sistema");
       
        loggerF.mensagem("Iniciou o Sistema");
        loggerF.mensagem("Executando o Sistema");
        loggerF.mensagem("Finalizou o Sistema");
      
      
        
    }
    
    
}



/*

System.out.println("antes");

try{
	System.out.println("dentro");
    File arquivo = new File("arquivo.txt");
    FileWriter writer = new FileWriter(arquivo,true);
    writer.write(" \n Adicionado no arquivo. \n outra linha");
    writer.close();
}catch(Exception e){
	System.out.println("na exceçãp");
    e.printStackTrace();
}

System.out.println("final");




*/