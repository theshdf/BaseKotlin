package `fun`.shdf.basekotlin.viewmodel

import `fun`.shdf.basekotlin.api.HttpUtil
import `fun`.shdf.basekotlin.pojo.ReadBean
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ReadViewModel : ViewModel(){
    lateinit var readBean: MutableLiveData<ReadBean>
    fun getReadData(): LiveData<ReadBean>{
        readBean = MutableLiveData()
        //todo  从服务起获取数据
        HttpUtil.getInstance().
                getApiService()
                .getGank()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    readBean.value = it

                }){
                    Log.d("Tag",it.cause.toString())
                }
        return  readBean
    }
}