package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    //Resource id for background restaurants of list
    private int mRestaurantsResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int restaurantsResourceId) {
        super(context, 0, words);
        mRestaurantsResourceId = restaurantsResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // check if the current view is reused else inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //get the object located at position
        Word word_item = getItem(position);

        //find the textview in list_item with id place_text_view
        TextView placeTextView = (TextView) listItemView.findViewById(R.id.place_text_view);
        //gets the place and set it to the text of this textView
        placeTextView.setText(word_item.getPlace());

        //find the textview in list_item with id web_text_view
        TextView webTextView = (TextView) listItemView.findViewById(R.id.web_text_view);
        //gets the web and set it to the text of this textView
        webTextView.setText(word_item.getWeb());

        //find the textview in list_item with id phone_text_view
        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phone_text_view);
        //gets the phone and set it to the text of this textView
        phoneTextView.setText(word_item.getPhone());

        //find the image view with id image
        ImageView mImageView = (ImageView) listItemView.findViewById(R.id.image);
        if (word_item.hasImage()) {

            //get the imageResource get and set it as source of the image view
            mImageView.setImageResource(word_item.getImageResourceId());

            //make the image view visible
            mImageView.setVisibility(View.VISIBLE);
        } else {
            mImageView.setVisibility(View.GONE);
        }

        //seach for the view with the give id
        View textContainer = listItemView.findViewById(R.id.text_container);

        // set its backgroung resource to the mRestaurantsResourceId
        textContainer.setBackgroundResource(mRestaurantsResourceId);

        return listItemView;
    }
}
