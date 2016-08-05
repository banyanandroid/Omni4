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


public class Fragment_4040 extends Fragment {
    int fragVal;

    ImageView center_bg, omni_bg, arrow_1, arrow_2, arrow_3, next, prev;
    TextView strngth_bg, textView15;
    MediaPlayer player;
    AssetFileDescriptor afd;

    public static Fragment_4040 init(int val) {
        Fragment_4040 frag_4040 = new Fragment_4040();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        frag_4040.setArguments(args);
        return frag_4040;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragVal = getArguments() != null ? getArguments().getInt("val") : 1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View layoutView = inflater.inflate(R.layout.fragment_lay_40, container,
                false);

        arrow_1 = (ImageView) layoutView.findViewById(R.id.frag40_img1);
        arrow_2 = (ImageView) layoutView.findViewById(R.id.frag40_img2);
        arrow_3 = (ImageView) layoutView.findViewById(R.id.frag40_img3);

        arrow_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //player.pause();
                Fragment_41 fragment_41 = new Fragment_41();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conk, fragment_41);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        arrow_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //player.pause();

                Fragment_4242 fragment_4242 = new Fragment_4242();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conk, fragment_4242);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        arrow_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //player.pause();

                Fragment_43 fragment_43 = new Fragment_43();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conk, fragment_43);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        omni_bg = (ImageView) layoutView.findViewById(R.id.omni_bg);
        center_bg = (ImageView) layoutView.findViewById(R.id.center_bg);
        strngth_bg = (TextView) layoutView.findViewById(R.id.strength_bg);
        textView15 = (TextView) layoutView.findViewById(R.id.textView15);
        next = (ImageView) layoutView.findViewById(R.id.next);
        prev = (ImageView) layoutView.findViewById(R.id.prev);
        prev.setVisibility(View.INVISIBLE);

        YoYo.with(Techniques.ZoomIn)
                .duration(500)
                .playOn(layoutView.findViewById(R.id.omni_bg));
        YoYo.with(Techniques.ZoomIn)
                .duration(500)
                .playOn(layoutView.findViewById(R.id.center_bg));
        YoYo.with(Techniques.ZoomIn)
                .duration(500)
                .playOn(layoutView.findViewById(R.id.strength_bg));


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment_4040_1 fragment_40 = new Fragment_4040_1();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conk, fragment_40);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });



        return layoutView;
    }


}