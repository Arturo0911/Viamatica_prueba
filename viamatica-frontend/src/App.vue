<template>
  <div id="app">
    <!--<Sector v-bind:todos="todos"/>-->
    <div id="nav">
      <router-link to="/persona">Persona<router-link>
      <router-link to="/sector">Sector<router-link>
      <router-link to="/zona">Zona<router-link>
    </div>
    <router-view/>
  </div>
</template>
<!--<script>
import Navigation from './components/Navigation';


export default {
  name: 'App',
  components: Navigation
}
</script>-->
<!--<script>
/*import Sector from './components/Sector';
import axios from 'axios';
const springApi = 'http://localhost:8081/sector/getSectors'; // endpoint from Spring
//import Navigation from './components/Navigation';

export default {
  name: 'app',
  components: {
    Sector
  },    
  data(){
    return{
      todos:[]
    }
  },created(){
    axios.get(springApi)
      .then(res => this.todos=res.data)
      .catch(err => console.log(err))
  }
}*/
</script>-->

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-left: 60px;
  margin-top: 10px;
  
}
</style>
