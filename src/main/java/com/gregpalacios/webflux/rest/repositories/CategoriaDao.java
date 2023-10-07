package com.gregpalacios.webflux.rest.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.gregpalacios.webflux.rest.models.Categoria;

public interface CategoriaDao extends ReactiveMongoRepository<Categoria, String> {

}
