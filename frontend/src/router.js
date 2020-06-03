import Vue from 'vue'
import Router from 'vue-router'
import Delay from "./components/Delay";
import Ranking from "./components/Ranking";
import Hello from "./components/Hello";

Vue.use(Router);

const router = new Router({
    mode: 'history',
    routes: [
        { path: '/', component: Hello },
        { path: '/delay', component: Delay },
        { path: '/ranking', component: Ranking },
        // otherwise redirect to home
        { path: '*', redirect: '/' }
    ]
});
export default router;