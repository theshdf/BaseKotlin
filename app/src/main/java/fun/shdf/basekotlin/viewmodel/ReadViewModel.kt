package `fun`.shdf.basekotlin.viewmodel

import `fun`.shdf.basekotlin.api.WebService
import `fun`.shdf.basekotlin.bean.ReadBean
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit

class ReadViewModel : ViewModel(){
    lateinit var readBean: MutableLiveData<ReadBean>
    fun getReadData(): LiveData<ReadBean>{
        readBean = MutableLiveData()
        //todo  从服务起获取数据
        WebService
                .getApiService()
                .getGank()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(Consumer {
                    readBean.value = it
                })
        return  readBean
    }
}