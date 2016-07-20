package com.example.android.miwok;

/**
 * Created by nagma on 07.16.16.
 */
public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceID = NO_IMAGE;
    private static final int NO_IMAGE = -1;
    private int mAudioResourceID;

    /*
    * Constructor for image + words
    * */
    public Word(String mMiwokTranslation, String mDefaultTranslation, int mImageResourceID, int mAudioResourceID){
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mImageResourceID = mImageResourceID;
        this.mAudioResourceID = mAudioResourceID;
    }

    /**
     * Constructor for just words
     * */
    public Word(String mMiwokTranslation, String mDefaultTranslation, int mAudioResourceID){
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mAudioResourceID = mAudioResourceID;
    }

    /**
     * Returns Miwork translation of the word
     */
    public String getMiwokWord() {
        return mMiwokTranslation;
    }

    /*
    * Returns Default English translation of the word
    * */
    public String getDefaultWord(){
        return mDefaultTranslation;
    }

    /*
    * Returns Image resource ID for that particular word
    * */
    public int getImageResourceID(){ return mImageResourceID; }

    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE;
    }

    public int getAudioResourceID(){ return mAudioResourceID; }
}
