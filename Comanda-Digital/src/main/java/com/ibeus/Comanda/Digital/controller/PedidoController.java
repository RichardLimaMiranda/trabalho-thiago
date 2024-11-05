package com.ibeus.Comanda.Digital.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibeus.Comanda.Digital.model.Pedido;
import com.ibeus.Comanda.Digital.service.PedidoService;
@CrossOrigin(origins = "http://localhost:4200")
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
