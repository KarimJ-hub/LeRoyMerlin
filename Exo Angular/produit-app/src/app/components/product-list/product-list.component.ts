import { Component, OnInit } from '@angular/core';
import { ProductService, Produit } from '../../services/product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  produits: Produit[] = [];

  constructor(private productService: ProductService) { }

  ngOnInit(): void {
    this.productService.getProduits().subscribe(data => {
      this.produits = data;
    });
  }
}
