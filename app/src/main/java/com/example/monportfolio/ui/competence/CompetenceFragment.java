package com.example.monportfolio.ui.competence;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.monportfolio.databinding.FragmentCompetencesBinding;
import com.example.monportfolio.databinding.FragmentFormationsBinding;
import com.example.monportfolio.ui.formations.FormationViewModel;

public class CompetenceFragment extends Fragment {
    private CompetencesViewModel competencesViewModel;
    private FragmentCompetencesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        competencesViewModel =
                new ViewModelProvider(this).get(CompetencesViewModel.class);

        binding = FragmentCompetencesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
