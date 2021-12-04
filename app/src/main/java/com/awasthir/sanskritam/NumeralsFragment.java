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

        Words.add(new Word("Zero", "शून्यम्", R.drawable.number_zero));
        Words.add(new Word("One", "एकम्", R.drawable.number_one));
        Words.add(new Word("Two", "द्वे", R.drawable.number_two));
        Words.add(new Word("Three", "त्रीणि", R.drawable.number_three));
        Words.add(new Word("Four", "चत्वारि", R.drawable.number_four));
        Words.add(new Word("Five", "पञ्चम्", R.drawable.number_five));
        Words.add(new Word("Six", "षष्टम्", R.drawable.number_six));
        Words.add(new Word("Seven", "सप्तम्", R.drawable.number_seven));
        Words.add(new Word("Eight", "अष्टम्", R.drawable.number_eight));
        Words.add(new Word("Nine", "नवम्", R.drawable.number_nine));
        Words.add(new Word("Ten", "दशम्", R.drawable.number_ten));

        WordAdapter wordAdapter = new WordAdapter(requireActivity(), Words);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(wordAdapter);


        return rootView;
    }
}
