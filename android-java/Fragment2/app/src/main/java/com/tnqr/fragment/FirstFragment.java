package com.tnqr.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup viewGroup =(ViewGroup) inflater.inflate(R.layout.first_fragment,container,false);
        String text =viewGroup.findViewById(R.id.textView).toString();

        return inflater.inflate(R.layout.first_fragment,container,false);
    }
}
