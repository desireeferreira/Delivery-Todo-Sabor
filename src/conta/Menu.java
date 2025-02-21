package conta;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
         Scanner leia = new Scanner(System.in);

        int opcao;

        while (true) { 
            System.out.println("*****************************************************");
            System.out.println("          MENU TODO SABOR COMIDA BRASILEIRA          ");
            System.out.println("*****************************************************");
            System.out.println("            1 - Consultar o Cardápio                 ");
            System.out.println("            2 - Cadastrar Item no Cardápio           ");
            System.out.println("            3 - Atualizar Item no Cardápio           ");
            System.out.println("            4 - Apagar Item do Cardápio              ");
            System.out.println("            5 - Finalizar o Pedido                   ");
            System.out.println("*****************************************************");
            System.out.print  ("Entre com a opção desejada:                          ");
            
            opcao = leia.nextInt();
            leia.nextLine();  

            switch (opcao) {
                case 1:
                    
                    break;
                case 2:
                    cadastrarItem();
                    break;
                case 3:
                    atualizarItem();
                    break;
                case 4:
                    apagarItem();
                    break;
                case 5:
                    System.out.println("\nObrigada por Escolher Todo Sabor Comida Brasileira");
                    leia.close();
                    return;
                default:
                    System.out.println("\nOpção inválida");
            }
        }
    }

     // Retorna null caso o item não seja encontrado
    }
}
