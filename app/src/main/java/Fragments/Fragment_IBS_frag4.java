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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.banyan.omni.Cur_Activity;
import com.banyan.omni.R;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.io.IOException;


public class Fragment_IBS_frag4 extends Fragment {
    int fragVal;
    ImageView next, prev;
    ImageView center_bg, omni_bg;
    TextView strngth_bg;

    public static Fragment_IBS_frag4 init(int val) {
        Fragment_IBS_frag4 frag_4 = new Fragment_IBS_frag4();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        frag_4.setArguments(args);
        return frag_4;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragVal = getArguments() != null ? getArguments().getInt("val") : 4;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View layoutView = inflater.inflate(R.layout.fragment_lay_4, container,
                false);


        next = (ImageView) layoutView.findViewById(R.id.next);
        prev = (ImageView) layoutView.findViewById(R.id.prev);

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_IBS_limi fragment_Limitations = new Fragment_IBS_limi();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.con, fragment_Limitations);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
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


        omni_bg = (ImageView) layoutView.findViewById(R.id.omni_bg);
        center_bg = (ImageView) layoutView.findViewById(R.id.center_bg);
        strngth_bg = (TextView) layoutView.findViewById(R.id.strength_bg);

        YoYo.with(Techniques.ZoomIn)
                .duration(1000)
                .playOn(layoutView.findViewById(R.id.omni_bg));
        YoYo.with(Techniques.ZoomIn)
                .duration(1000)
                .playOn(layoutView.findViewById(R.id.center_bg));
        YoYo.with(Techniques.Shake)
                .duration(1000)
                .playOn(layoutView.findViewById(R.id.strength_bg));


        return layoutView;
    }

}