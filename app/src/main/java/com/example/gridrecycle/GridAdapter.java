package com.example.gridrecycle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder>
{

    Context context;
    ArrayList<User> arrayList;

    public GridAdapter(Context context, ArrayList<User> arrayList)
    {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view=LayoutInflater.from(context).inflate(R.layout.grid_design,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
      holder.imageApp.setImageResource(arrayList.get(position).appImage);
      holder.nameApp.setText(arrayList.get(position).appName);
      holder.userApp.setText(arrayList.get(position).appUser);
    }

    @Override
    public int getItemCount()
    {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
      TextView nameApp, userApp;
      ImageView imageApp;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);

            nameApp=itemView.findViewById(R.id.name);
            userApp=itemView.findViewById(R.id.users);
            imageApp=itemView.findViewById(R.id.image);
        }
    }
}
