package Fragments;

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


import com.banyan.omni.R;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.io.IOException;


public class Fragment_4040_1 extends Fragment {
    int fragVal;
    private ImageView logo, next, prev;
    private TextView head, textno;

    MediaPlayer player;
    AssetFileDescriptor afd;

    public static Fragment_4040_1 init(int val) {
        Fragment_4040_1 fragment_4040_1 = new Fragment_4040_1();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        fragment_4040_1.setArguments(args);
        return fragment_4040_1;
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
        layoutView = inflater.inflate(R.layout.fragment_lay_14, container,
                false);

        logo = (ImageView) layoutView.findViewById(R.id.one_frag2);
        head = (TextView) layoutView.findViewById(R.id.head_frag2);
        textno = (TextView) layoutView.findViewById(R.id.textno);
        textno.setText("40");
        head.setText("A novel option Control diabetes at multiple ways and at every stage");
        next = (ImageView) layoutView.findViewById(R.id.next);
        prev = (ImageView) layoutView.findViewById(R.id.prev);

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_4040 fragment_4040 = new Fragment_4040();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.con, fragment_4040);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_41 fragment_41 = new Fragment_41();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.con, fragment_41);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });


        YoYo.with(Techniques.ZoomIn)
                .duration(300)
                .playOn(layoutView.findViewById(R.id.head_frag2));

        YoYo.with(Techniques.ZoomIn)
                .duration(300)
                .playOn(layoutView.findViewById(R.id.one_frag2));
        YoYo.with(Techniques.ZoomIn)
                .duration(300)
                .playOn(layoutView.findViewById(R.id.one_frag2));


        return layoutView;
    }


}