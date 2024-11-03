import { Component } from '@angular/core';
import { Location } from '@angular/common';
import { Router } from '@angular/router'; // Importe o Router para navegação

@Component({
  selector: 'app-product-details',
  standalone: true,
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent {
  constructor(private location: Location, private router: Router) {} // Injetar o Router

  goBack() {
    this.location.back();
  }

  goToDeliveryStatus() {
    this.router.navigate(['/delivery-status']); // Navegação para a tela de entrega
  }
}
