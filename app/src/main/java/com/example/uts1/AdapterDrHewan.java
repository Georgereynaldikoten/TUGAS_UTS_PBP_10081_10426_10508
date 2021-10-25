package com.example.uts1;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterDrHewan extends RecyclerView.Adapter<AdapterDrHewan.viewHolder>
{

    public class viewHolder extends RecyclerView.ViewHolder
    {

        public viewHolder(@NonNull View itemView)
        {
            super(itemView);
        }
    }

    @NonNull
    @Override
    public AdapterDrHewan.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDrHewan.viewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
