package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonAdapter(private val persons: List<Person>): RecyclerView.Adapter<PersonAdapter.ViewHolder>() {
    private lateinit var person: Person

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val name: TextView
        val age: TextView

        init {
            name = view.findViewById(R.id.textView)
            age = view.findViewById(R.id.textView2)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = person.name
        holder.age.text = person.age.toString()
    }

    override fun getItemCount(): Int {
        return persons.size
    }


}