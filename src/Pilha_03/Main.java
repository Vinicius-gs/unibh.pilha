package Pilha_03;

import java.util.Scanner;

import Pilha.Agenda;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		Pilha a = new Pilha(4);
		boolean status_menu = true;
		Scanner menu = new Scanner (System.in);
		
		 while (status_menu == true) {            

		        System.out.print("###--Teste Estrutura de Menu--###\n\n");
		        System.out.print("|------------------------------|\n");
		        System.out.print("| Opção 1 - INSERIR ITEM       |\n");
		        System.out.print("| Opção 2 - REMOVER ITEM       |\n");
		        System.out.print("| Opção 3 - IMPRIMIR TAMANHO   |\n");
		        System.out.print("| Opção 4 - IMPRIMIR ITEM TOPO |\n");
		        System.out.print("| Opção 0 - SAIR               |\n");
		        System.out.print("|------------------------------|\n");
		        System.out.print("Digite uma opção: ");

		        int opcao = menu.nextInt();

		        if (opcao == 0) {
		            System.out.print("\nAté logo!");
		            status_menu = false;

		        }

		        if (opcao == 1) {
		        	if (!a.cheio()) {       		
		        			a.push();
		        		} else {
		        			System.out.println("Agenda cheia");
		        		}
		        	
		        } else if (opcao == 2) {
		        	if (a.vazio()) {
		        		System.out.println("Pilha vazia");
		        	}else {
		        		a.pop();
		        		System.out.println("Removido");
		        	}
		        }else if (opcao == 3) {
		        	System.out.println(a.tamanho()); 
		        } else if (opcao == 4) {
		        	System.out.println(a.exibeUltimoValor());
		        } 
		        }
			}	

}
