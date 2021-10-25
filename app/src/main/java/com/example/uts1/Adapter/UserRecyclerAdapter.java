package com.example.uts1.Adapter;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uts1.databinding.ProductRowBinding;
import com.example.uts1.entity.Artikel;

import java.util.List;

public class UserRecyclerAdapter extends RecyclerView.Adapter<UserRecyclerAdapter.UserViewHolder> {

    private static final String TAG = "UserRecyclerAdapter";
    private RecyclerViewClickListener listener;
    List<Artikel> artikelList;

    public UserRecyclerAdapter(List<Artikel> artikelList) {
        this.artikelList = artikelList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ProductRowBinding productRowBinding = ProductRowBinding.inflate(layoutInflater, parent, false);
        return new UserViewHolder(productRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        final Artikel artikel = artikelList.get(position);
        holder.productRowBinding.setArtikel(artikel);
        holder.productRowBinding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return artikelList.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder {

        ProductRowBinding productRowBinding;

        public UserViewHolder(@NonNull ProductRowBinding productRowBinding) {
            super(productRowBinding.getRoot());
            this.productRowBinding = productRowBinding;
        }

    }
    public interface RecyclerViewClickListener{
        void onClick(int position);
    }


}
