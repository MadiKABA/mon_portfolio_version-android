package com.example.monportfolio.ui.realisation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.monportfolio.databinding.FragmentRealisationsBinding;

public class RealisationFragment extends Fragment {

    private RealisationViewModel realisationViewModel;
    private FragmentRealisationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        realisationViewModel =
                new ViewModelProvider(this).get(RealisationViewModel.class);

        binding = FragmentRealisationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
