import { MatInputModule } from '@angular/material/input';
import { MatSelectModule } from '@angular/material/select';
import { NgModule } from '@angular/core';

@NgModule({
  exports: [MatInputModule, MatSelectModule],
})
export class MaterialModule {}
