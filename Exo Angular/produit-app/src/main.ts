import { bootstrapApplication } from '@angular/platform-browser';
import { provideRouter, Router, Routes } from '@angular/router';
import { provideHttpClient } from '@angular/common/http';
import { AppComponent } from './app/app.component';
import { FormsModule } from '@angular/forms';

// Routes
const routes: Routes = [];

// Bootstrap l'application
bootstrapApplication(AppComponent, {
  providers: [
    provideRouter(routes),
    provideHttpClient(),
    FormsModule
  ]
});
