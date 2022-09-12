package br.com.tech4me.clientems.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4me.clientems.model.Cliente;

public interface ClienteRepository extends MongoRepository <Cliente, String> {
    
}
