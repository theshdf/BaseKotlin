package `fun`.shdf.basekotlin.base

import `fun`.shdf.basekotlin.bean.ReadBean
import `fun`.shdf.basekotlin.bean.ResultBean
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
Created by shdf on 2018/7/19.
wechat：zcm656025633
exp：
 **/
class MyAdapter(var datas: List<ResultBean>) : RecyclerView.Adapter<MyViewHolder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {

        return MyViewHolder(TextView(p0.context))
    }

    override fun getItemCount(): Int = datas.size

    override fun onBindViewHolder(p0: MyViewHolder, p1: Int) {

        p0.view.text = datas.get(p1).title
    }
}