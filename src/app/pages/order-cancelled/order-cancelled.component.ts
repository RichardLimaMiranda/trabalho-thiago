import { Component } from '@angular/core';
import { Location } from '@angular/common';

@Component({
  selector: 'app-order-cancelled',
  standalone: true,
  imports: [],
  templateUrl: './order-cancelled.component.html',
  styleUrls: ['./order-cancelled.component.css']
})
export class OrderCancelledComponent {
  constructor(private location: Location) {}

  goBack() {
    this.location.back();
  }
}
