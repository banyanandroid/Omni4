package Fragments;

import android.content.res.AssetFileDescriptor;
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

import com.banyan.omni.R;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.io.IOException;


public class Fragment_4242 extends Fragment {
    int fragVal;
    RelativeLayout r1, r2, r3, r4, r5, r6;
    TextView t1, t2, t3, t4, t5, t6;
    ImageView center_bg, omni_bg;
    TextView strngth_bg;

    public static Fragment_4242 init(int val) {
        Fragment_4242 frag_4242 = new Fragment_4242();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        frag_4242.setArguments(args);
        return frag_4242;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragVal = getArguments() != null ? getArguments().getInt("val") : 1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View layoutView = inflater.inflate(R.layout.fragment_lay_4242, container,
                false);

        r1 = (RelativeLayout) layoutView.findViewById(R.id.r_1);
        r2 = (RelativeLayout) layoutView.findViewById(R.id.r_2);
        r3 = (RelativeLayout) layoutView.findViewById(R.id.r_3);
        r4 = (RelativeLayout) layoutView.findViewById(R.id.r_4);
        r5 = (RelativeLayout) layoutView.findViewById(R.id.r_5);
        r6 = (RelativeLayout) layoutView.findViewById(R.id.r_6);

        omni_bg = (ImageView) layoutView.findViewById(R.id.omni_bg);
        center_bg = (ImageView) layoutView.findViewById(R.id.center_bg);
        strngth_bg = (TextView) layoutView.findViewById(R.id.strength_bg);
        ImageView next = (ImageView) layoutView.findViewById(R.id.next);
        ImageView prev = (ImageView) layoutView.findViewById(R.id.prev);
        ImageView back = (ImageView) layoutView.findViewById(R.id.back);

        YoYo.with(Techniques.ZoomIn)
                .duration(600)
                .playOn(layoutView.findViewById(R.id.omni_bg));
        YoYo.with(Techniques.ZoomIn)
                .duration(600)
                .playOn(layoutView.findViewById(R.id.center_bg));
        YoYo.with(Techniques.ZoomIn)
                .duration(600)
                .playOn(layoutView.findViewById(R.id.strength_bg));

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_43 fragment_43 = new Fragment_43();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conk, fragment_43);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_41 fragment_41 = new Fragment_41();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conk, fragment_41);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_4040 fragment_40 = new Fragment_4040();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conk, fragment_40);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        r1.setVisibility(View.GONE);
        r2.setVisibility(View.GONE);
        r3.setVisibility(View.GONE);
        r4.setVisibility(View.GONE);
        r5.setVisibility(View.GONE);
        r6.setVisibility(View.GONE);

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
        r6.postDelayed(new Runnable() {
            public void run() {
                r6.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.SlideInRight)
                        .duration(300)
                        .playOn(layoutView.findViewById(R.id.r_6));
            }
        }, 600);

        return layoutView;
    }


}