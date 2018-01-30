import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { HttpClientModule } from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { RitoperationsComponent } from './ritoperations/ritoperations.component';
import { AdminModule } from './admin/admin.module';
import { SchedulerComponent } from './scheduler/scheduler.component';
import { StoreserverComponent } from './storeserver/storeserver.component';
import { StoreServerService } from './storeserver/storeserver.service'

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    RitoperationsComponent,
    SchedulerComponent,
    StoreserverComponent
  ],
  imports: [
    BrowserModule,
    AdminModule,
    AppRoutingModule,
    HttpClientModule,
    HttpModule
  ],
  providers: [StoreServerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
