<template>
  <div>
    <div class="container">
      <div class="row">
        <div class="col-md-5">
          <div class="card">
            <div class="card-body">
              <form @submit.prevent="addZona(zona.zoneCode,zona.zoneDescription,sectores,
              zona.sectorCode)">
                <div class="form-group">
                  <input
                    v-model="zona.zoneCode"
                    required
                    type="text"
                    placeholder="Zona"
                    class="form-control"
                  />
                </div>
                <div class="form-group">
                  <textarea
                    v-model="zona.zoneDescription"
                    required
                    placeholder="descripción"
                    class="form-control"
                  />
                </div>
                <div class="form-group">
                  <select v-model="zona.sectorCode"  class="form-control">
                    <option v-bind:key="sector.id" v-for="sector in sectores">{{
                      sector.sectorCode
                    }}</option>
                  </select>
                </div>
                <button type="submit" class="btn btn-block btn-success">
                  Agregar
                </button>
              </form>
            </div>
          </div>
        </div>
        <div class="col-md-7">
          <table class="table table-striped">
            <thead>
              <tr>
                <th scope="col">zona</th>
                <th scope="col">Descripcion</th>
                <th scope="col">sector</th>
              </tr>
            </thead>
            <tbody v-bind:key="zona.id" v-for="zona in zonas">
              <tr>
                <td>{{ zona.zoneCode }}</td>
                <td>{{ zona.zoneDescription }}</td>
                <td>{{ zona.sector.sectorCode }}</td>
              </tr>
            </tbody>
          </table>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "ZonaValues",
  props: ["zonas"],
  data(){
    return{
      sectores:[],
      zona:{
        zoneCode: '',
        zoneDescription:'',
        sector: {
            sectorCode: '',
            sectorDescription: ""
        }
    }
    }
  },
  created(){
    this.loadSectores();
  },
  methods: {
    loadSectores(){
        fetch('http://localhost:8082/sector/getSectors')
          .then(res => res.json())
          .then(data => {
            this.sectores = data;
            console.log(this.sectores);
          })
    },
    addZona(code, desc,sectores, sector){
        let sectorDsc = "";

        sectores.forEach(element => {
            if (element.sectorCode === sector){
              sectorDsc = element.sectorDescription;
            }
        });

        fetch("http://localhost:8082/zone/saveZone", {
        method: "POST",
        body: JSON.stringify({
          zoneCode:code ,
          zoneDescription:desc ,
          sector: {
              sectorCode:sector ,
              sectorDescription:sectorDsc 
          }
    }),
        headers: {
          Accept: "application/json",
          "Content-type": "application/json",
        },
      })
        .then((res) => res.json())
        .then((data) => console.log(data));

        this.zona.zoneCode = '';
        this.zona.zoneDescription = '';
        this.zona.sector.sectorCode = '';
        this.zona.sector.sectorDescription = '';

    }
  }
};
</script>
>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  font-size: 18px;
}
</style>
