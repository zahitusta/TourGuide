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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Milktooth", "http://www.milktoothindy.com/", "317-986-5131", R.drawable.milktooth));  // resource id is of integer type
        words.add(new Word("Nada", "http://eatdrinknada.com/", "317-638-6232", R.drawable.nada));
        words.add(new Word("Good Morning Mama's Cafe", "http://www.goodmorningmamas.com/new/", "317-255-3800", R.drawable.mama));
        words.add(new Word("The Loft at Traders Point Creamery", "http://www.traderspointcreamery.com/", "tel:317-733-1700", R.drawable.loft));


        // setting up the array adapter
        WordAdapter itemsAdapter = new WordAdapter(getActivity(), words, R.color.category_restaurants);

        // finding the listView and setting the adapter to it
        final ListView listView = (ListView) rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);


        return rootView;
    }


}
