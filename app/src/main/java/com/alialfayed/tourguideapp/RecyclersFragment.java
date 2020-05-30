package com.alialfayed.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alialfayed.tourguideapp.util.Constant;

import java.util.ArrayList;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class RecyclersFragment extends Fragment implements OnClickItemInfoPlace {

    RecyclerView recyclerViewOfFragment;

    private MainActivity mainActivity;
    private ArrayList<InfoPlaceModel> infoPlaceModels;

    public RecyclersFragment(MainActivity mainActivity,ArrayList<InfoPlaceModel> infoPlaceModels) {
        this.mainActivity = mainActivity;
        this.infoPlaceModels = infoPlaceModels;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recyclers, container, false);
        // RecyclerView Initialize
        recyclerViewOfFragment = view.findViewById(R.id.recyclerViewOfFragment);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerViewOfFragment.setLayoutManager(linearLayoutManager);

        RecyclersFragmentAdapter adapter = new RecyclersFragmentAdapter(this);
        recyclerViewOfFragment.setAdapter(adapter);

        adapter.setAdapter(infoPlaceModels);

    }

    @Override
    public void onItemClick(InfoPlaceModel infoPlaceModel) {
        Intent intent = new Intent(mainActivity, OverviewActivity.class);
        intent.putExtra(Constant.MOVE_INTENT, infoPlaceModel);
        startActivity(intent);
    }
}