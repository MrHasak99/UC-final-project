package com.example.imitationmcdonalds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class BurgersMenuActivity extends AppCompatActivity {

    ArrayList<Items> ItemsList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burgers_menu);

        Items item1 = new Items("Beef Burger" , 0.450 , R.drawable.beefburger, "A juicy, 100% pure halal beef patty with absolutely no fillers, additives or preservatives, seasoned with a pinch of salt and pepper, and topped with a tangy pickle, chopped onions, ketchup and mustard.");
        Items item2 = new Items("Cheeseburger" , 0.550 , R.drawable.cheeseburger, "A juicy, 100% pure halal beef patty with absolutely no fillers, additives or preservatives, seasoned with a pinch of salt and pepper, and topped with a tangy pickle, chopped onions, ketchup, mustard, and a slice of melty American cheese.");
        Items item3 = new Items("Double Cheeseburger" , 0.850 , R.drawable.doublecheeseburger, "Two 100% pure halal beef patties with absolutely no fillers, additives or preservatives, seasoned with a pinch of salt and pepper, and topped with tangy pickles, chopped onions, ketchup, mustard and two slices of melty American cheese.");
        Items item4 = new Items("Quarter Pounder With Cheese" , 1.300 , R.drawable.quarterpounderwithcheese, "A quarter pound of 100% pure halal beef with absolutely no fillers, additives or preservatives. Just a pinch of salt and pepper, and seared on our grill so it’s thick and juicy. Layered with two slices of melty cheese, slivered onions and tangy pickles on a sesame seed bun.");
        Items item5 = new Items("McRoyale" , 1.350 , R.drawable.mcroyaledeluxe, "The McRoyale has it all! A juicy Halal beef patty accompanied by cheese, crispy lettuce, fresh tomatoes, onions, zesty pickles, and spread with mayonnaise, ketchup and mustard.");
        Items item6 = new Items("Big Mac" , 1.300 , R.drawable.bigmac, "Mouthwatering perfection starts with two sear-sizzled 100% pure Halal beef patties and Big Mac® sauce, sandwiched between a sesame seed bun. American cheese, shredded lettuce, onions and pickles top it off.");
        Items item7 = new Items("Big Tasty" , 1.450 , R.drawable.bigtasty, "A big and tasty Halal beef patty smothered in our one of a kind Big Tasty Sauce and 3 slices of emmental cheese, dressed with 2 slices of tomato, a handful of crispy shredded lettuce and slivered onions.");
        Items item8 = new Items("Little Tasty" , 0.800 , R.drawable.littletasty, "Two breaded halal chicken patties with lettuce and onion covered with our delicious emmental cheese and mustard mayo sauce");

        ItemsList.add(item1);
        ItemsList.add(item2);
        ItemsList.add(item3);
        ItemsList.add(item4);
        ItemsList.add(item5);
        ItemsList.add(item6);
        ItemsList.add(item7);
        ItemsList.add(item8);

        RecyclerView recycler = findViewById(R.id.rv);
        recycler.setHasFixedSize(true);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recycler.setLayoutManager(manager);

        ItemAdapter adapter = new ItemAdapter(ItemsList, this);
        recycler.setAdapter(adapter);

    }
}