import { createRouter, createWebHistory, RouteRecordRaw } from 'vue-router'
import HomeView from '../views/MasterView.vue'

const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/management',
    name: 'ManagementView',
    component: () => import(/* webpackChunkName: "about" */ '../views/ManagementView.vue')
  },
  {
    path: '/meal',
    name: 'MealView',
    component: () => import(/* webpackChunkName: "about" */ '../views/MealView.vue')
  },
  {
    path: '/product',
    name: 'ProductView',
    component: () => import(/* webpackChunkName: "about" */ '../views/ProductView.vue')
  },
  {
    path: '/register',
    name: 'RegisterView',
    component: () => import(/* webpackChunkName: "about" */ '../views/RegisterView.vue')
  },
  {
    path: '/login',
    name: 'LoginView',
    component: () => import(/* webpackChunkName: "about" */ '../views/LoginView.vue')
  },
  {
    path: '/logout',
    name: 'LogoutView',
    component: () => import(/* webpackChunkName: "about" */ '../views/LoginView.vue')
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
