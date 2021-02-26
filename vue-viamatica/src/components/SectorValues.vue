<template>
  <div>
    <table class="table table-striped">
      <thead>
        <tr>
          <th scope="col">Sector</th>
          <th scope="col">Descripcion</th>
        </tr>
      </thead>
      <tbody v-bind:key="todo.id" v-for="todo in todos">
		
			<tr>
				<td> {{todo.sectorCode}} </td>
				<td> {{todo.sectorDescription}} </td>
			</tr>

      </tbody>
    </table>
  </div>
</template>

<script>
export default {
  name: 'SectorValues',
  props: ["todos"]
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