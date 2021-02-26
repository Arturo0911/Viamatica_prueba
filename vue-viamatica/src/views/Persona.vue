<template>
    <div>
        <PersonaValues v-bind:personas="personas"/>
    </div>
</template>


<script>
import PersonaValues from '../components/PersonaValues';
import axios from 'axios';
const personAPI = "http://localhost:8082/personas";

export default {
    name: "Persona",
    components: {PersonaValues},
    data(){
        return{
            personas:[]
        }
    }, created(){
        axios.get(personAPI)
            .then(res => this.personas = res.data.response)
            .catch(err => console.log(err))
    }
}
</script>
