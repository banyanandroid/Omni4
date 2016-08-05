package Fragments;

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

import com.banyan.omni.R;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;


public class Fragment_555 extends Fragment {
    int fragVal;

    ImageView center_bg, omni_bg, arrow_1, arrow_2, arrow_3, arrow_4, next, prev,ultra_img;
    TextView strngth_bg;
    FrameLayout con;

    public static Fragment_555 init(int val) {
        Fragment_555 frag_555 = new Fragment_555();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        frag_555.setArguments(args);
        return frag_555;
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


        ultra_img = (ImageView) layoutView.findViewById(R.id.ultra_img);
        ultra_img.setVisibility(View.VISIBLE);
        arrow_1 = (ImageView) layoutView.findViewById(R.id.arrow_1);
        arrow_2 = (ImageView) layoutView.findViewById(R.id.arrow_2);
        arrow_3 = (ImageView) layoutView.findViewById(R.id.arrow_3);
        arrow_4 = (ImageView) layoutView.findViewById(R.id.arrow_4);
        //arrow_5 = (ImageView) layoutView.findViewById(R.id.arrow_5);
        next = (ImageView) layoutView.findViewById(R.id.next);
        prev = (ImageView) layoutView.findViewById(R.id.prev);

        next.setVisibility(View.INVISIBLE);
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
        arrow_2.setOnClickListener(new View.OnClickListener() {
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
        arrow_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment_8 fragment_8 = new Fragment_8();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conm, fragment_8);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
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
        /*arrow_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment_10 fragment_10 = new Fragment_10();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conm, fragment_10);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });*/
       /* next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment_6 fragment_6 = new Fragment_6();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conm, fragment_6);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });*/
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment_44 fragment_44 = new Fragment_44();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conm, fragment_44);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        omni_bg = (ImageView) layoutView.findViewById(R.id.omni_bg);
        center_bg = (ImageView) layoutView.findViewById(R.id.center_bg);
        strngth_bg = (TextView) layoutView.findViewById(R.id.strength_bg);

        YoYo.with(Techniques.ZoomIn)
                .duration(600)
                .playOn(layoutView.findViewById(R.id.omni_bg));
        YoYo.with(Techniques.ZoomIn)
                .duration(600)
                .playOn(layoutView.findViewById(R.id.center_bg));
        YoYo.with(Techniques.ZoomIn)
                .duration(600)
                .playOn(layoutView.findViewById(R.id.strength_bg));



        /*next.postDelayed(new Runnable() {
            public void run() {
                next.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.BounceInDown)
                        .duration(500)
                        .playOn(layoutView.findViewById(R.id.next));
            }
        }, 2500);*/
        prev.postDelayed(new Runnable() {
            public void run() {
                prev.setVisibility(View.VISIBLE);
            }
        }, 500);


        return layoutView;
    }


}