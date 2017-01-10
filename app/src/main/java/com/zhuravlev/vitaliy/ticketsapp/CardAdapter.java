package com.zhuravlev.vitaliy.ticketsapp;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by vitaliy.zhuravlyov on 10.01.17.
 */

public class CardAdapter extends android.support.v7.widget.RecyclerView.Adapter<CardAdapter.ViewHolder> {
    private List<Card> cards = new ArrayList<>();

    public CardAdapter(List<Card> cards) {
        this.cards = cards;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.cardName.setText(cards.get(position).name);
        holder.cardDate.setText(new SimpleDateFormat("dd MMM, EE HH:mm", Locale.getDefault()).format(cards.get(position).date));
        holder.cardPlace.setText(cards.get(position).place);
        holder.cardPhoto.setBackgroundColor(cards.get(position).photoId);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return cards.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView cardName;
        TextView cardDate;
        TextView cardPlace;
        ImageView cardPhoto;

        ViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.card_view);
            cardName = (TextView) itemView.findViewById(R.id.card_name);
            cardDate = (TextView) itemView.findViewById(R.id.card_date);
            cardPlace = (TextView) itemView.findViewById(R.id.card_place);
            cardPhoto = (ImageView) itemView.findViewById(R.id.card_photo);
        }
    }
}
