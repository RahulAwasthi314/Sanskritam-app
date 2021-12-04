package com.awasthir.sanskritam;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
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

    private MediaPlayer mMediaPlayer;

    private AudioManager mAudioManager;

    private final AudioManager.OnAudioFocusChangeListener mAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT ||
                    focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
                mMediaPlayer.pause();
                mMediaPlayer.seekTo(0);
            } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                mMediaPlayer.start();
            }
            else if (focusChange == AudioManager.AUDIOFOCUS_LOSS){
                releaseMediaPlayer();
            }
        }
    };

    private final MediaPlayer.OnCompletionListener mCompletionListener =
            mediaPlayer -> releaseMediaPlayer();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // INFLATE THE WORD LIST BECAUSE I NEED IT'S STRUCTURE TO PRODUCE THE UI LIKE IT
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        mAudioManager = (AudioManager) requireActivity().getSystemService(Context.AUDIO_SERVICE);

        // MAKE A WORD CLASS THAT WILL BE ABLE TO ENCAPSULATES
        // BOTH TRANSLATIONS { default and english }
        // AND FURTHER UPDATES

        // ARRAYLIST IS USED AS THE CONTAINER OF WORDS
        final ArrayList<Word> Words = new ArrayList<>();

        Words.add(new Word("Zero", "शून्यम्", R.drawable.number_zero, R.raw.number_zero));
        Words.add(new Word("One", "एकम्", R.drawable.number_one, R.raw.number_one));
        Words.add(new Word("Two", "द्वे", R.drawable.number_two, R.raw.number_two));
        Words.add(new Word("Three", "त्रीणि", R.drawable.number_three, R.raw.number_three));
        Words.add(new Word("Four", "चत्वारि", R.drawable.number_four, R.raw.number_four));
        Words.add(new Word("Five", "पञ्च", R.drawable.number_five, R.raw.number_five));
        Words.add(new Word("Six", "षष्ट", R.drawable.number_six, R.raw.number_six));
        Words.add(new Word("Seven", "सप्त", R.drawable.number_seven, R.raw.number_seven));
        Words.add(new Word("Eight", "अष्ट", R.drawable.number_eight, R.raw.number_eight));
        Words.add(new Word("Nine", "नव", R.drawable.number_nine, R.raw.number_nine));
        Words.add(new Word("Ten", "दश", R.drawable.number_ten, R.raw.number_ten));

        WordAdapter wordAdapter = new WordAdapter(requireActivity(), Words);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(wordAdapter);


        listView.setOnItemClickListener((adapterView, view, position, id) -> {
            Word word = Words.get(position);

            releaseMediaPlayer();

            int result = mAudioManager.requestAudioFocus(mAudioFocusChangeListener,
                    AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

            if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                mMediaPlayer = MediaPlayer.create(getActivity(), word.getAudioResourceId());

                mMediaPlayer.start();

                mMediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });


        return rootView;
    }


    @Override
    public void onStop () {
        super.onStop();
        releaseMediaPlayer();
    }

    private void releaseMediaPlayer () {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;

            mAudioManager.abandonAudioFocus(mAudioFocusChangeListener);
        }
    }
}
