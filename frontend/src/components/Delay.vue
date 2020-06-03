<template>
  <div class="user">
    <h1>Késés felvitele</h1>
    <form>
      <div class="form-group row">
        <label for="name" class="col-sm-2 col-form-label">Késő neve</label>
        <div class="col-6">
          <input type="text" class="form-control" id="name" v-model="late.name">
        </div>
      </div>
      <div class="form-group row">
        <label for="name" class="col-sm-2 col-form-label">Késés percben</label>
        <div class="col-6">
          <input type="number" class="form-control" id="minutes" v-model="late.minutes">
        </div>
      </div>
      <div class="form-group row">
        <label for="delayDate" class="col-sm-2 col-form-label">Késés időpontja</label>
        <div class="col-6">
          <input type="date" class="form-control" id="delayDate" v-model="late.delayDate">
        </div>
      </div>
      <div class="form-group">
        <button class="btn btn-primary" @click="createNewUser()">Késő felvétele</button>
      </div>
    </form>

    <br/>

    <Table v-bind:lates="lates" v-bind:showDelayDate="true"/>


  </div>
</template>

<script>
  import api from "./backend-api";
  import Table from "./Table";
  import {mapState} from "vuex";

  export default {
    name: 'user',
    components: {Table},
    data () {
      return {
        late: {
          name: '',
          minutes: '',
          delayDate: ''
        }
      }
    },
    created() {
      this.$store.dispatch("getDelays")
    },
    methods: {
      createNewUser () {
        const payload = {
            name: this.late.name,
            minutes: this.late.minutes,
            delayDate: this.late.delayDate
        }
        api.createUser(payload).then(response => {
            this.$store.commit('getDelays', response.data);
          })
          .catch(e => {
            this.errors.push(e)
          })
      }
    },
    computed: {
      ...mapState({
          lates: 'lates'
              },
      )
    },
  }

</script>


<!-- Add "scoped" attribute to limit CSS to this component only -->
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
