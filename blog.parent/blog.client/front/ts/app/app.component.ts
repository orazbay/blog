import {Component, OnInit} from "@angular/core";
import {HttpService} from "../provider/HttpService";
import "rxjs/add/operator/toPromise";
import {Router} from "@angular/router";

@Component({
    selector: 'blog_app',
    template: `
        <div id="fullPage">
            <header>
                <div class="top-menu">
                    <div class="right-area">
                        <ul class="not-signed" >
                            
                            <li routerLink='login'>sign in</li>
                            |
                            <li routerLink="login"> sign up </li>
                        </ul><!-- right-area -->
                    </div><!-- right-area -->

                </div><!-- top-menu -->
                <div class="middle-menu center-text">
                    <a href="#" class="logo">
                        <img src="posts.png" alt="Logo Image">
                    </a>
                </div>
            </header>
            
            <router-outlet></router-outlet>
        </div>
    `
    ,styles:[`
        
        li:hover {
            color: #ffc65f;
        }

        li {
            font-size: 20px;
            display: inline
        }

        .right-area {
            float: right;
        }

        .center-text {
            text-align: center;
        }

        header .top-menu ul {
            display: inline-block;
            padding: 0 35px;
            color: #aaa;
        }

        /* ---------------------------------
            3. MENU
            --------------------------------- */

        header {
            left: 0;
            right: 0;
            top: 0;
            z-index: 1000;
            font-size: .95em;
            box-shadow: 0px 2px 10px rgba(0, 0, 0, .3);
            background: #fff;
        }

        /* TOP MENU */

        header .top-menu {
            width: 100%;
            height: 45px;
            overflow: hidden;
            font-size: .95em;
            font-style: italic;
        }

        /* MIDDLE AREA */

        header .middle-menu {
            border-top: 1px solid #ddd;
            border-bottom: 1px solid #ddd;
        }

        header .logo {
            padding: 30px 0;
            height: 160px;
        }

        header .logo img {
            height: 250px;
            width: 250px;
        }

        @keyframes full-opacity-anim {
            0% {
                opacity: 0;
            }
            100% {
                opacity: 1;
            }
        }`]
})
export class AppComponent implements OnInit {
    private text: string;

    ngOnInit(): void {
        this.httpService.get("/getMainText").toPromise().then(
            result => {
                this.text = result.json();
            },
            error => {
                this.text = "Something is wrong";
            }
        )
    }

    constructor(private httpService: HttpService,private router:Router) {

    }

}