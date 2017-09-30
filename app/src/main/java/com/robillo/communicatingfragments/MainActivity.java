package com.robillo.communicatingfragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements communicate{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container1, AFragment.newInstance(), "A").commit();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container2, BFragment.newInstance(), "B").commit();
    }

    @Override
    public void sendData() {
        FragmentManager manager = getSupportFragmentManager();
        BFragment fragment = (BFragment) manager.findFragmentByTag("B");
        fragment.setIncrementCount();
    }
}
