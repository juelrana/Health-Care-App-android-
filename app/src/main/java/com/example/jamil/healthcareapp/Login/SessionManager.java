package com.example.jamil.healthcareapp.Login;

import android.content.Context;
import android.content.SharedPreferences;


public class SessionManager {


    public void setPreferences(Context context, String key, String value) {

        SharedPreferences.Editor editor = context.getSharedPreferences("TeamTyro", Context.MODE_PRIVATE).edit();
        editor.putString(key, value);
        editor.commit();

    }



    public  String getPreferences(Context context, String key) {

        SharedPreferences prefs = context.getSharedPreferences("TeamTyro",	Context.MODE_PRIVATE);
        String position = prefs.getString(key, "");
        return position;
    }
}
