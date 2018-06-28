package com.example.android.miwok;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CulturalFragment extends Fragment {


    public CulturalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);


        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Indianapolis Motor Speedway", "http://www.indianapolismotorspeedway.com/", "317 311 32 32", R.drawable.ims));
        words.add(new Word("Monument Circle", "http://www.indianawarmemorials.org/", "317-232-7615", R.drawable.monument));
        words.add(new Word("Fountain Square Cultural District", "http://www.discoverfountainsquare.com/", "317 311 32 32", R.drawable.fountain));
        words.add(new Word("Wheel Fun Rentals", "http://www.wheelfunrentals.com", "317-363-9353", R.drawable.wheel));


        // setting up the array adapter
        WordAdapter itemsAdapter = new WordAdapter(getActivity(), words, R.color.category_cultural);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView) rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);


        return rootView;
    }


}
