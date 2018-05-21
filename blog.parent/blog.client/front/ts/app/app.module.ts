import {NgModule} from "@angular/core";
import {AppComponent} from "./app.component";
import {BrowserModule} from "@angular/platform-browser";
import {HttpService} from "../provider/HttpService";
import {HttpModule} from "@angular/http";
import {APP_BASE_HREF} from "@angular/common";

import {Routes, RouterModule} from '@angular/router';
import { SinglepostComponent} from "./singlepost.component";
import {PostsComponent} from "./posts.component";
import {LoginComponent} from "./login.component";
import {FormsModule} from "@angular/forms";

const appRoutes:Routes=[
    {path:'',component:PostsComponent},
    {path:'post',component:SinglepostComponent},
    {path:'login',component:LoginComponent}
];

@NgModule({
  imports:[
    FormsModule,BrowserModule, HttpModule,RouterModule.forRoot(appRoutes)
  ],
  declarations:[AppComponent,SinglepostComponent,PostsComponent,LoginComponent],
  bootstrap:[AppComponent],
  entryComponents:[AppComponent],
  providers:[HttpService,{provide: APP_BASE_HREF, useValue: '/blog/blog'}]
})
export class AppModule {

}