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

public class ProverbsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        final ArrayList<Word> Words = new ArrayList<>();

        Words.add(new Word("Dharma, when protected, protects", "धर्मो रक्षति रक्षितः"));
        Words.add(new Word("Mother and Motherland are like heaven", "जननी जन्मभुमिस्छ स्वर्गादपि गरीयसि"));
        Words.add(new Word("During ones ruin his wisdom wouldn't pay off", "विनाश काले विपरीत बुद्धि"));
        Words.add(new Word("The underlings are quite a match to their leader", "यथा राज तथा प्रजा"));
        Words.add(new Word("Moderation should be exercised in everything", "अति सर्वत्र वर्जयेत्"));
        Words.add(new Word("Money accomplishes tasks/wonders", "कांचाणेन कार्य सिद्धिः"));
        Words.add(new Word("Where there is a fire there is definitely a smoke cloud", "यत्र धूमो तत्र वह्निः"));
        Words.add(new Word("Body is a means to accomplish a dharma/merit", "शरीरमाद्यं खलु धर्म साधनं"));
        Words.add(new Word("Wisdom is the right measure of ones strength", "बुद्धिः यस्य बलं तस्य"));
        Words.add(new Word("There is nothing like knowledge in this world", "नहि ज्ञानेन सदृशं"));


        WordAdapter listAdapter = new WordAdapter(getActivity(), Words);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(listAdapter);

        return rootView;
    }
}
