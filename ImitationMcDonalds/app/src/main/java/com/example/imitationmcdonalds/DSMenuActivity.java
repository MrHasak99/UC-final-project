package com.example.imitationmcdonalds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class DSMenuActivity extends AppCompatActivity {

    ArrayList<Items> ItemsList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dsmenu);

        Items item1 = new Items("Ice Cream Cone" , 0.150 , R.drawable.icecreamcone, "Sweet, creamy vanilla soft serve in a crispy cone.");
        Items item2 = new Items("Caramel Sundae" , 0.500 , R.drawable.caramelsundae, "Cool and creamy vanilla soft serve meets warm, rich, buttery caramel.");
        Items item3 = new Items("Strawberry Sundae" ,  0.500 , R.drawable.strawberrysundae, "Sweet, tart and oh so creamy. STRAWBERRY SUNDAE. Creamy vanilla soft serve topped with sliced strawberries in a sweet and tart strawberry sauce.");
        Items item4 = new Items("Hot Fudge Sundae" , 0.500 , R.drawable.hotfudgesundae, "Vanilla soft serve, smothered in chocolaty fudge sauce.");
        Items item5 = new Items("Oreo McFlurry" ,  0.750 , R.drawable.mcflurryoreo, "Vanilla soft serve with OREO® Cookies mixed in.");
        Items item6 = new Items("McDonald's Apple Pie" , 0.400 , R.drawable.applepie, "Crispy on the outside, deliciously hot and sweet on the inside, our Apple Pie is a McDonald's classic.");

        ItemsList.add(item1);
        ItemsList.add(item2);
        ItemsList.add(item3);
        ItemsList.add(item4);
        ItemsList.add(item5);
        ItemsList.add(item6);

        RecyclerView recycler = findViewById(R.id.rv);
        recycler.setHasFixedSize(true);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recycler.setLayoutManager(manager);

        ItemAdapter adapter = new ItemAdapter(ItemsList, this);
        recycler.setAdapter(adapter);
    }
}