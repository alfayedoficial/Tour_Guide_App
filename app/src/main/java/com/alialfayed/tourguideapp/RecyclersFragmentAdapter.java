package com.alialfayed.tourguideapp;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by ( Eng Ali Al Fayed)
 * Class do :
 * Date 5/30/2020 - 1:34 PM
 */
public class RecyclersFragmentAdapter extends RecyclerView.Adapter<RecyclersFragmentAdapter.RecyclersFragmentHolder> {

    private ArrayList<InfoPlaceModel> infoPlaceModelArrayList;
    private OnClickItemInfoPlace onClickItemInfoPlace;

    public RecyclersFragmentAdapter(OnClickItemInfoPlace onClickItemInfoPlace) {
        this.onClickItemInfoPlace = onClickItemInfoPlace;
    }

    public void setAdapter(ArrayList<InfoPlaceModel> infoPlaceModelArrayList){
        this.infoPlaceModelArrayList = infoPlaceModelArrayList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclersFragmentHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler,parent,false);
        return new RecyclersFragmentHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclersFragmentHolder holder, int position) {
        InfoPlaceModel infoPlaceModel = infoPlaceModelArrayList.get(position);

        holder.title.setText(infoPlaceModel.getNamePlace());
        holder.address.setText(infoPlaceModel.getAddressPlace());
        holder.img.setImageResource(infoPlaceModel.getImgPlace());

        holder.itemRecyclerView.setOnClickListener(view -> {
            onClickItemInfoPlace.onItemClick(infoPlaceModel);
        });
    }

    @Override
    public int getItemCount() {
        return infoPlaceModelArrayList.size();
    }

    static class RecyclersFragmentHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private TextView address;
        private ImageView img;
        RelativeLayout itemRecyclerView;

        public RecyclersFragmentHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.list_item_name_place);
            address = itemView.findViewById(R.id.list_item_address_place);
            img = itemView.findViewById(R.id.list_item_image);
            itemRecyclerView = itemView.findViewById(R.id.itemRecyclerView);
        }
    }
}
