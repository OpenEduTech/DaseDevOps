<template>
  <div class="container fixed-center" style="width: 40%;">
    <q-card>
      <div class="text-h4 text-center q-pa-md">登&nbsp;&nbsp;录</div>
      <div class="q-px-lg q-pb-lg q-gutter-y-lg">
        <q-input filled v-model="username" type="text" label="账号："/>
        <q-input filled v-model="password" type="password" label="密码："/>
        <q-btn class="full-width" label="登录" color="positive"
                @click="getLogin" />
      </div>
    </q-card>
  </div>
</template>

<script>
export default {
  name: 'login',
  data () {
    return {
      username: '',
      password: ''
    }
  },
  methods: {
    getLogin () {
      if (this.username === ''){
        alert('请输入用户名')
        return
      }
      if (this.password === ''){
        alert('请输入密码')
        return
      }
      console.log(this.username,this.password)
      this.axios.post('/login',{
        username: this.username,
        password: this.password
      }).then((res) => {
        console.log(res)
        if (res.data === '登录失败') alert('用户名或密码错误')
        else {
          this.$router.push({
            name: 'hello'
          })
        }
      }).catch((err) => {
        console.log(err)
      })
    }
  }
}
</script>

<style scoped>

</style>
