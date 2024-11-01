package com.ibeus.Comanda.Digital.controller;

import com.ibeus.Comanda.Digital.model.Pedido;
import com.ibeus.Comanda.Digital.service.PedidoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<Pedido> listarPedidos(@RequestParam(required = false) String status) {
        return pedidoService.listarPedidos(status);
    }

    @PatchMapping("/{id}")
    public Pedido atualizarStatus(@PathVariable Long id, @RequestBody Map<String, String> status) {
        return pedidoService.atualizarStatus(id, status.get("status"));
    }

    @GetMapping("/{id}/status")
    public String obterStatus(@PathVariable Long id) {
        return pedidoService.obterStatus(id);
    }

    // Novo método POST para criar um pedido
    @PostMapping
    public Pedido criarPedido(@RequestBody Pedido novoPedido) {
        return pedidoService.salvarPedido(novoPedido);
    }
}
