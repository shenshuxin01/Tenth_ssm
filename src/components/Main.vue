<template>
<div>
  输入name插入到数据库：
  <input v-model="p_name">
  <br><button @click="insertToDB">确定</button>
</div>
</template>

<script>
import axios from "axios";
export default {
  name: "Main",
  data(){
    return{
      p_name : ''
    }
  },
  methods:{
    insertToDB:function () {
    axios.post('http://192.168.192.129:7001/Tenth_SSM_Java-1.0-SNAPSHOT/tenth/addname.do',{'p_name':this.p_name})
      .then(response =>{
        alert("操作结果："+response.data.yesno)
      })
    }
  }
}
</script>

<style scoped>

</style>
