package conta.Model;


//public abstract class ItemCardapio  {
//    protected String nome;
//    protected double preco;
public class ItemCardapio {
private String nome;
private float preco;

    public  ItemCardapio(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

//    @Override
//    public String toString() {
//        return nome + " - R$ " + preco;
//    }
}
