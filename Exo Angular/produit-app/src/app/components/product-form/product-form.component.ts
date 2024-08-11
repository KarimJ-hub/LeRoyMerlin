import { Component } from '@angular/core';
import { ProductService, Produit } from '../../services/product.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-product-form',
  templateUrl: './product-form.component.html',
  styleUrls: ['./product-form.component.css']
})
export class ProductFormComponent {

  produit: Produit = {
    nom: '',
    prix: 0
  };

  constructor(private productService: ProductService) { }

  onSubmit(form: NgForm): void {
    if (form.valid) {
      this.productService.addProduit(this.produit).subscribe(result => {
        console.log('Produit ajouté', result);
        form.resetForm();
      });
    }
  }
}
