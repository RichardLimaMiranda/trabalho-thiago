package com.ibeus.Comanda.Digital.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cliente;

    private String status;

    @Column(name = "preco_total")
    private Double precoTotal;

    // Getter e Setter para o campo 'status'
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Getter e Setter para o campo 'precoTotal'
    public Double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(Double precoTotal) {
        this.precoTotal = precoTotal;
    }

    // Getter e Setter para o campo 'cliente'
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    // Getter e Setter para o campo 'id'
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
