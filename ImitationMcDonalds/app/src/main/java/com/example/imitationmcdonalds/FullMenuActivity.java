package com.example.imitationmcdonalds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class FullMenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_menu);

        Button breakfast = findViewById(R.id.buttonbreakfast);
        Button burgers = findViewById(R.id.buttonburgers);
        Button chickenandsandwiches = findViewById(R.id.buttonchickenandsandwiches);
        Button dessertsandshakes = findViewById(R.id.buttondessertsandshakes);
        Button drinksandbeverages = findViewById(R.id.buttondrinksandbeverages);
        Button snacksandsides = findViewById(R.id.buttonsnacksandsides);
        Button cart = findViewById(R.id.buttoncart);

        breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent BF = new Intent(FullMenuActivity.this, BreakfastMenuActivity.class);
                startActivity(BF);

            }
        });

        burgers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent BG = new Intent(FullMenuActivity.this, BurgersMenuActivity.class);
                startActivity(BG);

            }
        });

        chickenandsandwiches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent CS = new Intent(FullMenuActivity.this, CSMenuActivity.class);
                startActivity(CS);

            }
        });

        dessertsandshakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent DS = new Intent(FullMenuActivity.this, DSMenuActivity.class);
                startActivity(DS);

            }
        });

        drinksandbeverages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent DB = new Intent(FullMenuActivity.this, DBMenuActivity.class);
                startActivity(DB);

            }
        });

        snacksandsides.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent SS = new Intent(FullMenuActivity.this, SSMenuActivity.class);
                startActivity(SS);

            }
        });
    }
}