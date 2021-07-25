<template>
<div>
  点击登录到主页面<br>
  <button @click="gotoMain"> 登录</button>
</div>
</template>

<script>
export default {
  name: "Login",
  methods:{
    gotoMain:function () {
      this.$router.push({path:'/main'})
    }
  }
}
</script>

<style scoped>

</style>
