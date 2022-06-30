<template>
  <div class="container fixed-center" style="width: 30%">
    <q-card>
      <div class="q-pa-xs text-body1">{{this.msg}}</div>
    </q-card>
  </div>
</template>

<script>
export default {
  name: "hello",
  data () {
    return {
      msg: '',
    }
  },
  mounted () {
    this.getHello()
  },
  methods: {
    getHello () {
      this.axios.get('/hello/hello-feign').then((res) => {
        this.msg = res.data
        console.log(res)
      })
    }
  }
}
</script>
