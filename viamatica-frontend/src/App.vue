<template>
  <div id="app">
    <Navigation/>
  </div>
</template>

<script>
//import Todos from './components/Todos';
import Navigation from './components/Navigation';

export default {
  name: 'app',
  components: {
    Navigation
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
  margin-top: 10px;
  
}
</style>
