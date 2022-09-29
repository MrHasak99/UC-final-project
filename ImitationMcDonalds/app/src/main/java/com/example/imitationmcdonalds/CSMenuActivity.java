package com.example.imitationmcdonalds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class CSMenuActivity extends AppCompatActivity {

    ArrayList<Items> ItemsList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csactivity);

        Items item1 = new Items("McChicken" , 1.300 , R.drawable.mcchicken, "Deliciously Halal crispy chicken topped with mayonnaise, shredded lettuce, and served on a perfectly toasty bun.");
        Items item2 = new Items("Chicken Mac" , 1.300 , R.drawable.macchicken, "An unbelievable sandwich made with 2 breaded Halal chicken patties, cheese, lettuce, creamy mayo and a bun in the middle!");
        Items item3 = new Items("Chicken Burger" , 0.650, R.drawable.chickenburger, "Looking for something simple? Try our breaded Halal chicken patty topped with lettuce and mayo.");
        Items item4 = new Items("Grand Chicken Special" , 1.450 , R.drawable.grandchickenspecial, "A thick, crispy Halal chicken patty topped with a handful of crisp lettuce, rocca, juicy tomato slices, two slices of Emmental cheese and a slice of chicken roll, accompanied by a grainy, gourmet dressing sauce - all held together by a soft, water split bun.");
        Items item5 = new Items("Grand Chicken Spicy" , 1.450 , R.drawable.grandchickenspicy, "Definitely worth talking about. We proudly serve this delicacy as a part of our Grand Chicken Range.");
        Items item6 = new Items("Chicken McArabia" , 1.300 , R.drawable.mcarabia, "Another way to enjoy our delicious chicken! Two grilled chicken patties with lettuce, tomatoes, onions and flavorful garlic sauce held together by Arabic bread.");
        Items item7 = new Items("Chicken McNuggets 6-Pieces" , 0.750 , R.drawable.mcnuggets6pcs, "Our tender, juicy Halal Chicken McNuggets are made with 100% white meat chicken and no artificial colors, flavors and now no artificial preservatives.");
        Items item8 = new Items("Veggie Burger" , 0.850 , R.drawable.veggieburger, "A crispy fried veggie patty, a handful of fresh shredded lettuce, and sliced juicy tomatoes. Generously topped with our flavorful mayo dressing.");
        Items item9 = new Items("Spicy McChicken" , 1.300 , R.drawable.spicymcchicken, "The classic crispy chicken sandwich with a twist. Spiced Halal chicken, mayo, shredded lettuce served on a warm, toasty bun.");
        Items item10 = new Items("Chicken Burger Deluxe" , 0.800 , R.drawable.chickenburgerdeluxe, "Deliciously crispy Halal chicken topped with mayonnaise, shredded lettuce, and served on a perfectly toasty bun.");

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