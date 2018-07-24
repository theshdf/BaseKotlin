package `fun`.shdf.basekotlin.api

import `fun`.shdf.basekotlin.pojo.ReadBean
import io.reactivex.Observable
import retrofit2.http.GET

interface ApiService{
    //todo 获取gank 闲读的子分类
    @GET("wow")
    fun getGank(): Observable<ReadBean>
}
