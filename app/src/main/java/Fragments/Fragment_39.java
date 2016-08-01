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

import com.banyan.omni.R;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.io.IOException;


public class Fragment_39 extends Fragment {
    int fragVal;
    RelativeLayout r1, r2;
    ImageView center_bg, omni_bg, prev;
    TextView strngth_bg, textView15;

    public static Fragment_39 init(int val) {
        Fragment_39 frag_39 = new Fragment_39();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        frag_39.setArguments(args);
        return frag_39;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragVal = getArguments() != null ? getArguments().getInt("val") : 1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View layoutView = inflater.inflate(R.layout.fragment_lay_39, container,
                false);

        r1 = (RelativeLayout) layoutView.findViewById(R.id.r_1);
        r2 = (RelativeLayout) layoutView.findViewById(R.id.r_2);

        omni_bg = (ImageView) layoutView.findViewById(R.id.omni_bg);
        center_bg = (ImageView) layoutView.findViewById(R.id.center_bg);
        strngth_bg = (TextView) layoutView.findViewById(R.id.strength_bg);
        textView15 = (TextView) layoutView.findViewById(R.id.textView15);
        //next = (ImageView) layoutView.findViewById(R.id.next);
        prev = (ImageView) layoutView.findViewById(R.id.prev);

        YoYo.with(Techniques.ZoomIn)
                .duration(400)
                .playOn(layoutView.findViewById(R.id.omni_bg));
        YoYo.with(Techniques.ZoomIn)
                .duration(500)
                .playOn(layoutView.findViewById(R.id.center_bg));
        YoYo.with(Techniques.ZoomIn)
                .duration(500)
                .playOn(layoutView.findViewById(R.id.strength_bg));


        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_38 fragment_38 = new Fragment_38();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conk, fragment_38);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();


            }
        });

        r1.setVisibility(View.GONE);
        r2.setVisibility(View.GONE);

        textView15.setVisibility(View.GONE);


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

        textView15.postDelayed(new Runnable() {
            public void run() {
                textView15.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.SlideInRight)
                        .duration(300)
                        .playOn(layoutView.findViewById(R.id.textView15));
            }
        }, 300);

        return layoutView;
    }

    MediaPlayer player;
    AssetFileDescriptor afd;


}