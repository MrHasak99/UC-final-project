package com.example.imitationmcdonalds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class SSMenuActivity extends AppCompatActivity {

    ArrayList<Items> ItemsList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ssmenu);

        Items item1 = new Items("Pineapple Stick" , 0.250 , R.drawable.pineapplestick, "A delicious and refreshing new addition to our menu, the pineapple stick is the perfect natural treat to accompany your kid’s Happy Meal.");
        Items item2 = new Items("French Fries" , 0.800 , R.drawable.fries, "Our French fries are born from premium potatoes such as the Russet Burbank and the Shepody. With zero grams of trans fat per labeled serving, these epic fries are crispy and golden on the outside and fluffy on the inside.");
        Items item3 = new Items("Chicken Caesar Salad" ,  1.250 , R.drawable.chickenceasersalad, "Crisp Iceberg lettuce topped with Halal tender chicken strips, toasted bread croutons, shredded parmesan cheese, and a tangy Caesar dressing. Guaranteed enjoyment in every bite.");
        Items item4 = new Items("Garden Salad" , 1.000 , R.drawable.gardensalad, "Crunchy Iceberg lettuce cuts, cherry tomatoes, shreded carrots and chedder cheese.");

        ItemsList.add(item1);
        ItemsList.add(item2);
        ItemsList.add(item3);
        ItemsList.add(item4);

        RecyclerView recycler = findViewById(R.id.rv);
        recycler.setHasFixedSize(true);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recycler.setLayoutManager(manager);

        ItemAdapter adapter = new ItemAdapter(ItemsList, this);
        recycler.setAdapter(adapter);
    }
}