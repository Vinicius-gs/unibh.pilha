package Pilha;

import java.util.Scanner;

public class Agenda {
		Scanner menu = new Scanner (System.in);
	
	 	public String[] agendas;
	    private String nome;
	    private String telefone;
	    private int topo;
	    private int base;
	    private int tam_max;
	    
	    // Construtor
	    public Agenda(int quantidade) {
	    	agendas = new String[quantidade];
//	    	String agendas []; 
	    	tam_max = quantidade;
	    	topo = 0;
	    	base = 0;
	    }
	    
	    public void adicionar() {
	    	
    		System.out.print("Nome: ");
    		nome = menu.next();
    		
    		System.out.print("Telefone: ");
    		telefone = menu.next();
    		
    		System.out.println("Adicionado");
	    	
	    	agendas[topo] = nome + telefone;
	    	topo++;
	    	if (vazio() == true) {
	    		base = topo;
	    	}
	    }
	    
	    public void remover() {
	    	topo--;
	    }
	    
	    public String top() {
	    	return agendas[topo -1];
	    }
	    public String base() {
	    	return agendas[base];
	    }
	    
	    public boolean vazio() {
	        return (topo == 0);
	    }
	    
	    public String exibeUltimoValor() {
	        //top
	    	return agendas[topo - 1];
	    }

	    public boolean cheio() {
	        return (topo == tam_max);
	    }

	    public int tamanho() {
	        return topo;
	    }
	    
        
        public void  novoTamanho(int novoTamanho) {
        	String agendas2[] = new String[agendas.length * novoTamanho];
        	for (int i = 0; i < agendas.length; i++) {
        		agendas2[i] = agendas[i];
			}
        	agendas = agendas2;
    }
        
        public void  mudar() {
        String bas = agendas[base];
        String top  = agendas[topo];

        agendas[topo] = bas ;
        agendas[base] = top;
    }


}
