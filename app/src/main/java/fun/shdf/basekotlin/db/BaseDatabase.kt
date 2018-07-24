package `fun`.shdf.basekotlin.db

import `fun`.shdf.basekotlin.pojo.ReadBean
import `fun`.shdf.basekotlin.pojo.ResultBean
import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context

/**
code-time: 2018/7/24
code-author: by shdf
coder-wechat: zcm656025633
 **/

@Database(
        entities = arrayOf(ResultBean::class),
        version = 1,
        exportSchema = false

)
abstract class BaseDatabase : RoomDatabase(){
    companion object {
        fun create(context: Context, useInMemory : Boolean): BaseDatabase {
            val databaseBuilder = if(useInMemory) {
                Room.inMemoryDatabaseBuilder(context, BaseDatabase::class.java)
            } else {
                Room.databaseBuilder(context, BaseDatabase::class.java, "xindu.db")
            }
            return databaseBuilder
                    .fallbackToDestructiveMigration()
                    .build()
        }
        }
}