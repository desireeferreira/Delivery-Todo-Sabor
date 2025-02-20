package conta;

import java.util.Scanner;


public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		 int opcao;
		 
		 while (true) {

	            System.out.println("*****************************************************");
	            System.out.println("                                                     ");
	            System.out.println("          MENU TODO SABOR COMIDA BRASILEIRA          ");
	            System.out.println("                                                     ");
	            System.out.println("*****************************************************");
	            System.out.println("                                                     ");
	            System.out.println("            1 - Consultar o Cardápio                 ");
	            System.out.println("            2 - Cadastrar item do Cardápio            ");
	            System.out.println("            3 - Atualizar Cardápio                    ");
	            System.out.println("            4 - Apagar Item do Cardápio              ");
	            System.out.println("            5 - Remover o Item                       ");
	            System.out.println("            6 - Finalizar o Pedido                   ");	        
	            System.out.println("*****************************************************");
	            System.out.println("Entre com a opção desejada:                          ");
	            System.out.println("                                                     ");                                          
		 
	            opcao = leia.nextInt();
	            
//	            if(opcao == 6) {
//            	System.out.println("\nTodo Sabor Comida Brasileira- Sabor e Qualidade!");
//	            	//sobre();
//         	leia.close();	            
//         	System.exit(0);
//              }
	            
	            switch(opcao) {
	            
	            case 1:
	            	System.out.println("Consultar o Cardápio\n\n");
	            	break;
	            	
	            case 2:
	            	System.out.println("Cadastrar item do Cardápio\n\n");
	            	break;
	            	
	            case 3:
	            	System.out.println("Atualizar Cardápio \n\n");
	            	break;
	            	
	            case 4:
	            	System.out.println("Apagar Item do Cardápio\n\n");
	            	break;
	            	
	            case 5:
	            	System.out.println("Remover o Item\n\n");
	            	break;
	            	
	            case 6:
	            	System.out.println("Finalizar o Pedido\n\n");
	                System.out.println("\nObrigada por Escolher Todo Sabor Comida Brasileira");
	            	leia.close();
	            	return;
	            		            	
	            	default:
	            		System.out.println("\nOpção inválida");
	            }	            
	        } 
		 }
	
	public static void sobre() {
        System.out.println("\n*********************************************************");
        System.out.println("Projeto Desenvolvido por: Desiree Ferreira ");
        System.out.println("DESIREE FERREIRA - desireecode6@gmail.com");
        System.out.println("https://github.com/desireeferreira/Delivery-Todo-Sabor.git");
        System.out.println("*********************************************************");
	}
	}

