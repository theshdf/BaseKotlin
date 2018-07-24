package `fun`.shdf.basekotlin

import android.app.Application
import android.content.Context

/**
code-time: 2018/7/24
code-author: by shdf
coder-wechat: zcm656025633
 **/
class AppApplication : Application(){

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
    companion object {
        var context: Context = AppApplication().applicationContext
        fun getApplicationContext(): Context {
            return context
        }
    }
}