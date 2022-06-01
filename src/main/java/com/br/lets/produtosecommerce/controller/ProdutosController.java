package com.br.lets.produtosecommerce.controller;

import com.br.lets.produtosecommerce.domain.ProdutoRequest;
import com.br.lets.produtosecommerce.domain.ProdutoResponse;
import com.br.lets.produtosecommerce.repository.ProdutoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/produto")
public class ProdutosController {

    private final ProdutoRepository produtoRepository;

    public ProdutosController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping(path = "/add")
    public ResponseEntity<ProdutoResponse> novoProduto(@RequestBody ProdutoRequest produtoRequest){
        return
    }

}
