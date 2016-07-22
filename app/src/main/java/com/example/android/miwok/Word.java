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
    public Word(String miwokTranslation, String defaultTranslation, int imageResourceID, int audioResourceID){
        this.mMiwokTranslation = miwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
        this.mImageResourceID = imageResourceID;
        this.mAudioResourceID = audioResourceID;
    }

    /**
     * Constructor for just words
     * */
    public Word(String miwokTranslation, String defaultTranslation, int audioResourceID){
        this.mMiwokTranslation = miwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
        this.mAudioResourceID = audioResourceID;
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

    /*
    * Checks if the Image exists for the current word
    * */
    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE;
    }

    /*
    * Returns the Audio resource ID for the current word
    * */
    public int getAudioResourceID(){ return mAudioResourceID; }
}
