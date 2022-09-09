package com.example.recyclerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView

class FruitDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit_details)

        val fruitName : TextView
        val fruitdescription : TextView
        val fruitImage : ImageView
        fruitName=findViewById(R.id.fruit_name_label)
        fruitdescription=findViewById(R.id.details)
        fruitImage=findViewById(R.id.det_fruit_image)

        fruitName.text=intent.getCharSequenceExtra("name")
        fruitdescription.text=intent.getCharSequenceExtra("description")
        fruitImage.setImageResource(intent.getIntExtra("image",0))


    }
}


