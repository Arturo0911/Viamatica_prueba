<template>
  <div>
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
				<td> {{zona.zoneCode}} </td>
				<td> {{zona.zoneDescription}} </td>
        <td> {{zona.sector.sectorCode}} </td>
			</tr>

      </tbody>
    </table>
  </div>
</template>

<script>
export default {
  name: 'ZonaValues',
  props: ["zonas"]
}
</script>>

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