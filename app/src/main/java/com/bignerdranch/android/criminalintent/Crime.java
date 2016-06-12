package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 * Created by lt on 2016/6/12.
 */
public class Crime {
    public Crime(){
        mId =UUID.randomUUID();
    }

    private UUID mId;

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    private String mTitle;
}
