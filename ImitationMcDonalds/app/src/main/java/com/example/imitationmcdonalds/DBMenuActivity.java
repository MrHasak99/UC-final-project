package com.example.imitationmcdonalds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class DBMenuActivity extends AppCompatActivity {

    ArrayList<Items> ItemsList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbmenu);

        Items item1 = new Items("Sprite" , 0.450 , R.drawable.sprite, "SPRITE® Delicious lemon-lime taste with no caffeine.");
        Items item2 = new Items("Regular Coca-Cola" , 0.450 , R.drawable.cocacola, "A cold and refreshing complement to all of our menu items.");
        Items item3 = new Items("Coca-Cola Zero" ,  0.450 , R.drawable.cokezero, "100% Refreshing, 0% Calories.");
        Items item4 = new Items("Fanta Orange" , 0.450 , R.drawable.fanta, "Go for it!");
        Items item5 = new Items("Minute Maid Orange Juice" , 0.500 , R.drawable.orangejuice, "A box of pure joy. Pure orange juice, Vitamin C doesn't get as natural as this!");
        Items item6 = new Items("Apple Juice" , 0.300 , R.drawable.applejuice, "A box of pure joy. APPLE JUICE. 100% apple juice with Vitamin C and Calcium.");
        Items item7 = new Items("Milk" ,  0.250 , R.drawable.milk, "Wholesome low fat milk, an excellent source of Calcium and Vitamin D.");
        Items item8 = new Items("Chocolate Milk" , 0.250 , R.drawable.chocolatemilk, "Fat free chocolate milk, an excellent source of Calcium and Vitamin D.");

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