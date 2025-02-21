package repository;

import conta.Model.ItemCardapio;

public interface ContaRepository {

	public void Consultar(int numero);
	public void listarTodas();
	public void cadastrar(ItemCardapio itemCardapio);
	public void atualizar(ItemCardapio itemCardapio);
	public void deletar(int numero);
}
