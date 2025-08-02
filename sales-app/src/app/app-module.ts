import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { provideNzI18n } from 'ng-zorro-antd/i18n';
import { es_ES } from 'ng-zorro-antd/i18n';
import { registerLocaleData } from '@angular/common';
import es from '@angular/common/locales/es';
import { FormsModule } from '@angular/forms';
import { provideAnimationsAsync } from '@angular/platform-browser/animations/async';
import { provideHttpClient } from '@angular/common/http';
import { HomePage } from './features/home-page/home-page';

import { NzDividerModule } from 'ng-zorro-antd/divider';
import { NzTableModule } from 'ng-zorro-antd/table';
import { NzSelectModule } from 'ng-zorro-antd/select';
import { NzIconModule } from 'ng-zorro-antd/icon';
registerLocaleData(es);

@NgModule({
  declarations: [App, HomePage],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    NzDividerModule,
    NzTableModule,
    NzSelectModule,
    NzIconModule
  ],
  providers: [
    provideBrowserGlobalErrorListeners(),
    provideNzI18n(es_ES),
    provideAnimationsAsync(),
    provideHttpClient(),
  ],
  bootstrap: [App],
})
export class AppModule {}
