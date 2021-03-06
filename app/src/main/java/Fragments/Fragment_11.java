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
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.banyan.omni.Cur_Activity;
import com.banyan.omni.R;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.io.IOException;


public class Fragment_11 extends Fragment {
    int fragVal;
    RelativeLayout r1, r2, r3, r4, r5;
    TextView t1, t2, t3, t4, t5, t6;
    ImageView center_bg, omni_bg;
    TextView strngth_bg, pt_last_frag11;
    MediaPlayer player;
    AssetFileDescriptor afd;

    public static Fragment_11 init(int val) {
        Fragment_11 frag_11 = new Fragment_11();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        frag_11.setArguments(args);
        return frag_11;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragVal = getArguments() != null ? getArguments().getInt("val") : 1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View layoutView = inflater.inflate(R.layout.fragment_lay_11, container,
                false);

        r1 = (RelativeLayout) layoutView.findViewById(R.id.r_1);
        r2 = (RelativeLayout) layoutView.findViewById(R.id.r_2);
        r3 = (RelativeLayout) layoutView.findViewById(R.id.r_3);
        r4 = (RelativeLayout) layoutView.findViewById(R.id.r_4);
        r5 = (RelativeLayout) layoutView.findViewById(R.id.r_5);

        omni_bg = (ImageView) layoutView.findViewById(R.id.omni_bg);
        center_bg = (ImageView) layoutView.findViewById(R.id.center_bg);
        strngth_bg = (TextView) layoutView.findViewById(R.id.strength_bg);
        pt_last_frag11 = (TextView) layoutView.findViewById(R.id.pt_last_frag11);
        ImageView next = (ImageView) layoutView.findViewById(R.id.next);
        ImageView prev = (ImageView) layoutView.findViewById(R.id.prev);

        YoYo.with(Techniques.ZoomIn)
                .duration(1500)
                .playOn(layoutView.findViewById(R.id.omni_bg));
        YoYo.with(Techniques.ZoomIn)
                .duration(1500)
                .playOn(layoutView.findViewById(R.id.center_bg));
        YoYo.with(Techniques.Shake)
                .duration(1500)
                .playOn(layoutView.findViewById(R.id.strength_bg));

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_Video fragment_v = new Fragment_Video();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conk, fragment_v);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_9 fragment_9 = new Fragment_9();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conj, fragment_9);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        r1.setVisibility(View.GONE);
        r2.setVisibility(View.GONE);
        r3.setVisibility(View.GONE);
        r4.setVisibility(View.GONE);
        r5.setVisibility(View.GONE);
        pt_last_frag11.setVisibility(View.GONE);

        r1.postDelayed(new Runnable() {
            public void run() {
                r1.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.SlideInLeft)
                        .duration(300)
                        .playOn(layoutView.findViewById(R.id.r_1));
            }
        }, 100);
        r2.postDelayed(new Runnable() {
            public void run() {
                r2.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.SlideInRight)
                        .duration(300)
                        .playOn(layoutView.findViewById(R.id.r_2));
            }
        }, 200);
        r3.postDelayed(new Runnable() {
            public void run() {
                r3.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.SlideInLeft)
                        .duration(300)
                        .playOn(layoutView.findViewById(R.id.r_3));
            }
        }, 300);
        r4.postDelayed(new Runnable() {
            public void run() {
                r4.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.SlideInRight)
                        .duration(300)
                        .playOn(layoutView.findViewById(R.id.r_4));
            }
        }, 400);
        r5.postDelayed(new Runnable() {
            public void run() {
                r5.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.SlideInLeft)
                        .duration(300)
                        .playOn(layoutView.findViewById(R.id.r_5));
            }
        }, 500);

        pt_last_frag11.postDelayed(new Runnable() {
            public void run() {
                pt_last_frag11.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.SlideInUp)
                        .duration(300)
                        .playOn(layoutView.findViewById(R.id.pt_last_frag11));
            }
        }, 600);

        return layoutView;
    }


}