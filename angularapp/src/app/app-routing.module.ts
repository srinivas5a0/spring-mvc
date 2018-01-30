import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DashboardComponent } from "./dashboard/dashboard.component";
import { RitoperationsComponent } from "./ritoperations/ritoperations.component";
import { StoreserverComponent } from "./storeserver/storeserver.component"

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: '/dashboard'  },
  { path: 'dashboard', component: DashboardComponent},
  { path: 'ritoperations', component: RitoperationsComponent},
  { path: 'stores', component: StoreserverComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
