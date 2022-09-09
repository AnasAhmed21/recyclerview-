package com.example.recyclerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

    class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.recycler_view)
        val ListOfFruit =getListOfFruits()
        val FruitAdapter=FruitAdapter(ListOfFruit)
        recyclerView.adapter =FruitAdapter



    }
        private fun getListOfFruits(): List<fruit>{
            val fruits = mutableListOf<fruit>()
            fruits.add(fruit("Apple",R.drawable.apple1,"An apple is an edible fruit produced by an apple tree. Apple trees are cultivated worldwide and are the most widely grown species in the genus Malus. The tree originated in Central Asia, where its wild ancestor, Malus sieversii, is still found today"))
            fruits.add(fruit("Banana",R.drawable.banana,"A banana is an elongated, edible fruit – botanically a berry – produced by several kinds of large herbaceous flowering plants in the genus Musa. In some countries, bananas used for cooking may be called \"plantains\", distinguishing them from dessert bananas"))
            fruits.add(fruit("Mango",R.drawable.mango,"A mango is an edible stone fruit produced by the tropical tree Mangifera indica. It is believed to have originated in the region between northwestern Myanmar, Bangladesh, and northeastern India. "))
            fruits.add(fruit("Orange",R.drawable.orange,"An orange is a fruit of various citrus species in the family Rutaceae; it primarily refers to Citrus × sinensis, which is also called sweet orange, to distinguish it from the related Citrus × aurantium, referred to as bitter orange"))
            fruits.add(fruit("Cherry",R.drawable.cherry,"A cherry is the fruit of many plants of the genus Prunus, and is a fleshy drupe. Commercial cherries are obtained from cultivars of several species, such as the sweet Prunus avium and the sour Prunus cerasus"))
            fruits.add(fruit("Kiwi",R.drawable.kiwi,"Kiwifruit or Chinese gooseberry is the edible berry of several species of woody vines in the genus Actinidia. The most common cultivar group of kiwifruit is oval, about the size of a large hen's egg: 5–8 centimetres in length and 4.5–5.5 cm in diameter"))
            fruits.add(fruit("Lemon",R.drawable.lemon,"The lemon is a species of small evergreen trees in the flowering plant family Rutaceae, native to Asia, primarily Northeast India, Northern Myanmar or China"))
            fruits.add(fruit("Watermelon",R.drawable.watermelon,"Watermelon is a flowering plant species of the Cucurbitaceae family and the name of its edible fruit. A scrambling and trailing vine-like plant, it is a highly cultivated fruit worldwide, with more than 1,000 varieties"))
            fruits.add(fruit("Blueberry",R.drawable.blueberry,"Blueberries are a widely distributed and widespread group of perennial flowering plants with blue or purple berries. They are classified in the section Cyanococcus within the genus Vaccinium. Vaccinium also includes cranberries, bilberries, huckleberries and Madeira blueberries"))
            fruits.add(fruit("Pear",R.drawable.pear,"Pears are fruits produced and consumed around the world, growing on a tree and harvested in the Northern Hemisphere in late summer into October. The pear tree and shrub are a species of genus Pyrus, in the family Rosaceae, bearing the pomaceous fruit of the same name"))
            fruits.add(fruit("Avocado",R.drawable.avocado,"The avocado is a medium-sized, evergreen tree in the laurel family, native to the Americas. It is widely cultivated for its large, fleshy fruit. The tree likely originated in the highland regions of south-central Mexico to Guatemala. Its fruit is botanically a large berry containing a single large seed"))
            fruits.add(fruit("Peach",R.drawable.peach,"The peach is a deciduous tree first domesticated and cultivated in Zhejiang province of Eastern China. It bears edible juicy fruits with various characteristics, most called peaches and others, nectarines."))
return fruits



    }}