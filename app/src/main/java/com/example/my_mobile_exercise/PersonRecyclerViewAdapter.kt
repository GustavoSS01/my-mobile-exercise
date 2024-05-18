package com.example.my_mobile_exercise

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.my_mobile_exercise.databinding.ContactItemBinding
class PersonRecyclerViewAdapter(private val personList: List<Person>) :
    RecyclerView.Adapter<PersonViewHolder>() {

    // faz o inflate do layout e retorna o viewholder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val binding = ContactItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return PersonViewHolder(binding)
    }

    // faz o bind dos dados a view
    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.bind(personList[position])
    }

    // retorna o numero de itens na lista
    override fun getItemCount(): Int = personList.size

}