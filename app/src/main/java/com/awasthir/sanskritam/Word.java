package com.awasthir.sanskritam;

public class Word {

    final int NO_IMAGE_PROVIDED = -1;

    private String mDefaultTranslation;
    private String mSanskritTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    public Word (String defaultTranslation, String sanskritTranslation) {
        setDefaultTranslation(defaultTranslation);
        setSanskritTranslation(sanskritTranslation);
    }

    public Word (String defaultTranslation, String sanskritTranslation, int imageResourceId) {
        setDefaultTranslation(defaultTranslation);
        setSanskritTranslation(sanskritTranslation);
        mImageResourceId = imageResourceId;
    }

    public void setDefaultTranslation (String defaultTranslation){
        mDefaultTranslation = defaultTranslation;
    }

    public void setSanskritTranslation (String sanskritTranslation) {
        mSanskritTranslation = sanskritTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }



    public String getDefaultTranslation () {
        return mDefaultTranslation;
    }

    public String getSanskritTranslation () {
        return mSanskritTranslation;
    }
}
