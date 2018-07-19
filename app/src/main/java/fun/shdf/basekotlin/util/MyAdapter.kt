package `fun`.shdf.basekotlin.util

import `fun`.shdf.basekotlin.bean.ResultBean
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import javax.xml.transform.Result

class MyAdapter(var datas: List<ResultBean>) : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.


        

    }

    override fun getItemCount(): Int = datas?.size

    override fun onBindViewHolder(p0: MyViewHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }
}