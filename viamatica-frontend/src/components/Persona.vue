<template>
    <div></div>
</template>


<script>

import axios from 'axios';
const personAPI = "http://localhost:8081/personas";





export default {
    name: "Persona",
    data(){
        return{
            personas:[]
        }
    }, created(){
        axios.get(personAPI)
            .then(res => this.personas = res.data)
            .catch(err => console.log(err))
    }
}
</script>
