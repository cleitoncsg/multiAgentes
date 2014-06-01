package hello;

import jade.core.Agent; 

public class OlaMundo extends Agent { 
	
	 protected void setup() { 
		 System.out.println("Ola Mundo! "); 
		 System.out.println("Meu nome: "+ getLocalName()); 
	 } 
 
}