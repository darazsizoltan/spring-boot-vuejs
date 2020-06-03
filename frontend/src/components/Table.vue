<template>
    <div>
        <table class="table">
            <thead>
                <tr>
                    <th scope="col" >Név</th>
                    <th scope="col" >Késés percben</th>
                    <th scope="col" v-if="isDelayDate">Késés napja</th>
                </tr>
            </thead>
            <tbody>
                <tr v-bind:key="late.id" v-for="late in lates">
                    <td>{{late.name}}</td>
                    <td>{{late.minutes}}</td>
                    <td>{{late.delayDate}}</td>
                </tr>
            </tbody>
        </table>
    </div>

</template>

<script>
    import TableRow from "./TableRow";

    export default {
        name: "Table",
        components: {TableRow},
        props: ["lates", "names", "showDelayDate"],
        computed: {
            isDelayDate: function() {
                return this.showDelayDate;
            }
        }
    }

</script>

<style scoped>
</style>