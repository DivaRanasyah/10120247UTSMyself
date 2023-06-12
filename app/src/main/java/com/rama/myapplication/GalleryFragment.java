package com.rama.myapplication;

//10120247 Diva Putra Ranasyah IF6

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GalleryFragment extends Fragment {
    String title[] = {"abyan ", "royyan", "Ardian", "hasbi ", "Albee Akbar","Diva"};
    int arr[] = {R.drawable.abyan, R.drawable.royyan, R.drawable.nub, R.drawable.hasbi, R.drawable.albe, R.drawable.divapr};
    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_gallery, container, false);
        recyclerView = rootView.findViewById(R.id.list_gallery);
        layoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        Adapter_gallery adapter_gallery = new Adapter_gallery(getActivity(),title,arr);
        recyclerView.setAdapter(adapter_gallery);
        return rootView;
    }
}
