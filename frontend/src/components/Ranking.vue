<template>
    <div>
        <h1>Ranglista</h1>
        <br/>
        <Table v-bind:lates="lates" v-bind:showDelayDate="false"/>
    </div>
</template>

<script>
    import {mapState} from "vuex";
    import Table from "./Table";

    export default {
        name: "Ranking",
        components: {
          Table
        },
        created() {
            this.$store.dispatch("getRankings")
        },
        computed: {
            ...mapState({
                    lates: 'lates'
                },
            )
        },
    }
</script>

<style scoped>

</style>