package com.br.lets.produtosecommerce.service;

import com.br.lets.produtosecommerce.domain.ProdutoEntity;
import com.br.lets.produtosecommerce.domain.ProdutoRequest;
import com.br.lets.produtosecommerce.domain.ProdutoResponse;
import com.br.lets.produtosecommerce.repository.ProdutoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public ResponseEntity<ProdutoResponse> addProduto(ProdutoRequest produtoRequest){
        Optional<ProdutoEntity> verificaEntity = produtoRepository.findByName(produtoRequest.getName());


        if(verificaEntity.isEmpty()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        ProdutoEntity produtoEntity = produtoRequest.toEntity();
        ProdutoResponse produtoResponse = new ProdutoResponse(produtoRepository.save(produtoEntity));
        return ResponseEntity.ok(produtoResponse);
    }

    public ResponseEntity<ProdutoResponse> removeProduto(String idProduto){
        Optional<ProdutoEntity> verificaEntity = produtoRepository.findById(idProduto);
        if (verificaEntity.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        produtoRepository.deleteById(verificaEntity.get().getId());
        return ResponseEntity.status(HttpStatus.OK).build();

    }

    public String getProduto(String idProduto){
        return produtoRepository.findById(idProduto).get().getId();

    }
    public List<ProdutoResponse> getAllProduto(){
        return produtoRepository.findAll().stream().map(p -> new ProdutoResponse(p)).toList();
    }

}
