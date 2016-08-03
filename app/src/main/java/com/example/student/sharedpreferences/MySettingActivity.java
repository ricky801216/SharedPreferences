package com.example.student.sharedpreferences;

import android.app.FragmentTransaction;
import android.os.Bundle;

/**
 * Created by Student on 2016/8/3.
 */
public class MySettingActivity extends AppCompatPreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //建立一個 Fragment
        FragmentTransaction ft =
                getFragmentManager().beginTransaction();
        ft.replace(android.R.id.content,
                new MyPrefFragment()).commit();
    }
}
