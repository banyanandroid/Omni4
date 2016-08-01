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


public class Fragment_16 extends Fragment {
    int fragVal;

    ImageView center_bg, omni_bg;
    TextView strngth_bg;
    MediaPlayer player;
    AssetFileDescriptor afd;

    public static Fragment_16 init(int val) {
        Fragment_16 frag_16 = new Fragment_16();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        frag_16.setArguments(args);
        return frag_16;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragVal = getArguments() != null ? getArguments().getInt("val") : 1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View layoutView = inflater.inflate(R.layout.fragment_lay_16, container,
                false);

        omni_bg = (ImageView) layoutView.findViewById(R.id.omni_bg);
        center_bg = (ImageView) layoutView.findViewById(R.id.center_bg);
        strngth_bg = (TextView) layoutView.findViewById(R.id.strength_bg);

        ImageView next = (ImageView) layoutView.findViewById(R.id.next);
        ImageView prev = (ImageView) layoutView.findViewById(R.id.prev);

        YoYo.with(Techniques.ZoomIn)
                .duration(1000)
                .playOn(layoutView.findViewById(R.id.omni_bg));
        YoYo.with(Techniques.ZoomIn)
                .duration(1000)
                .playOn(layoutView.findViewById(R.id.center_bg));
        YoYo.with(Techniques.ZoomIn)
                .duration(1000)
                .playOn(layoutView.findViewById(R.id.strength_bg));

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_17 fragment_17 = new Fragment_17();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conk, fragment_17);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_15 fragment_15 = new Fragment_15();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conk, fragment_15);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        return layoutView;
    }

    }