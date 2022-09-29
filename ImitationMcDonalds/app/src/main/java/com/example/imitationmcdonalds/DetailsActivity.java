package com.example.imitationmcdonalds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView nametext = findViewById(R.id.textViewNameD);
        TextView pricetext = findViewById(R.id.textViewPriceD);
        ImageView img = findViewById(R.id.imageViewDetails);
        TextView detailstext = findViewById(R.id.textViewDetails);

        Bundle bundle = getIntent().getExtras();

        Items sentitem = (Items) bundle.getSerializable("item");

        nametext.setText(sentitem.getItemName());
        pricetext.setText(sentitem.getItemPrice() + " KD");
        img.setImageResource(sentitem.getItemImage());
        detailstext.setText(sentitem.getItemDetails());

    }
}
