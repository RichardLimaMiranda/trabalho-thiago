package com.ibeus.Comanda.Digital.mock;

import com.ibeus.Comanda.Digital.model.Pedido;

import java.util.List;

public final class PedidoMock {

  private PedidoMock() {

  }

  public static List<Pedido> criandoUmaListaDePedidos() {
    Pedido pedido1 = new Pedido();
    pedido1.setId(1L);
    pedido1.setStatus("pronto");
    pedido1.setCliente("wesley");
    pedido1.setPrecoTotal(12.1);

    return List.of(pedido1, criandoUmPedidoComStatusAguardando());
  }

  public static Pedido criandoUmPedidoComStatusAguardando() {
    Pedido pedido = new Pedido();
    pedido.setId(2L);
    pedido.setStatus("aguardando");
    pedido.setCliente("michelly");
    pedido.setPrecoTotal(15.1);

    return pedido;
  }
}
