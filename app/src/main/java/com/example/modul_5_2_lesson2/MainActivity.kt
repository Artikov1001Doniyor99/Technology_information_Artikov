package com.example.modul_5_2_lesson2

import adapter.ExpandableAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var map:HashMap<String,List<String>>
    lateinit var titleList:ArrayList<String>

    lateinit var expandableAdapter: ExpandableAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()

        expandableAdapter = ExpandableAdapter(titleList,map)
        expandable_list.setAdapter(expandableAdapter)

        expandable_list.setOnChildClickListener { expandableListView, view, i, i2, l ->
            Toast.makeText(this, map[titleList[i]]?.get(i2), Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SecondActivity::class.java)
            /*  val keys = map[titleList[i]]
              val values = map[titleList[i]]?.get(i2)
  */
            println(map[titleList[i]])

            intent.putExtra("Father",i)
            intent.putExtra("Child",i2)
            startActivity(intent)
            true
        }


    }

    private fun loadData() {
        map = HashMap()
        val MobiList = arrayListOf("Mi","RealMe","Samsung","Infinix","Oppo","Apple","Honor")
        map["Mobiles"] = MobiList
        val LaptopsList = arrayListOf("Dell","MAC","HP","ASUS")
        map["Laptops"] = LaptopsList
        val ComputerList = arrayListOf("Pendrive","Bag","Mouse","Keyboard")
        map["Computer Accessories"] = ComputerList
        val HomeList = arrayListOf("Happy birthday","Married day","One work day")
        map["Home Entertainment"] = HomeList
        val TVList = arrayListOf("Samsung","LG","Artel")
        map["TVs by brand"] = TVList
        val KitchenList = arrayListOf("Kettle","Microwave","Toaster")
        map["Kitchen Appliances"] = KitchenList

        titleList = ArrayList()
        titleList.add("Mobiles")
        titleList.add("Laptops")
        titleList.add("Computer Accessories")
        titleList.add("Home Entertainment")
        titleList.add("TVs by brand")
        titleList.add("Kitchen Appliances")



    }

}