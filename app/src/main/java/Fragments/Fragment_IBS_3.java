package Fragments;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.banyan.omni.Cur_Activity;
import com.banyan.omni.R;

import java.io.IOException;


public class Fragment_IBS_3 extends Fragment {
    int fragVal;
    ImageView  next, prev;


    public static Fragment_IBS_3 init(int val) {
        Fragment_IBS_3 frag_3 = new Fragment_IBS_3();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        frag_3.setArguments(args);
        return frag_3;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragVal = getArguments() != null ? getArguments().getInt("val") : 3;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layoutView = inflater.inflate(R.layout.fragment_3, container,
                false);
        next = (ImageView) layoutView.findViewById(R.id.next);
        prev = (ImageView) layoutView.findViewById(R.id.prev);

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_IBS_46times Fragment_IBS_46times = new Fragment_IBS_46times();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.con, Fragment_IBS_46times);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_15 fragment_15 = new Fragment_15();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.con, fragment_15);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        return layoutView;
    }


}