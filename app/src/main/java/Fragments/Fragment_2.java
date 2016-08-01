package Fragments;

import android.app.Activity;
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
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.banyan.omni.Cur_Activity;
import com.banyan.omni.R;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.io.IOException;


public class Fragment_2 extends Fragment {
    int fragVal;
    ImageView left_2, right_2, logo, next, prev, video1,video2;
    TextView head;
    MediaPlayer player;
    AssetFileDescriptor afd;

    public static Fragment_2 init(int val) {
        Fragment_2 frag_2 = new Fragment_2();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        frag_2.setArguments(args);
        return frag_2;
    }

    View layoutView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragVal = getArguments() != null ? getArguments().getInt("val") : 1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        layoutView = inflater.inflate(R.layout.fragment_lay_2, container,
                false);

        left_2 = (ImageView) layoutView.findViewById(R.id.left_frag2);
        right_2 = (ImageView) layoutView.findViewById(R.id.right_frag2);
        video1 = (ImageView) layoutView.findViewById(R.id.video1);
        video2 = (ImageView) layoutView.findViewById(R.id.video2);
        logo = (ImageView) layoutView.findViewById(R.id.one_frag2);
        head = (TextView) layoutView.findViewById(R.id.head_frag2);
        next = (ImageView) layoutView.findViewById(R.id.next);
        prev = (ImageView) layoutView.findViewById(R.id.prev);


        video1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment_Video3 fragment_3 = new Fragment_Video3();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.con, fragment_3);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        video2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_Video4 fragment_4 = new Fragment_Video4();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.con, fragment_4);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_5 fragment_5 = new Fragment_5();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.con, fragment_5);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_1 fragment_1 = new Fragment_1();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.con, fragment_1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        left_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_curcumin fragment_curcumin = new Fragment_curcumin();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.con, fragment_curcumin);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        right_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_curcumin fragment_curcumin = new Fragment_curcumin();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.con, fragment_curcumin);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });


        YoYo.with(Techniques.Flash)
                .duration(1000)
                .playOn(layoutView.findViewById(R.id.head_frag2));
        YoYo.with(Techniques.RotateInUpLeft)
                .duration(500)
                .playOn(layoutView.findViewById(R.id.left_frag2));
        YoYo.with(Techniques.RollIn)
                .duration(500)
                .playOn(layoutView.findViewById(R.id.right_frag2));
        YoYo.with(Techniques.RotateIn)
                .duration(500)
                .playOn(layoutView.findViewById(R.id.one_frag2));


        return layoutView;
    }



}