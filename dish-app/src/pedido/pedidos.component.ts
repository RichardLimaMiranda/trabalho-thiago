import { Component, OnInit } from '@angular/core';
import { PedidoService, Pedido } from './pedido.service';
import { CommonModule } from '@angular/common'; // Importe o CommonModule para standalone

@Component({
  selector: 'app-pedidos',
  standalone: true,
  imports: [CommonModule], // Importando o CommonModule para standalone
  templateUrl: './pedidos.component.html',
  styleUrls: ['./pedidos.component.css'] // Corrigido para styleUrls
})
export class PedidosComponent implements OnInit {
  pedidos: Pedido[] = [];

  constructor(private pedidoService: PedidoService) {}

  ngOnInit(): void {
    this.pedidoService.getPedidos().subscribe(data => {
      this.pedidos = data;
    });
  }
}
