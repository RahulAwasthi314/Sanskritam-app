package com.awasthir.sanskritam;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class NumeralsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // INFLATE THE WORD LIST BECAUSE I NEED IT'S STRUCTURE TO PRODUCE THE UI LIKE IT
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        TextView sampleTextView = rootView.findViewById(R.id.sample_text_view);
        sampleTextView.setText(R.string.modified_text);

        return rootView;
    }
}
