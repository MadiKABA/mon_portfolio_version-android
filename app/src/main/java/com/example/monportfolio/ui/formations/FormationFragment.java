package com.example.monportfolio.ui.formations;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.monportfolio.databinding.FragmentFormationsBinding;
import com.example.monportfolio.databinding.FragmentHomeBinding;
import com.example.monportfolio.ui.home.HomeViewModel;


public class FormationFragment extends Fragment {
    private FormationViewModel formationViewModel;
    private FragmentFormationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        formationViewModel =
                new ViewModelProvider(this).get(FormationViewModel.class);

        binding = FragmentFormationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
