package com.gregpalacios.webflux.rest.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.gregpalacios.webflux.rest.models.Producto;

public interface ProductoDao extends ReactiveMongoRepository<Producto, String> {

}
