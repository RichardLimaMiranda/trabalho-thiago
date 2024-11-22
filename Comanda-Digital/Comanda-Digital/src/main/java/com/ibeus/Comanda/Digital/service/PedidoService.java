package com.ibeus.Comanda.Digital.service;

import java.util.List;

import com.ibeus.Comanda.Digital.exception.ComandaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.ibeus.Comanda.Digital.model.Pedido;
import com.ibeus.Comanda.Digital.repository.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> listarPedidos(String status) {
        // Lógica para listar pedidos com filtro de status, se necessário
        return status == null ? pedidoRepository.findAll() : pedidoRepository.findByStatus(status);
    }

    public Pedido atualizarStatus(Long id, String status) {
      Pedido pedido = buscarPedidoPorId(id);
        pedido.setStatus(status);
        return pedidoRepository.save(pedido);
    }

    public String obterStatus(Long id) {
        Pedido pedido = buscarPedidoPorId(id);
        return pedido.getStatus();
    }

    private Pedido buscarPedidoPorId(Long id) {
      return pedidoRepository.findById(id)
        .orElseThrow(() -> new ComandaException(String.format("Pedido com o id %s não foi encontrado", id), HttpStatus.NOT_FOUND));
    }

    // Método para salvar um novo pedido
    public Pedido salvarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }
}
