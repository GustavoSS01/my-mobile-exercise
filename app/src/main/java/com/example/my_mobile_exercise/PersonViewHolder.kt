package com.example.my_mobile_exercise

import androidx.recyclerview.widget.RecyclerView
import com.example.my_mobile_exercise.databinding.ContactItemBinding

//  Classe viewholder para sergurar as views para cada item da lista
class PersonViewHolder(private val contactItemBinding: ContactItemBinding) :
    RecyclerView.ViewHolder(contactItemBinding.root) {

    // binda os dados de Person a view
    fun bind(person: Person) {
        contactItemBinding.apply {
            txtName.text = person.name
            txtPhone.text = person.phone
            txtAge.text = person.age.toString()
            txtHobby.text = person.hobby
            txtSex.text = person.sex
        }
    }
}