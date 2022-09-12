package br.com.tech4me.clientems.service;

import java.util.List;
import br.com.tech4me.clientems.model.Cliente;

public interface ClienteService {
    Cliente cadastrarCliente(Cliente cliente);
    List<Cliente> obterTodos();
    Cliente obterPorId(String id);
    void removerCliente(String id);
    Cliente atualizarCliente(String id, Cliente cliente);
    
}
