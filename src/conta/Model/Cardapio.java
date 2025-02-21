package conta.Model;
import java.util.ArrayList;
import java.util.List;
import conta.Model.ItemCardapio;
import repository.ContaRepository;


abstract class Cardapio implements ContaRepository {
    private static List<ItemCardapio> cardapio = new ArrayList<>();
    

	public static List<ItemCardapio> getCardapio() {
		return cardapio;
	}

	public static void setCardapio(List<ItemCardapio> cardapio) {
		Cardapio.cardapio = cardapio;
	}

	public Cardapio() {		
	}
	public void consultarCardapio() {
        if (cardapio.isEmpty()) {
            System.out.println("\nO cardápio está vazio!");
        } else {
            System.out.println("\nCardápio:");
            for (ItemCardapio item : cardapio) {
                System.out.println(item);
            }
            
        }
    
	}
    
	public void cadastrarItem(ItemCardapio item ) {
                            
     try {
            cardapio.add(item);
            System.out.println("Item cadastrado com sucesso!");
            
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar item: " + e.getMessage());
        }
     }
	}
	
    
    
