package com.example.monportfolio.ui.centre_d_interet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.monportfolio.databinding.FragmentCentreDInteretBinding;

public class CentreDInteretFragment extends Fragment {
    private CentreDInteretViewModel centreDInteretViewModel;
    private FragmentCentreDInteretBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        centreDInteretViewModel =
                new ViewModelProvider(this).get(CentreDInteretViewModel.class);

        binding = FragmentCentreDInteretBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
