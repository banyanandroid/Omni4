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


public class Fragment_35 extends Fragment {
    int fragVal;


    ImageView center_bg, omni_bg, prev,next;
    TextView strngth_bg;
    MediaPlayer player;
    AssetFileDescriptor afd;

    public static Fragment_35 init(int val) {
        Fragment_35 frag_35 = new Fragment_35();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        frag_35.setArguments(args);
        return frag_35;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragVal = getArguments() != null ? getArguments().getInt("val") : 1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View layoutView = inflater.inflate(R.layout.fragment_lay_35, container,
                false);


        omni_bg = (ImageView) layoutView.findViewById(R.id.omni_bg);
        center_bg = (ImageView) layoutView.findViewById(R.id.center_bg);
        strngth_bg = (TextView) layoutView.findViewById(R.id.strength_bg);

        prev = (ImageView) layoutView.findViewById(R.id.prev);
        next = (ImageView) layoutView.findViewById(R.id.next);
        next.setVisibility(View.INVISIBLE);

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


                Fragment_34 fragment_34 = new Fragment_34();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frag35, fragment_34);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });


        return layoutView;
    }


}