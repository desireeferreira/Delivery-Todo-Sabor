package conta.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import conta.Model.ItemCardapio;

public class ContaController {
	private static List<ItemCardapio> cardapio = new ArrayList<>();
	private static Scanner leia = new Scanner(System.in);
	public static void cadastrarItem() {
        System.out.print("\nDigite o nome do novo item: ");
        String nome = leia.nextLine();

        System.out.print("Digite o preço do item: ");
        double preco = leia.nextDouble();
        leia.nextLine();  

        cardapio.add(new ItemCardapio(nome, preco));
        System.out.println("Item cadastrado com sucesso!");
    }

    public static void consultarCardapio() {
        if (cardapio.isEmpty()) {
            System.out.println("\nO cardápio está vazio.");
            return;
        }

        System.out.println("\n=== CARDÁPIO ===");
        for (ItemCardapio item : cardapio) {
            System.out.println("• " + item.getNome() + " - R$ " + item.getPreco());
        }
    }

	
    
    public static void atualizarItem() {
        //consultarCardapio();
        if (cardapio.isEmpty()) return;

        System.out.print("\nDigite o nome do item que deseja atualizar: ");
        String nome = leia.nextLine();

        ItemCardapio item = encontrarItemPorNome(nome);
        if (item != null) {
            System.out.print("Novo nome do item: ");
            String novoNome = leia.nextLine();

            System.out.print("Novo preço do item: ");
            double novoPreco = leia.nextDouble();
            leia.nextLine();  

           item.setNome(novoNome);
            item.setPreco(novoPreco);

            System.out.println("Item atualizado com sucesso!");
        } else {
            System.out.println("Item não encontrado!");
       }
    }

    
	public static void apagarItem() {
       //consultarCardapio();
        if (cardapio.isEmpty()) return;

       System.out.print("\nDigite o nome do item que deseja apagar: ");
        String nome = leia.nextLine();

        ItemCardapio item = encontrarItemPorNome(nome);
        if (item != null) {
            cardapio.remove(item);
            System.out.println("Item removido com sucesso!");
        } else {
            System.out.println("Item não encontrado!");
        }
    }

    private static ItemCardapio encontrarItemPorNome(String nome) {
        for (ItemCardapio item : cardapio) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                return item;
            }
        }
        return null; 
    }}


	
		
	
