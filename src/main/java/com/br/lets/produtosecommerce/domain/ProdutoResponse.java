package com.br.lets.produtosecommerce.domain;

import java.math.BigDecimal;

public class ProdutoResponse {

    private String id;
    private String name;
    private String description;
    private BigDecimal price;
    private Long amount;
    private String group;

    public ProdutoResponse(ProdutoEntity produtoEntity) {
        this.id = produtoEntity.getId();
        this.name = produtoEntity.getName();
        this.description = produtoEntity.getDescription();
        this.price = produtoEntity.getPrice();
        this.amount = produtoEntity.getAmount();
        this.group = produtoEntity.getGroup();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
