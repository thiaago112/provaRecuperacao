package br.com.tech4me.clientems.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.clientems.model.Cliente;
import br.com.tech4me.clientems.dto.ClienteDto;
import br.com.tech4me.clientems.repository.ClienteRepository;

@Service
public class ClienteServiceImpl {
    
    @Autowired
    private ClienteRepository repo;

    /*@Override
    public ClienteDto incluirCliente(ClienteDto cliente){
        return salvarCliente(cliente);
    }

    @Override
    public List<ClienteDto> obterTodos(){
        List<Cliente> clientes = repo.findAll();
        return clientes.stream()
        .map(cliente -> new ModelMapper().map(cliente, ClienteDto.class))
        .collect(Collectors.toList());
    }*/
}
