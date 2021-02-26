<template>
    <div>
        <ZonaValues v-bind:zonas="zonas"/>
    </div>
</template>


<script>
import ZonaValues from '../components/ZonaValues';
import axios from 'axios';
const personAPI = "http://localhost:8082/zone/getZones";

export default {
    name: "Zona",
    components: {ZonaValues},
    data(){
        return{
            zonas:[]
        }
    }, created(){
        axios.get(personAPI)
            .then(res => this.zonas = res.data)
            //.then(res => console.log(res.data[0].sector.sectorCode, res.data[0].zoneCode))
            .catch(err => console.log(err))
    }
}
</script>
