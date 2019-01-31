package com.concordia.cejv669.activitybehaviorlab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Lab2","MainActivity:onCreate");
        Toast.makeText(getApplicationContext(),"MainActivity:onCreate",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("Lab2","MainActivity:onStart");
        Toast.makeText(getApplicationContext(),"MainActivity:onStart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Lab2","MainActivity:onResume");
        Toast.makeText(getApplicationContext(),"MainActivity:onResume",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Lab2","MainActivity:onPause");
        Toast.makeText(getApplicationContext(),"MainActivity:onPause",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("Lab2","MainActivity:onStop");
        Toast.makeText(getApplicationContext(),"MainActivity:onStop",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("Lab2","MainActivity:onDestroy");
        Toast.makeText(getApplicationContext(),"MainActivity:onDestroy",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("Lab2","MainActivity:onRestart");
        Toast.makeText(getApplicationContext(),"MainActivity:onRestart",Toast.LENGTH_SHORT).show();
    }

}
