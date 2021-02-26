<template>
  <div id="app">
    <Sector v-bind:todos="todos"/>
  </div>
</template>

<script>
import Sector from './components/Sector';
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
}
</script>

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
