module.exports = {
  pluginOptions: {
    quasar: {
      importStrategy: "kebab",
      rtlSupport: false,
    },
  },
  transpileDependencies: ["quasar"],
  devServer: {
    port: 8082,
    proxy: { //配置跨域
      '/': {
        target: 'http://localhost:8080', //线上
        changOrigin: true, //允许跨域
        pathRewrite: {
          '^/': ''
        }
      },
     }
  },
  publicPath: './'
};
