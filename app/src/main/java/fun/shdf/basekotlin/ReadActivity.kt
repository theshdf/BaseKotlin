package `fun`.shdf.basekotlin

import `fun`.shdf.basekotlin.base.MyAdapter
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_read.*

class ReadActivity : AppCompatActivity() {
    private lateinit var linearLayoutManager: LinearLayoutManager
    private val datas = listOf("zcm")
    lateinit var name: String
    var age: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_read)
        linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        recycler.layoutManager = linearLayoutManager
        recycler.adapter = MyAdapter(datas)
        (recycler.adapter)?.notifyDataSetChanged()
    }
}
