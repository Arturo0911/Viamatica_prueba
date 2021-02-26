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
    <!--<div v-bind:key="todo.id" v-for="todo in todos">
      <h3>{{ todo.sectorCode }}</h3>
      <p>{{ todo.sectorDescription }}</p>
    </div>-->
  </div>
</template>

<script>
export default {
  name: "Sector",
  props: ["todos"],
};
</script>

<style scoped></style>
