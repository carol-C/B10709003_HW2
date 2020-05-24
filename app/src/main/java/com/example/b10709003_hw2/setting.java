package com.example.b10709003_hw2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;

public class setting extends PreferenceActivity {
    @Override
    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);*/
    public void onCreate (@Nullable Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        //getFragmentManager().beginTransaction().replace(android.R.content,new SetFrag()).commit();

    }
    public static class SetFrag extends PreferenceFragment {
       @Override
        public void onCreate(@Nullable Bundle saveInstanceState) {
            super.onCreate(saveInstanceState);
            //addPreferencesFromResource(R.xml.listpref);
        }
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        this.finish();
        Intent intent =new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }
    }


