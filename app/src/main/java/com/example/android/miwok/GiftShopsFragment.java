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
public class GiftShopsFragment extends Fragment {


    public GiftShopsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Silver in the City", "http://www.silverinthecity.com/", "317-955-9925", R.drawable.silver));
        words.add(new Word("Homespun: Modern Handmade", "http://www.homespunindy.com/", "317-351-0280", R.drawable.homespun));
        words.add(new Word("Colts Pro Shop - Lucas Oil Stadium", "http://coltsproshop.com/", "317-262-2700", R.drawable.colts));
        words.add(new Word("Pacers Home Court Gift Shop", "http://www.bankerslifefieldhouse.com", "317 311 32 32", R.drawable.pacers));


        // setting up the array adapter
        WordAdapter itemsAdapter = new WordAdapter(getActivity(), words, R.color.category_giftShops);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView) rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;

    }
}
