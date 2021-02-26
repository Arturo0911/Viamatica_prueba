<template>
  <div id="app">
    <b-navbar toggleable="md" type="dark" variant="info">
      <b-container>
        <b-navbar-brand href="#">NavBar</b-navbar-brand>

        <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

        <b-collapse id="nav-collapse" is-nav>
          <b-navbar-nav>
            <b-nav-item :to="{name: 'Persona'}">Personas</b-nav-item>
            <b-nav-item :to="{name: 'Sector'}">Sectores</b-nav-item>
            <b-nav-item :to="{name: 'Zona'}">Zona</b-nav-item>
          </b-navbar-nav>

          <!-- Right aligned nav items -->
          <b-navbar-nav class="mr-auto">
            <b-nav-item-dropdown right>
              <!-- Using 'button-content' slot -->
              <template #button-content>
                <em>Persona</em>
              </template>
              <b-dropdown-item href="#">Crear persona</b-dropdown-item>
              <b-dropdown-item href="#">Ver persona</b-dropdown-item>
              <b-dropdown-item href="#">Eliminar persona</b-dropdown-item>
              <b-dropdown-item href="#">Actualizar persona</b-dropdown-item>
            </b-nav-item-dropdown>
          </b-navbar-nav>
        </b-collapse>
      </b-container>
    </b-navbar>
    <router-view />
  </div>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
