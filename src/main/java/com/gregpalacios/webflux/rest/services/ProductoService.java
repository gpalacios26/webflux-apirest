package com.gregpalacios.webflux.rest.services;

import com.gregpalacios.webflux.rest.models.Categoria;
import com.gregpalacios.webflux.rest.models.Producto;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductoService {

	public Flux<Producto> findAll();

	public Flux<Producto> findAllConNombreUpperCase();

	public Flux<Producto> findAllConNombreUpperCaseRepeat();

	public Mono<Producto> findById(String id);

	public Mono<Producto> save(Producto producto);

	public Mono<Void> delete(Producto producto);

	public Flux<Categoria> findAllCategoria();

	public Mono<Categoria> findCategoriaById(String id);

	public Mono<Categoria> saveCategoria(Categoria categoria);

}
