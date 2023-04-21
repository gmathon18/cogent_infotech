import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { HomeComponentComponent } from './home-component/home-component.component';
import { AboutComponentComponent } from './about-component/about-component.component';
import { ContactComponentComponent } from './contact-component/contact-component.component';
import { CareerComponentComponent } from './career-component/career-component.component';
import { NoPageFoundComponentComponent } from './no-page-found-component/no-page-found-component.component'


const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: 'home', component: HomeComponentComponent },
  { path: 'about', component: AboutComponentComponent },
  { path: 'contact', component: ContactComponentComponent },
  { path: 'career', component: CareerComponentComponent },
  { path: '**', component: NoPageFoundComponentComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
