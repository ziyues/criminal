package com.bignerdranch.android.criminalintent;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;

/**
 * Created by lt on 2016/6/15.
 */
public class DatePickeFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity()).setTitle(R.string.date_picker_title)
                .setPositiveButton(android.R.string.ok, null)
                .create();
    }
}
