package com.example.recyclerapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class FruitAdapter(private  val fruitsList :List<fruit>) : RecyclerView.Adapter<FruitAdapter.Fruitviewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitAdapter.Fruitviewholder {
    val itemFruitView = LayoutInflater.from(parent.context).inflate(R.layout.fruit_item,parent,false)
        return Fruitviewholder(itemFruitView)
    }

    override fun onBindViewHolder(holder: Fruitviewholder, position: Int) {

        val currentFruit =  fruitsList[position]
        holder.bindFruit(currentFruit)
    }

    override fun getItemCount(): Int {
        return fruitsList.size
    }


    inner class Fruitviewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val fruitName : TextView
    private val fruitImage : ImageView


    init {
        fruitName=itemView.findViewById(R.id.fruit_name_label)
        fruitImage=itemView.findViewById(R.id.fruit_image)
        fruitImage.setOnClickListener {

            val currentFruit= fruitsList[layoutPosition]
            val intent =Intent(itemView.context,FruitDetails::class.java)
            intent.putExtra("image",currentFruit.fruitImage)
            intent.putExtra("description",currentFruit.description)
            intent.putExtra("name",currentFruit.fruitName)
            itemView.context.startActivity(intent)
            Toast.makeText(itemView.context,currentFruit.fruitName, Toast.LENGTH_SHORT).show()
        }

    }
    fun bindFruit(fruit: fruit){

        fruitName.text=fruit.fruitName
        fruitImage.setImageResource(fruit.fruitImage)


    }


}
}