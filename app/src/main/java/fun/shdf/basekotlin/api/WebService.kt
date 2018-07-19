package `fun`.shdf.basekotlin.api
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object WebService{
    //todo 采用饿汉单利实现
    fun getApiService(): ApiService {
        return Retrofit.Builder()
                .baseUrl(ApiConstant.url)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiService::class.java)
    }
}