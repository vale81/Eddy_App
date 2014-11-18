package com.example.fabian.eddy;

import android.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Fabian on 09.11.2014.
 */
public class FragmentTab2 extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.tab, container, false);
        TextView textview = (TextView) view.findViewById(R.id.tabtextview);
        //textview.setText(R.string.Grafik);
        showUserSettings(textview);
        return view;
    }

    private void showUserSettings(TextView txtview) {
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(getActivity());

        StringBuilder builder = new StringBuilder();

        builder.append("\n Mahlzeit Angabe "
                + sharedPrefs.getString("mahlzeit_angabe", "NULL"));

        txtview.setText(builder.toString());
    }
}
