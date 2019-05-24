package com.example.recylerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgrammingAdapter extends Adapter<ProgrammingAdapter.ProgrammingViewHolder> {
 private String[] data;
    public ProgrammingAdapter(String[] data)
 {
     this.data=data;
 }


    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {//this oncreateviewholder method is used for create view and store view
        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        View view=inflater.inflate(R.layout.list_item_layout,viewGroup,false);
        return new ProgrammingViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder programmingViewHolder, int position) {
    String title=data[position];
    programmingViewHolder.txtTitle.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder{// //View holder class is used to retain the views by which we can recycle it
     ImageView imgIcon;
     TextView txtTitle;

        public ProgrammingViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.img);
            txtTitle = itemView.findViewById(R.id.txt);

        }
    }
}
