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
public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("White River State Park", "www.whiteriverstatepark.org", "317-233-2434", R.drawable.white_river));
        words.add(new Word("Indianapolis Zoo", "http://www.indianapoliszoo.com/", "317-630-2001", R.drawable.zoo));
        words.add(new Word("Conner Prairie", "http://www.connerprairie.org/", "317-776-6000", R.drawable.connor_praire));
        words.add(new Word("Gondola Rides", "http://www.4gondola.com/", "317-340-2489", R.drawable.gondola));

        // setting up the array adapter
        WordAdapter itemsAdapter = new WordAdapter(getActivity(), words, R.color.category_attractions);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView) rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
