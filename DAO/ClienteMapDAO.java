package DAO;

import br.com.breno.henrique.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class ClienteMapDAO implements IClienteDAO{

    private  Map<Long, Cliente> map;{
    this.map = new HashMap<>();
    }

    @Override
    public Boolean cadastrarCliente(Cliente cliente) {
        if (this.map.containsKey(cliente.getCpf())) {
            return false;
        }
        this.map.put(cliente.getCpf(), cliente);
        return true;
    }
    @Override
    public void exluir(long cpf) {
        Cloente clienteCadastrado = this.map.get(cpf);

        if (clienteCadastrado != null) {
            this.map.remove(clienteCadastrado.getCpf(, clienteCadastrado));
        }

    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = this.map.get(cliente.getCpf());
        if (clienteCadastrado != null) {
            clienteCadastrado.setNome(cliente.getNome());
        }

    }

    @Override
    public Cliente consutar(long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.map.get.value();
    }
}
