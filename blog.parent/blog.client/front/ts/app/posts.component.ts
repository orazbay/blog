import {Component, OnInit} from "@angular/core";
import {HttpService} from "../provider/HttpService";
import {Post} from "./singlepost/post";
import {Router} from "@angular/router";



@Component({
    selector: 'posts_app',
    // templateUrl: require(`./post.component.html`)
    template: `
        
        <div class="blog-posts">
            <div class="single-post about-author" *ngFor="let post of posts">
                <div class="image-wrapper"><img src="{{post.image_title_url}}" alt="Blog Image"></div>
                <p class="date"><em>Monday, October 13, 2017</em></p>
                <h3 class="title"><a href="#"><b class="light-color">
                    {{post.title}}
                </b></a></h3>
                <p>
                    {{post.content}}
                </p>
                <a class="btn read-more-btn" href="#"><b>READ MORE</b></a>
            </div><!-- single-post -->


        </div><!-- blog-posts -->`,
    styles: [`

        html {
            font-size: 100%;
            height: 100%;
            overflow-x: hidden;
            touch-action: manipulation;
        }

        body {
            font-size: 15px;
            font-family: 'Roboto', sans-serif;
            width: 100%;
            height: 100%;
            margin: 0;
            font-weight: 400;
            -webkit-font-smoothing: antialiased;
            -moz-osx-font-smoothing: grayscale;
            word-wrap: break-word;
            color: #000;
        }
       

        h1, h2, h3, h4, h5, h6, p, a, ul, span, li, img, inpot, button {
            margin: 0;
            padding: 0;
        }

        h1, h2, h3, h4, h5, h6 {
            line-height: 1.5;
            font-weight: inherit;
        }

        p {
            line-height: 1.6;
            font-size: 1.05em;
            font-family: 'Maven Pro', sans-serif;
            font-weight: 400;
            color: #555;
        }

        h1 {
            font-size: 4em;
            line-height: 1;
        }

        h2 {
            font-size: 2.8em;
            line-height: 1.1;
        }

        h3 {
            font-size: 1.8em;
        }

        h4 {
            font-size: 1.5em;
        }

        h5 {
            font-size: 1.2em;
        }

        h6 {
            font-size: .9em;
            letter-spacing: 1px;
        }

        a, button {
            display: inline-block;
            text-decoration: none;
            color: inherit;
            transition: all .3s;
        }

        a:focus, a:active, a:hover,
        button:focus, button:active, button:hover,
        a b.light-color:hover {
            text-decoration: none;
            color: #FFAD4D;
        }

        b {
            font-weight: 500;
        }

        li {
            list-style: none;
            display: inline-block;
        }

        span {
            display: inline-block;
        }

        button {
            outline: 0;
            border: 0;
            background: none;
            cursor: pointer;
        }

        b.light-color {
            color: #444;
        }

        /* ---------------------------------
        2. COMMONS FOR PAGE DESIGN
        --------------------------------- */

        .btn {
            font-size: .9em;
            padding: 15px 30px;
            border-radius: 1px;
            letter-spacing: 2px;
            border: 1px solid #FFAD4D;
            background: #FFAD4D;
            color: #fff;
        }

        .btn:hover {
            color: #FFAD4D;
            background: none;
        }

        .btn-2 {
            background: none;
            color: #FFAD4D;
        }

        .btn-2:hover {
            background: #FFAD4D;
            color: #fff;
        }

        .section {
            padding: 70px 0 40px;
        }

        .section .heading {
            padding-bottom: 70px;
        }

        .center-text {
            text-align: center;
        }

        .color-white {
            color: #fff;
        }

        .display-table {
            display: table;
            height: 100%;
            width: 100%;
        }

        .display-table-cell {
            display: table-cell;
            vertical-align: middle;
        }

        .card {
            background: transparent;
            border: 0;
        }

        .no-side-padding {
            padding-right: 0px;
            padding-left: 0px;
        }

        .no-left-padding {
            padding-left: 0px;
        }

        .no-right-padding {
            padding-right: 0px;
        }

        .icon {
            font-size: 2em;
        }

        .left-area {
            float: left;
        }

        .right-area {
            float: right;
        }

        .width-60 {
            width: 60%;
        }

        .width-50 {
            width: 50%;
        }

        ::-webkit-input-placeholder {
            font-size: .9em;
            letter-spacing: 1px;
        }

        ::-moz-placeholder {
            font-size: .9em;
            letter-spacing: 1px;
        }

        :-ms-input-placeholder {
            font-size: .9em;
            letter-spacing: 1px;
        }

        :-moz-placeholder {
            font-size: .9em;
            letter-spacing: 1px;
        }

        /* ---------------------------------
        3. MENU
        --------------------------------- */

        header {
            position: absolute;
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
            line-height: 45px;
            overflow: hidden;
            font-size: .95em;
            font-style: italic;
        }

        header .top-menu ul.welcome-area {
            padding-left: 20px;
        }

        header .top-menu ul.welcome-area > li {
            margin: 0 15px;
            padding: 0 15px;
            border-left: 1px solid #ddd;
        }

        header .top-menu ul > li:first-child {
            border-left: 0;
        }

        header .top-menu ul.social-icons {
            display: inline-block;
            padding: 0 35px;
            color: #aaa;
        }

        header .top-menu ul.social-icons > li > a {
            padding: 0 15px;
        }

        /* SEARCH AREA */

        header .src-area {
            position: relative;
            float: left;
            height: 45px;
            width: 250px;
            display: inline-block;
            border-left: 1px solid #ddd;
            border-right: 1px solid #ddd;
            background: #fff;
        }

        header .src-area .src-input {
            position: absolute;
            top: 0;
            bottom: 0;
            left: 0;
            right: 0;
            width: 100%;
            padding: 0 40px 0 20px;
            background: transparent;
            border: 0;
            outline: 0;
        }

        header .src-area .src-input:focus {
            box-shadow: 0px 0px 1px #aaa;
        }

        header .src-area .src-btn {
            position: absolute;
            top: 0;
            bottom: 0;
            right: 0;
            width: 40px;
            font-size: 1.2em;
            opacity: .6;
            z-index: 10;
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
            height: 100%;
            width: auto;
        }

        /* BOTTOM AREA */

        header .bottom-area {
            text-align: center;
        }

        header .main-menu {
            font-weight: 500;
        }

        header .main-menu > li > a {
            height: 60px;
            line-height: 60px;
            padding: 0 25px;
        }

        header .main-menu > li > a:hover {
            background: #eee;
        }

        header .visible.main-menu {
            display: block;
        }

        /* DROPDOWN MENU STYLING */

        header .main-menu li.drop-down {
            position: relative;
            text-align: left;
        }

        header .main-menu li.drop-down > ul.drop-down-menu {
            display: none;
            position: absolute;
            top: 60px;
            left: 0;
            min-width: 200px;
            box-shadow: 0px 3px 10px rgba(0, 0, 0, .3);
            background: #fff;
        }

        header .main-menu li.drop-down > ul.drop-down-menu li {
            display: block;
            border-top: 1px solid #ddd;
        }

        header .main-menu li.drop-down > ul.drop-down-menu li > a {
            display: block;
            padding: 12.5px 20px;
        }

        header .main-menu li.drop-down > ul.drop-down-inner li:first-child {
            border-top: 0;
        }

        header .main-menu li i {
            margin-left: 10px;
        }

        /* DROPDOWN SUBMENU */

        header .main-menu li.drop-down > ul.drop-down-inner {
            top: 0;
            left: auto;
            left: 100%;
        }

        /* DROPDOWN HOVER */

        header .main-menu li a.mouseover {
            background: #F2F3F4;
        }

        header .main-menu li.drop-down a.mouseover + ul.drop-down-menu {
            display: block;
            animation: full-opacity-anim .2s forwards;
        }

        @keyframes full-opacity-anim {
            0% {
                opacity: 0;
            }
            100% {
                opacity: 1;
            }
        }

        /* NAV ICON */

        .menu-nav-icon {
            display: none;
            height: 60px;
            width: 50px;
            text-align: center;
            line-height: 60px;
            cursor: pointer;
            font-size: 1.8em;
        }

        /* ---------------------------------
        4. SLIDER
        --------------------------------- */

        .main-slider {
            margin-top: 265px;
            position: relative;
            height: calc(100vh - 265px);
            min-height: 550px;
            width: 100%;
            overflow: hidden;
        }

        .main-slider .slider-content {
            padding: 25px 60px 25px 40px !important;
            border-radius: 3px !important;
            background: rgba(0, 0, 0, .6);
            color: #fff;
        }

        .slider-content .btn {
            padding: 7px 15px;
        }

        .slider-content .title {
            margin: 10px 0 0;
            letter-spacing: 3px;
        }

        #slider {
            height: 100%;
            width: 100%;
        }

        .main-slider .ls-nav-prev,
        .main-slider .ls-nav-next {
            display: block !important;
            opacity: 1 !important;
        }

        /* ---------------------------------
        5. SINGLE POST
        --------------------------------- */

        .blog-posts .single-post {
            margin: 30px 150px 30px 150px;
        }

        .single-post .icons {
            overflow: hidden;
            line-height: 30px;
            margin: 30px 0 10px;
        }

        .single-post .icons .caegory-btn {
            padding: 0 20px;
            height: 30px;
            line-height: 30px;
        }

        .single-post .icons ul.social-icons {
            color: #666;
        }

        .single-post .icons ul.social-icons > li > a {
            padding-left: 15px;
        }

        .single-post .icons ul.social-icons > li > a > i {
            margin-right: 10px;
        }

        .single-post .title {
            margin: 20px 0 15px;
        }

        .single-post .date {
            color: #999;
        }

        .single-post .read-more-btn {
            clear: both;
            margin-top: 30px;
            box-shadow: 1px 10px 15px rgba(0, 0, 0, .15);
            border: 1px solid #FFAD4D;
            background: #fff;
            color: #FFAD4D;
        }

        .single-post .read-more-btn:hover {
            box-shadow: 1px 3px 15px rgba(0, 0, 0, .15);
            background: #FFAD4D;
            color: #fff;
        }

        /* LOAD MORE BUTTON */

        .blog-posts .load-more-btn {
            clear: both;
            margin: 70px 0 30px;
        }

        /* ---------------------------------
        6. SIDEBAR STYLING
        --------------------------------- */

        .sidebar-section {
            margin-bottom: 50px;
        }

        .sidebar-section .title {
            margin-bottom: 30px;
        }

        .sidebar-area img {
            max-width: 600px;
        }

        img {
            display:block;
            height: 100%;
            width: 100%;
        }

        .about-author {
            margin-top: 30px;
            padding: 10px 30px 30px;
            box-shadow: 0px 10px 40px rgba(0, 0, 0, .2);
        }

        /* SEARCH AREA */

        .src-area {
            line-height: 50px;
            position: relative;
        }

        .src-area input {
            display: block;
            width: 100%;
            padding: 0 50px 0 20px;
            border: 0;
            outline: 0;
            border-bottom: 1px solid #bbb;
        }

        .src-area .src-btn {
            position: absolute;
            top: 0;
            right: 20px;
            height: 50px;
        }

        /* NEWSLETTER AREA */

        .newsletter-area {
            padding: 30px;
            background: #29333C;
        }

        .newsletter-area .title {
            margin: 0;
            color: #fff;
        }

        .newsletter-area .email-input {
            width: 100%;
            margin: 15px 0;
            border: 0;
            padding: 10px 20px;
            background: #fff;
        }

        /* CATEGORY AREA */

        .category-area .category {
            position: relative;
            margin-bottom: 20px;
        }

        .category .name {
            position: absolute;
            bottom: 0;
            left: 0;
            right: 0;
            padding: 7px 20px;
            background: #FFAD4D;
            color: #fff;
        }

        /* LATEST POSTS */

        .latest-post {
            overflow: hidden;
            margin-bottom: 20px;
        }

        .latest-post .l-post-image {
            width: 80px;
            float: left;
        }

        .latest-post .post-info {
            margin-left: 100px;
        }

        .latest-post .category-btn {
            padding: 5px 10px;
            margin-bottom: 5px;
        }

        .latest-post .date {
            margin-top: 5px;
            color: #888;
        }

        /* ADVERTISEMENT AREA */

        .advertisement-img {
            position: relative;
        }

        .advertisement-img .discover-btn {
            position: absolute;
            bottom: 30px;
            padding: 15px 0;
            width: 200px;
            left: 50%;
            margin-left: -100px;
            border-color: #fff;
            color: #fff;
        }

        .advertisement-img .discover-btn:hover {
            border-color: #FFAD4D;
        }

        /* INSTAGRAM */

        .instagram-area {
            overflow: hidden;
        }

        .instagram-area .instagram-img > li {
            width: 30%;
            float: left;
            margin: 0 5px 5px 0;
        }

        /* TAGS */

        .tags-area .tags {
            overflow: hidden;
        }

        .tags-area .tags > li {
            float: left;
            margin: 0 5px 5px 0;
        }

        .tags-area .tags > li > a {
            padding: 10px 15px;
        }

        /* ---------------------------------
        7. FOOTER INSTAGRAM STYLING 
        --------------------------------- */

        .footer-instagram-area {
            overflow: hidden;
            border-top: 1px solid #ccc;
        }

        .footer-instagram-area .title {
            padding: 20px 0;
        }

        .footer-instagram-area ul.instagram > li {
            float: left;
            width: 14.285%;
        }

        /* ---------------------------------
        8. FOOTER
        --------------------------------- */

        footer {
            background: #29333C;
            color: #ddd;
        }

        footer .footer-section {
            margin: 30px 0;
        }

        footer .copyright {
            color: #ddd;
        }

        footer .social-icons {
            text-align: right;
        }

        footer .social-icons > li > a {
            padding-left: 15px;
        }`,
            `

            /* Screens Resolution : 992px
            -------------------------------------------------------------------------- */
            @media only screen and (max-width: 1200px) {

            }

            /* Screens Resolution : 992px
            -------------------------------------------------------------------------- */
            @media only screen and (max-width: 992px) {

                /* ---------------------------------
                1. PRIMARY STYLES
                --------------------------------- */
                h1 {
                    font-size: 4em;
                }

                h2 {
                    font-size: 3em;
                }

                h3 {
                    font-size: 2em;
                }

                /* ---------------------------------
                3. MENU
                --------------------------------- */
                header .top-menu ul.welcome-area {
                    padding: 0;
                }

                header .top-menu ul.welcome-area > li {
                    border: 0;
                }

                header .top-menu .hello-blog {
                    display: none;
                }

            }

            /* Screens Resolution : 767px
            -------------------------------------------------------------------------- */
            @media only screen and (max-width: 767px) {

                /* ---------------------------------
                1. PRIMARY STYLES
                --------------------------------- */
                p {
                    line-height: 1.4;
                }

                h1 {
                    font-size: 3em;
                }

                h2 {
                    font-size: 2.5em;
                }

                h3 {
                    font-size: 1.8em;
                }

                h4 {
                    font-size: 1.5em;
                }

                h5 {
                    font-size: 1.2em;
                }

                /* ---------------------------------
                2. COMMONS FOR PAGE DESIGN
                --------------------------------- */
                .section {
                    padding: 40px 0 10px;
                }

                /* ---------------------------------
                3. MENU
                --------------------------------- */
                header .top-menu ul.welcome-area {
                    display: none;
                }

                /* SEARCH AREA */
                header .right-area {
                    float: none;
                }

                header .src-area {
                    float: none;
                    border: 0;
                }

                /* TOP MENU */
                header .top-menu ul.social-icons {
                    display: none;
                }

                /* MIDDLE AREA */
                header .logo {
                    padding: 10px 0;
                    height: 100px;
                }

                /* BOTTOM AREA */
                header .main-menu {
                    text-align: left;
                    display: none;
                    float: none;
                    clear: both;
                    max-height: 400px;
                    overflow: auto;
                    border-top: 1px solid #ccc;
                }

                header .main-menu > li {
                    display: block;
                    float: none;
                    border-bottom: 1px solid #ddd;
                }

                header .main-menu > li:last-child {
                    border-bottom: 0;
                }

                header .main-menu li > a {
                    display: block;
                    line-height: 1;
                    height: auto;
                    padding: 15px;
                    background: none;
                }

                /* DROPDOWN  */
                header .main-menu li.drop-down > ul.drop-down-menu {
                    position: static;
                    box-shadow: none;
                }

                /* DROPDOWN HOVER */
                header .main-menu li.drop-down > ul.drop-down-menu li a {
                    padding-left: 25px;
                }

                header .main-menu li.drop-down > ul.drop-down-inner li a {
                    padding-left: 35px;
                }

                /* SEARCH AREA */
                header .src-area {
                    width: 100%;
                }

                /* NAV ICON */
                .menu-nav-icon {
                    display: inline-block;
                }

                /* ---------------------------------
                4. SLIDER
                --------------------------------- */
                .main-slider {
                    margin-top: 205px;
                    height: calc(400px - 205px);
                    min-height: 350px;
                }

                .main-slider .slider-content {
                    padding: 15px 20px !important;
                    margin-left: 20px !important;
                    top: 30px !important;
                }

                .slider-content .btn {
                    padding: 7px 15px;
                }

                .slider-content .title {
                    letter-spacing: 0px;
                }

                .main-slider .ls-nav-prev,
                .main-slider .ls-nav-next {
                    display: none !important;
                }

                /* ---------------------------------
                5. SINGLE POST
                --------------------------------- */
                .blog-posts .single-post {
                    margin-bottom: 50px;
                }

                /* POST STYLE TWO */


                .post-style-2 .post-details {
                    float: none;
                    width: 100%;
                    margin-top: 30px;
                }

                /* LOAD MORE BUTTON */
                .blog-posts .load-more-btn {
                    margin: 20px 0 60px;
                }

                /* ---------------------------------
                6. SIDEBAR STYLING
                --------------------------------- */
                .sidebar-section {
                    margin-bottom: 30px;
                }

                /* ---------------------------------
                7. FOOTER INSTAGRAM STYLING 
                --------------------------------- */
                .footer-instagram-area ul.instagram > li {
                    width: 25%;
                }

                /* ---------------------------------
                8. FOOTER
                --------------------------------- */
                footer {
                    padding-top: 20px;
                }

                footer .footer-section {
                    margin: 0px 0 20px;
                }

                footer .social-icons {
                    text-align: left;
                }

                footer .social-icons > li > a {
                    padding: 0 15px 0 0;
                }

            }

            /* Screens Resolution : 479px
            -------------------------------------------------------------------------- */
            @media only screen and (max-width: 479px) {

                /* ---------------------------------
                1. PRIMARY STYLES
                --------------------------------- */
                body {
                    font-size: 14px;
                }

                /* ---------------------------------
                2. COMMONS FOR PAGE DESIGN
                --------------------------------- */
                .left-area,
                .right-area {
                    float: none;
                }

                .width-60,
                .width-50 {
                    width: 100%;
                }

                .left-area li a,
                .right-area li a {
                    padding: 0 10px 0 0 !important;
                }

                /* ---------------------------------
                5. SINGLE POST
                --------------------------------- */
                .single-post .icons ul.social-icons {
                    margin-top: 10px;
                }

            }

            /* Screens Resolution : 359px
            -------------------------------------------------------------------------- */
            @media only screen and (max-width: 359px) {

            }

            /* Screens Resolution : 290px
            -------------------------------------------------------------------------- */
            @media only screen and (max-width: 290px) {

            }`]
})
export class PostsComponent implements OnInit{

    constructor(private router:Router,private httpService:HttpService) { }
    posts:Post[];
    error:string="null";
    parameters : { [key: string]: string} = {};

    ngOnInit(): void {
        this.parameters["token"]="-1343743360|1526878925499";
        this.httpService.get("/getAllActivePosts",this.parameters).toPromise().then(

            result => {
                console.log("privet");
                this.posts = result.json();
            },
            error =>{
                this.error = "Something is wrong";
            }
        )
    }

}