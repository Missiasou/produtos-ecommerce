package com.br.lets.produtosecommerce.repository;

import com.br.lets.produtosecommerce.domain.ProdutoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;


public interface ProdutoRepository extends MongoRepository<ProdutoEntity, String> {

    Optional<ProdutoEntity> findByName(String name);
}
