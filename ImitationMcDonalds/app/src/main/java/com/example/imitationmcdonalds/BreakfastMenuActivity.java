package com.example.imitationmcdonalds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class BreakfastMenuActivity extends AppCompatActivity {

    ArrayList<Items> ItemsList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast_menu);

        Items item1 = new Items("Egg McMuffin" , 0.900 , R.drawable.eggmcmuffin, "An excellent source of protein and oh so delicious. We place a freshly-cracked Grade A egg on a toasted English Muffin topped with real butter and add chicken roll and melty American cheese.");
        Items item2 = new Items("Egg N' Sausage Wrap" , 0.900 , R.drawable.eggnsausagewrap, "Features a savory hot chicken sausage, a slice of melty cheddar cheese, and a delicious egg all on a freshly wrapped tortilla.");
        Items item3 = new Items("Chicken Sausage McMuffin" , 0.850 , R.drawable.chickensausagemcmuffin, "Features a warm, freshly toasted English muffin, topped with savory hot Halal sausage and a slice of melty American cheese.");
        Items item4 = new Items("Chicken Sausage McMuffin With Egg" , 0.900 , R.drawable.chickenmuffinwithegg, "Features a savory hot Halal sausage, a slice of melty American cheese, and a delicious egg all on a freshly toasted English muffin. For a different taste, try it with freshly grilled egg whites and smooth white cheddar.");
        Items item5 = new Items("Egg N' Hash browns Wrap" , 0.900 , R.drawable.eggnhashbrownswrap, "Delicious eggs and crunchy hashbrown toppped with melted cheddar cheese and chicken, rolled in a thin tortilla wrap.");
        Items item6 = new Items("Big Breakfast" , 1.250 , R.drawable.bigbreakfast, "Wake up with a warm McMuffin, fluffy scrambled eggs, savory hot Halal sausage, and crispy golden hash browns.");
        Items item7 = new Items("Hash Browns" , 0.500 , R.drawable.hashbrowns, "Deliciously tasty hash browns. Fluffy on the inside, crispy and toasty on the outside.");
        Items item8 = new Items("Hotcakes 3-Pieces" , 0.800 , R.drawable.hotcakes3pcs, "Three golden brown, melt-in-your-mouth hotcakes with a side of real butter and the sweet flavor of maple.");
        Items item9 = new Items("Chicken Muffin" , 0.850 , R.drawable.chickenmuffin, "A breakfast delight. The Chicken Muffin features a warm, freshly toasted English Muffin, topped with Halal chicken, shredded lettuce and mayonnaise.");
        Items item10 = new Items("Chicken Muffin With Egg" , 0.900 , R.drawable.chickenmuffinwithegg, "Toasted to perfection especially made for you, a beautifully toasted English muffin topped with Halal chicken, mayonnaise and a freshly-cracked Grade A egg along with a slice of melted American cheese.");

        ItemsList.add(item1);
        ItemsList.add(item2);
        ItemsList.add(item3);
        ItemsList.add(item4);
        ItemsList.add(item5);
        ItemsList.add(item6);
        ItemsList.add(item7);
        ItemsList.add(item8);
        ItemsList.add(item9);
        ItemsList.add(item10);

        RecyclerView recycler = findViewById(R.id.rv);
        recycler.setHasFixedSize(true);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recycler.setLayoutManager(manager);

        ItemAdapter adapter = new ItemAdapter(ItemsList, this);
        recycler.setAdapter(adapter);

    }
}