module.exports = {
    devServer: {
        port: 8101,
        // proxy: {
        //
        //     '/Tenth_SSM_Java_war': {  // '/api'只是一个标识，可以写成别的
        //         // target: 'http://39.107.104.254:801', //跨域请求目标信息
        //         target: 'http://localhost:8080', //跨域请求目标信息
        //         changeOrigin: true, //是否是跨域请求
        //
        //     }
        // }
    },
    publicPath: './',
    configureWebpack: {
        resolve: {
            alias: {
                'assets': '@/assets',
                'common': '@/common',
                'components': '@/components',
                'network': '@/network',
                'views': '@/views',
                'plugins': '@/plugins',
            }
        }
    }
};
