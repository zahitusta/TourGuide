package com.example.android.miwok;

/**
 *
 */
public class Word {

    //Place for the words
    private String mPlace;

    //web for the words
    private String mWeb;
    //phone for the words
    private String mPhone;

    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    //Music file Id for words
    private int mAudioResourceId;

    // constructor for the new word object
    public Word(String place, String web, String phone) {
        mPlace = place;
        mWeb = web;
        mPhone = phone;


    }

    // constructor for the new word object with image Resource id
    //text disappears
    public Word(String place, String web, String phone, int imageResourceId) {
        mPlace = place;
        mWeb = web;
        mPhone = phone;
        mImageResourceId = imageResourceId;
    }

    //get the place
    public String getPlace() {
        return mPlace;
    }

    //get the web
    public String getWeb() {
        return mWeb;
    }

    //get the phone
    public String getPhone() {
        return mPhone;
    }

    //get the image resource Id
    public int getImageResourceId() {
        return mImageResourceId;
    }

    // check whether image resource id is provided or not
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
