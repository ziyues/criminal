package com.bignerdranch.android.hellomoon;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by lt on 2016/6/21.
 */
public class HelloMoonFragment extends Fragment {
    private Button mPlay;
    private Button mStop;
    private AudioPlayer mPlayer = new AudioPlayer();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hello_moon, container, false);
        mPlay = (Button) view.findViewById(R.id.hellomoon_play);
        mPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer.start(getActivity());
            }
        });
        mStop = (Button) view.findViewById(R.id.hellomoon_stop);
        mStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer.stop();
            }
        });
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPlayer.stop();
    }
}
