package br.senac.sp.pizzariageek.entities;

import java.util.List;

public class Pedido {

    private Cliente cliente;
    private List<ItemDePedido> items;
    private Double valorTotal;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemDePedido> getItems() {
        return items;
    }

    public void setItems(List<ItemDePedido> items) {
        this.items = items;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    
}
