const base = {
    get() {
        return {
            url : "http://localhost:8080/xueyuanshangpuguanlixitong/",
            name: "xueyuanshangpuguanlixitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xueyuanshangpuguanlixitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "学院商铺管理系统"
        } 
    }
}
export default base
