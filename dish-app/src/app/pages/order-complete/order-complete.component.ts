import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Location } from '@angular/common';

@Component({
  selector: 'app-order-complete',
  standalone: true,
  templateUrl: './order-complete.component.html',
  styleUrls: ['./order-complete.component.css']
})
export class OrderCompleteComponent {
  constructor(private location: Location, private router: Router) {}

  goBack() {
    this.location.back();
  }

  goNext() {
    this.router.navigate(['/order-cancelled']);
  }
  
}
