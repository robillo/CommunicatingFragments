package com.robillo.communicatingfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class AFragment extends Fragment {

    Button add;
    communicate cm;

    public AFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_a, container, false);
        add = (Button) v.findViewById(R.id.add);
        cm = (communicate) getActivity();
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cm.sendData();
            }
        });
        return v;
    }

    public static AFragment newInstance(){
        return new AFragment();
    }
}
