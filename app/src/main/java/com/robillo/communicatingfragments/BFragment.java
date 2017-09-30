package com.robillo.communicatingfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BFragment extends Fragment {

    TextView display;
    static int count = -1;

    public BFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_b, container, false);
        display = (TextView) v.findViewById(R.id.display);
        setIncrementCount();
        return v;
    }

    public void setIncrementCount(){
        count++;
        display.setText(String.valueOf(count));
    }

    public static BFragment newInstance(){
        return new BFragment();
    }
}
