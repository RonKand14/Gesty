package com.example.Gesty;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.Gesty.R;

import java.util.ArrayList;

public class HelpRecViewAdapter extends RecyclerView.Adapter<HelpRecViewAdapter.ViewHolder>
{
    private ArrayList<Gestures> gestures = new ArrayList<>();
    private Context context;

    public void setGestures(ArrayList<Gestures> gestures)
    {
        this.gestures = gestures;
        notifyDataSetChanged();
    }

    public HelpRecViewAdapter(Context context)
    {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gesture_list_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtName.setText(gestures.get(position).getHead());
        holder.txtInfo.setText(gestures.get(position).getInfo());
        holder.parent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Gesture shown",Toast.LENGTH_LONG).show();
                // TODO: Change text to the array elements - headline
                // TODO: Add sound sample when pressing bathroom sound
                // TODO: Add the saved number display when pressing gesture
            }
        });

        Glide.with(context)
                .asBitmap()
                .load(gestures.get(position).getImg_url())
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return gestures.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        private TextView txtName, txtInfo;
        private CardView parent;
        private ImageView image;

        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            txtName = itemView.findViewById(R.id.gest1);
            txtInfo = itemView.findViewById(R.id.gest1info);
            image = itemView.findViewById(R.id.image1);
            parent = itemView.findViewById(R.id.parent);
        }
    }
}
