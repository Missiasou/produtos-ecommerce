package com.br.lets.produtosecommerce.domain;

import java.math.BigDecimal;

public class ProdutoRequest {
    private String name;
    private String description;
    private BigDecimal price;
    private Long amount;
    private String group;

    public ProdutoEntity toEntity(){

        return new ProdutoEntity(this.name, this.description, this.price, this.amount, this.group);
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
