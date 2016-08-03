package com.example.student.sharedpreferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //建立欄位
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickSave(View v)
    {

        EditText ed = (EditText) findViewById(R.id.editText);
        String str = ed.getText().toString();

        //建立與設定偏好資訊
        sp = getSharedPreferences("data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        editor.putString("nickname", str);
        editor.commit();
    }

    public void clickLoad(View v)
    {
        sp = getSharedPreferences("data", Context.MODE_PRIVATE);
        String str = sp.getString("nickname", "預設值");
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(str);

    }
    public void clickSetting(View v)
    {
        Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(intent);
    }
    public void clickMyPref(View v)
    {
        Intent intent = new Intent(MainActivity.this, MySettingActivity.class);
        startActivity(intent);
    }
}
