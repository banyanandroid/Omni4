package Fragments;

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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.banyan.omni.Cur_Activity;
import com.banyan.omni.R;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.io.IOException;
import java.sql.ClientInfoStatus;


public class Fragment_5 extends Fragment {
    int fragVal;
    ImageView center_bg, omni_bg, arrow_1, arrow_2, arrow_3, arrow_4, next, prev, arrow_2_2,arrow_2_3;
    TextView strngth_bg;
    FrameLayout con;

    MediaPlayer player;
    AssetFileDescriptor afd;

    public static Fragment_5 init(int val) {
        Fragment_5 frag_5 = new Fragment_5();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        frag_5.setArguments(args);
        return frag_5;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragVal = getArguments() != null ? getArguments().getInt("val") : 1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        final View layoutView = inflater.inflate(R.layout.fragment_lay_5, container,
                false);
        con = (FrameLayout) layoutView.findViewById(R.id.con);


        arrow_1 = (ImageView) layoutView.findViewById(R.id.arrow_1);
        arrow_2 = (ImageView) layoutView.findViewById(R.id.arrow_2);
        arrow_2_2 = (ImageView) layoutView.findViewById(R.id.arrow_2_2);
        arrow_2_3 = (ImageView) layoutView.findViewById(R.id.arrow_2_3);
        arrow_3 = (ImageView) layoutView.findViewById(R.id.arrow_3);
        arrow_4 = (ImageView) layoutView.findViewById(R.id.arrow_4);
        //arrow_5 = (ImageView) layoutView.findViewById(R.id.arrow_5);
        next = (ImageView) layoutView.findViewById(R.id.next);
        prev = (ImageView) layoutView.findViewById(R.id.prev);

        //next.setVisibility(View.GONE);
        prev.setVisibility(View.GONE);


        arrow_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_6 fragment_6 = new Fragment_6();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conm, fragment_6);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        arrow_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_7 fragment_7 = new Fragment_7();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conm, fragment_7);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        /*arrow_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_8 fragment_8 = new Fragment_8();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conm, fragment_8);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });*/
        arrow_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_9 fragment_9 = new Fragment_9();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conm, fragment_9);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        arrow_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_10 fragment_10 = new Fragment_10();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conm, fragment_10);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        arrow_2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_10_2 fragment_10_2 = new Fragment_10_2();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conm, fragment_10_2);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        arrow_2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_10_3 fragment_10_3 = new Fragment_10_3();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conm, fragment_10_3);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_6 fragment_6 = new Fragment_6();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conm, fragment_6);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_2 fragment_2 = new Fragment_2();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conm, fragment_2);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        omni_bg = (ImageView) layoutView.findViewById(R.id.omni_bg);
        center_bg = (ImageView) layoutView.findViewById(R.id.center_bg);
        strngth_bg = (TextView) layoutView.findViewById(R.id.strength_bg);
        omni_bg.setVisibility(View.GONE);
        strngth_bg.setVisibility(View.GONE);

        YoYo.with(Techniques.ZoomIn)
                .duration(1000)
                .playOn(layoutView.findViewById(R.id.center_bg));



        next.postDelayed(new Runnable() {
            public void run() {
                next.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.SlideInRight)
                        .duration(100)
                        .playOn(layoutView.findViewById(R.id.next));
            }
        }, 100);
        prev.postDelayed(new Runnable() {
            public void run() {
                prev.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.SlideInLeft)
                        .duration(100)
                        .playOn(layoutView.findViewById(R.id.prev));
            }
        }, 100);
        omni_bg.postDelayed(new Runnable() {
            public void run() {
                omni_bg.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.ZoomIn)
                        .duration(800)
                        .playOn(layoutView.findViewById(R.id.omni_bg));


            }
        }, 1000);
        strngth_bg.postDelayed(new Runnable() {
            public void run() {
                strngth_bg.setVisibility(View.VISIBLE);
                /*YoYo.with(Techniques.SlideInUp)
                        .duration(1000)
                        .playOn(layoutView.findViewById(R.id.strength_bg));*/
            }
        }, 600);


        return layoutView;
    }


}