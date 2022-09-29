package com.example.imitationmcdonalds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText personname = findViewById(R.id.editTextTextName);
        EditText phonenumber = findViewById(R.id.editTextTextNumber);
        EditText cityname = findViewById(R.id.editTextTextCity);
        EditText blockname = findViewById(R.id.editTextTextBlock);
        EditText streetname = findViewById(R.id.editTextTextStreet);
        EditText buildingname = findViewById(R.id.editTextTextBuilding);

        Button next = findViewById(R.id.buttonorder);

        next.setOnClickListener(view -> {

            String a = personname.getText().toString();
            String b = phonenumber.getText().toString();
            String c = cityname.getText().toString();
            String d = blockname.getText().toString();
            String e = streetname.getText().toString();
            String f = buildingname.getText().toString();

            Intent address = new Intent(MainActivity.this, OrderCompleteActivity.class);
            address.putExtra("name", a);
            address.putExtra("phone", b);
            address.putExtra("city", c);
            address.putExtra("block", d);
            address.putExtra("street", e);
            address.putExtra("building", f);
            startActivity(address);


            Intent intent = new Intent(MainActivity.this, FullMenuActivity.class);
            startActivity(intent);
        });
    }
}