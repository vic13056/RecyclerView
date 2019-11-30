package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyviewHolder> {

    Context context;
    ArrayList<Profile> profiles;

    public MyAdapter(Context c, ArrayList<Profile>p){
        context = c;
        profiles = p;

    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyviewHolder(LayoutInflater.from(context).inflate(R.layout.card_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int position) {

        holder.name.setText(profiles.get(position).getName());
        holder.email.setText(profiles.get(position).getEmail());
        Picasso.get().load(profiles.get(position).getProfilepic()).into(holder.profilepic);
        if (profiles.get(position).getPermission()){
            holder.btn.setVisibility(View.VISIBLE);
        }


    }

    @Override
    public int getItemCount() {
        return profiles.size();
    }

    class MyviewHolder extends RecyclerView.ViewHolder
    {

        TextView name,email;
        ImageView profilepic;
        Button btn;
        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            email = (TextView) itemView.findViewById(R.id.email);
            profilepic = (ImageView) itemView.findViewById(R.id.profile);
            btn = (Button)itemView.findViewById(R.id.check);
        }
        public void onClick(final int positon){
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, positon+"is clicked", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

}
