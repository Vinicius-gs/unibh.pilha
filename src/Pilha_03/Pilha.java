package Pilha_03;

import Pilha.Agenda;
import java.util.Scanner;

public class Pilha {
	Scanner menu = new Scanner (System.in);
	
	Agenda a = new Agenda(2);
	
	public int[] pilha;
	private int num;
	
    private int topo;
    private int base;
    private int tam_max;
    
    public Pilha(int quantidade) {
    	pilha = new int[quantidade];
//    	String agendas []; 
    	tam_max = quantidade;
    	topo = 0;
    	base = 0;
    }
    
    public void push() {
    	
    	System.out.print("Num: ");
		num = menu.nextInt();
		
		System.out.println("Adicionado");
	
    	pilha[topo] = num;
    	topo++;
    	if (vazio() == true) {
    		base = topo;
    	}
    }
    
    public void pop() {
    	topo--;
    }
    
    public int top() {
    	return pilha[topo -1];
    }
    public int base() {
    	return pilha[base];
    }
    
    public boolean vazio() {
        return (topo == 0);
    }
    
    public boolean cheio() {
        return (topo == tam_max);
    }

    public int tamanho() {
        return topo;
    }
    
    public int exibeUltimoValor() {
        //top
    	return pilha[topo - 1];
    }
    
    public void  inverter() {
    base = pilha[base];
    int top  = pilha[topo];

    pilha[topo] = base ;
    pilha[base] = top;
}


}
