import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface Produit {
  id?: number;
  nom: string;
  prix: number;
}

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private apiUrl = 'http://localhost:8080/produits';  // Remplace avec l'URL de l'API Spring Boot

  constructor(private http: HttpClient) { }

  // Récupérer la liste des produits
  getProduits(): Observable<Produit[]> {
    return this.http.get<Produit[]>(this.apiUrl);
  }

  // Ajouter un nouveau produit
  addProduit(produit: Produit): Observable<Produit> {
    return this.http.post<Produit>(this.apiUrl, produit);
  }
}
