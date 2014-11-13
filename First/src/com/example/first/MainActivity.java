package com.example.first;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {
   DrawingTheBubble v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
        v=new DrawingTheBubble(MainActivity.this);
        setContentView(v);
    }
}
