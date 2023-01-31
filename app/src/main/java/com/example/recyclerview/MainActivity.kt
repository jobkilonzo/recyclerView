package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: PersonAdapter
    private  var persons: MutableList<Person> = mutableListOf()
    //var per = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //persons = persons.set(1, Person("John", 12))
        persons.add(1, Person("John", 23))
        persons.add(2, Person("Jane", 26))
        persons.add(3, Person("Ambrose", 24))
        persons.add(4, Person("Eric", 30))


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)


        adapter = PersonAdapter(persons)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}