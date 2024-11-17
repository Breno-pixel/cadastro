package DAO;

import br.com.breno.henrique.Cliente;

import java.util.Collection;

public interface IClienteDAO {

    public Boolean cadastrarCliente(Cliente cliente);

    public void  exluir(long cpf);

    public void  alterar(Cliente cliente);

    public Cliente consutar(long cpf);

    public Collection<Cliente> buscarTodos();
}
