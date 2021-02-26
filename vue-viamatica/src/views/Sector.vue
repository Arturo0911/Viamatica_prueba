<template>
  <div id="app">
    <SectorValues v-bind:todos="todos"/>
  </div>
</template>

<script>
import SectorValues from '../components/SectorValues';
import axios from 'axios';
const springApi = 'http://localhost:8082/sector/getSectors'; // endpoint from Spring


export default {
  name: "Sector",
  components: {SectorValues},
  data(){
    return{
      todos:[]
    }
  },created(){
    axios.get(springApi)
      .then(res => this.todos=res.data)
      .catch(err => console.log(err))
  }
};
</script>

<style scoped></style>
