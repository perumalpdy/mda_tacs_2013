package sp.senac.br.pizzariageek.bean;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Cliente cliente;

    public void setCliente(final Cliente value) {
        this.cliente = value;
    }
    private List<ItemDePedido> itemDePedido = new ArrayList<ItemDePedido>();

    public List<ItemDePedido> getItemDePedido() {
        return this.itemDePedido;
    }

    public void setItemDePedido(final List<ItemDePedido> value) {
        this.itemDePedido = value;
    }
}