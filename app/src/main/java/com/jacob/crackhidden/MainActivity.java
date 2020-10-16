package com.jacob.crackhidden;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.jacob.mnativetools.MReflectTool;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        doReflect();
    }

    public void onCrack(View view) {
        MReflectTool.crackHideMethod(getApplication().getApplicationInfo().targetSdkVersion, Build.VERSION.SDK_INT);
        doReflect();
    }

    private void doReflect() {
        try {
            Field FINISH_TASK_WITH_ROOT_ACTIVITYF = Activity.class.getDeclaredField("FINISH_TASK_WITH_ROOT_ACTIVITY");
            FINISH_TASK_WITH_ROOT_ACTIVITYF.setAccessible(true);
            int value = (int) FINISH_TASK_WITH_ROOT_ACTIVITYF.get(this);
            Log.d("jacob", "value " + value);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
