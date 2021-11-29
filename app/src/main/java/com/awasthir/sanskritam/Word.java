package com.awasthir.sanskritam;

public class Word {

    private String mDefaultTranslation;
    private String mSanskritTranslation;

    public Word (String defaultTranslation, String sanskritTranslation) {
        setDefaultTranslation(defaultTranslation);
        setSanskritTranslation(sanskritTranslation);
    }

    public void setDefaultTranslation (String defaultTranslation){
        mDefaultTranslation = defaultTranslation;
    }

    public void setSanskritTranslation (String sanskritTranslation) {
        mSanskritTranslation = sanskritTranslation;
    }

    public String getDefaultTranslation () {
        return mDefaultTranslation;
    }

    public String getSanskritTranslation () {
        return mSanskritTranslation;
    }
}
