import { createApp } from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";
import { Quasar } from "quasar";
import quasarUserOptions from "./quasar-user-options";
import axios from "axios";
import VueAxios from "vue-axios";

createApp(App)
  .use(Quasar, quasarUserOptions)
  .use(VueAxios, axios)
  .use(store)
  .use(router)
  .mount("#app");

axios.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded';
axios.defaults.transformRequest = [function (data) {
  let ret = ''
  for (let it in data) {
      ret += encodeURIComponent(it) + '=' + encodeURIComponent(data[it]) + '&'
  }
  ret = ret.substring(0, ret.lastIndexOf('&'));
  return ret
}]