import { Component } from '@angular/core';
import { Router } from '@angular/router'; // Importação do Router
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-menu',
  standalone: true,
  imports: [CommonModule], // Adicione aqui o CommonModule
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent {
  sorvetes = [
    {
      name: 'Sorvete de Chocolate',
      description: 'Água filtrada, açúcar, leite em pó integral, cacau em pó, chocolate em pó.',
      price: 10.70,
      image: 'assets/images/sorvete-chocolate.jpg'
    },
    {
      name: 'Sorvete de Morango',
      description: 'Água filtrada, morango, açúcar, espessantes e gorduras vegetais.',
      price: 14.80,
      image: 'assets/images/sorvete-morango.jpg'
    },
    {
      name: 'Sorvete de Flocos',
      description: 'Água filtrada, açúcar, leite em pó integral, chocolate em pó, coco.',
      price: 16.50,
      image: 'assets/images/sorvete-flocos.jpg'
    }
  ];

  constructor(private router: Router) {} // Injeção do Router no construtor

  goToProductDetails(sorvete: any) {
    // Navegar para a página de detalhes do produto com o sorvete selecionado
    this.router.navigate(['/product-details'], { state: { sorvete } });
  }

  goBack() {
    // Navegar para a página de boas-vindas
    this.router.navigate(['/welcome']);
  }
}
