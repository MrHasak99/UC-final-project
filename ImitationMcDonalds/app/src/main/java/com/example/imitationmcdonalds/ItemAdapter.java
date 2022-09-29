package com.example.imitationmcdonalds;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemAdapter extends RecyclerView.Adapter {

    ArrayList<Items> ItemsList = new ArrayList<>();
    Context context;

    public ItemAdapter(ArrayList<Items> itemsList, Context context) {
        ItemsList = itemsList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).textname.setText(ItemsList.get(position).getItemName());
        ((ViewHolder)holder).textprice.setText(ItemsList.get(position).getItemPrice() + " KD");
        ((ViewHolder)holder).img.setImageResource(ItemsList.get(position).getItemImage());

        ((ViewHolder)holder).v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, DetailsActivity.class);
                intent.putExtra("item", ItemsList.get(position));
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return ItemsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView textname, textprice;
        View v;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            v = itemView;
            img = v.findViewById(R.id.imageView);
            textname = v.findViewById(R.id.textViewName);
            textprice = v.findViewById(R.id.textViewPrice);
        }
    }
}
