package com.awasthir.sanskritam;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class NumeralsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // INFLATE THE WORD LIST BECAUSE I NEED IT'S STRUCTURE TO PRODUCE THE UI LIKE IT
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // MAKE A WORD CLASS THAT WILL BE ABLE TO ENCAPSULATES
        // BOTH TRANSLATIONS { default and english }
        // AND FURTHER UPDATES

        // ARRAYLIST IS USED AS THE CONTAINER OF WORDS
        final ArrayList<Word> Words = new ArrayList<>();

        Words.add(new Word("Zero", "शून्यम्"));
        Words.add(new Word("One", "एकम्"));
        Words.add(new Word("Two", "द्वे"));
        Words.add(new Word("Three", "त्रीणि"));
        Words.add(new Word("Four", "चत्वारि"));
        Words.add(new Word("Five", "पञ्चम्"));
        Words.add(new Word("Six", "षष्टम्"));
        Words.add(new Word("Seven", "सप्तम्"));
        Words.add(new Word("Eight", "अष्टम्"));
        Words.add(new Word("Nine", "नवम्"));
        Words.add(new Word("Ten", "दशम्"));

        WordAdapter wordAdapter = new WordAdapter(requireActivity(), Words);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(wordAdapter);


        return rootView;
    }
}
