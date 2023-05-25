package com.example.fragment_op.adapters;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class restrorent_adapter extends RecyclerView.Adapter<restrorent_adapter.userholder> {


    @NonNull
    @Override
    public restrorent_adapter.userholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull restrorent_adapter.userholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class userholder extends RecyclerView.ViewHolder {
        public userholder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
