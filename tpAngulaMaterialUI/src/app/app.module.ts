import { MaterialModule } from './material-module';
import { Input, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { InputComponent } from './input/input.component';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AutocompleteComponent } from './component/autocomplete/autocomplete.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MenubarComponent } from './component/menubar/menubar.component';
import { HomeComponent } from './component/home/home.component';
import { HttpClientModule } from '@angular/common/http';
import { AssociateComponent } from './component/associate/associate.component';
import { CardComponent } from './component/card/card.component';
import { FormdesignComponent } from './component/formdesign/formdesign.component';
import { PopupComponent } from './component/popup/popup.component';
import { TableComponent } from './component/table/table.component';
import { SliderComponent } from './component/slider/slider.component';
import { UserdetailComponent } from './component/userdetail/userdetail.component';

@NgModule({
  declarations: [
    AppComponent,
    InputComponent,
    AutocompleteComponent,
    MenubarComponent,
    HomeComponent,
    AssociateComponent,
    CardComponent,
    FormdesignComponent,
    PopupComponent,
    TableComponent,
    SliderComponent,
    UserdetailComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
