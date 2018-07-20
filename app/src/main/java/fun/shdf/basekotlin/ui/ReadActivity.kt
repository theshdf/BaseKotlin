package `fun`.shdf.basekotlin.ui

import `fun`.shdf.basekotlin.R
import `fun`.shdf.basekotlin.base.MyAdapter
import `fun`.shdf.basekotlin.bean.ReadBean
import `fun`.shdf.basekotlin.bean.ResultBean
import `fun`.shdf.basekotlin.viewmodel.ReadViewModel
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_read.*

class ReadActivity : AppCompatActivity() {
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var readViewModel: ReadViewModel
    private lateinit var readDatas: MutableList<ResultBean>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_read)
        linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        readDatas = mutableListOf()
        recycler.layoutManager = linearLayoutManager
        recycler.adapter = MyAdapter(readDatas)
        (recycler.adapter)?.notifyDataSetChanged()
        readViewModel = ViewModelProviders.of(this).get(ReadViewModel::class.java)
    }

    /**
     * 获取数据
     */
    fun getResult() {
        readViewModel.getReadData().observe(this, Observer {
            readDatas.clear()
            readDatas.addAll(it!!.results)
            recycler.adapter.let { it?.notifyDataSetChanged() }
        })
        recycler.setOnClickListener{ }
    }

    override fun onResume() {
        super.onResume()
        getResult()
    }
}
