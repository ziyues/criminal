package com.bignerdranch.android.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by lt on 2016/6/21.
 */
public class AudioPlayer {
    private MediaPlayer mMediaPlayer;

    public void stop() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }

    public void start(Context context) {
        stop();
        mMediaPlayer = MediaPlayer.create(context, R.raw.one_small_step);
        mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stop();
            }
        });
        mMediaPlayer.start();
    }
}
