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


public class Fragment_25 extends Fragment {
    int fragVal;

    ImageView center_bg, omni_bg, imageView11;
    TextView strngth_bg, textView11;
    MediaPlayer player;
    AssetFileDescriptor afd;

    public static Fragment_25 init(int val) {
        Fragment_25 frag_25 = new Fragment_25();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        frag_25.setArguments(args);
        return frag_25;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragVal = getArguments() != null ? getArguments().getInt("val") : 1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View layoutView = inflater.inflate(R.layout.fragment_lay_25, container,
                false);



        omni_bg = (ImageView) layoutView.findViewById(R.id.omni_bg);
        center_bg = (ImageView) layoutView.findViewById(R.id.center_bg);
        imageView11 = (ImageView) layoutView.findViewById(R.id.imageView11);
        textView11 = (TextView) layoutView.findViewById(R.id.textView11);
        strngth_bg = (TextView) layoutView.findViewById(R.id.strength_bg);

        ImageView next = (ImageView) layoutView.findViewById(R.id.next);
        next.setVisibility(View.GONE);
        ImageView prev = (ImageView) layoutView.findViewById(R.id.prev);

        YoYo.with(Techniques.Shake)
                .duration(500)
                .playOn(layoutView.findViewById(R.id.omni_bg));
        YoYo.with(Techniques.Flash)
                .duration(500)
                .playOn(layoutView.findViewById(R.id.center_bg));
        YoYo.with(Techniques.Shake)
                .duration(500)
                .playOn(layoutView.findViewById(R.id.strength_bg));


        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_24 fragment_24 = new Fragment_24();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conk, fragment_24);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });



        return layoutView;
    }


}