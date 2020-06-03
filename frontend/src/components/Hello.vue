<template>
  <div class="hello">
    <img src="./../assets/spring-boot-vuejs-logo.png">
    <h1>{{ hellomsg }}</h1>
    <h2>See the sources here: </h2>
    <ul>
      <li><a href="https://github.com/jonashackt/spring-boot-vuejs" target="_blank">github.com/jonashackt/spring-boot-vuejs</a></li>
    </ul>
    <h3>This site contains more stuff :)</h3>
    <ul>
        <li>Késés mentése:</li>
        <li><router-link to="/delay">/delay</router-link></li>
        <li>Ranglista:</li>
        <li><router-link to="/ranking">/ranking</router-link></li>
    </ul>
  </div>
</template>

<script>
export default {
  name: 'Hello',
  props: { hellomsg: { type: String, required: true } }
}

</script>

<style scoped>
h1, h2 {
  font-weight: normal;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #42b983;
}
</style>
