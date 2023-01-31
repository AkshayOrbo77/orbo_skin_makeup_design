package com.example.orboskinanalysis.activities;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import com.example.orboskinanalysis.R;

public class BaseActivity extends AppCompatActivity
{

    public static String getSessionTime(long startTime) {
        return String.valueOf(System.currentTimeMillis() - startTime);
    }

    public static void showToast(Activity activity, String message){
        showToast(activity,message, false);
    }

    public static void showToast(Activity activity, String message, boolean isLongLength) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_message, null);
        ((TextView) layout.findViewById(R.id.toast_text)).setText(message);
        Toast toast = new Toast(activity.getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.BOTTOM, 0, 0);
        if (isLongLength) {
            toast.setDuration(Toast.LENGTH_LONG);
        } else {
            toast.setDuration(Toast.LENGTH_SHORT);
        }
        toast.setView(layout);
        toast.show();
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

}
