import {Component, OnInit} from "@angular/core";
import {HttpService} from "../provider/HttpService";
import "rxjs/add/operator/toPromise";
import {Post} from "./singlepost/post";


@Component({
    selector: 'blog1_app',
    template: `
        <div id="fullPage">
           <p> Text is {{text}}</p>
            <button (click)="getHello()">Click me</button>
        </div>
        <div  *ngFor="let post of posts">
            
            <h3>
                {{post.title}}
            </h3>
            <p>
                {{post.content}}
            </p>
        </div><!-- single-post -->
    `
})
export class HelloComponent implements OnInit {
    private text: string;

    ngOnInit(): void {

    }

    getHello(){
        this.httpService.get("/getHello").toPromise().then(
            result => {
                this.text = result.json();
            },
            error => {
                this.text = "Something is wrong";
            }
        )
    }

    constructor(private httpService: HttpService) {

    }


}