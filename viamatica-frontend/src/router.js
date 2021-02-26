import Vue from 'vue';
import Router from 'vue-router';


Vue.use(Router)

export default new Router({
    mode:'history',
    base:process.env.BASE_URL,
    routes : [
        {
            path: '/persona',
            name: 'persona',
            component:() => import (/**/'./views/Persona.vue')
        },
        {
            path: '/zona',
            name: 'zona',
            component:() => import (/**/'./views/Zona.vue')
        },
        {
            path: '/sector',
            name: 'sector',
            component:() => import (/**/'./views/Sector.vue')
        }
]})
