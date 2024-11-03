import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { observable } from 'rxjs';

export interface Pedido {
  id: number;
  cliente: string;
  preco_total: number;
  status: string;
}

@Injectable({
  providedIn: 'root'
})
export class PedidoService {

  constructor() { }
}
