<template>
    <div>
        <td>{{late.name}}</td>
        <td>{{late.minutes}}</td>
        <td>{{late.delayDate}}</td>
    </div>
</template>

<script>
    export default {
        name: "TableRow",
        props: ["late"]
    }
</script>

<style scoped>

</style>