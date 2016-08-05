package Fragments;

import android.content.res.AssetFileDescriptor;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.banyan.omni.R;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.squareup.picasso.Picasso;

import java.io.IOException;


public class Fragment_26 extends Fragment {
    int fragVal;

    ImageView center_bg, omni_bg, ball, imageView4, imageView5;
    TextView strngth_bg, tab_nam, tab_nam2, textView2;
    LinearLayout linear_frag9;
    MediaPlayer player;
    AssetFileDescriptor afd;

    //Matrix
    Matrix matrix = new Matrix();
    Matrix savedMatrix = new Matrix();
    PointF startPoint = new PointF();
    PointF midPoint = new PointF();
    float oldDist = 1f;
    static final int NONE = 0;
    static final int DRAG = 1;
    static final int ZOOM = 2;
    int mode = NONE;


    public static Fragment_26 init(int val) {
        Fragment_26 frag_26 = new Fragment_26();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        frag_26.setArguments(args);
        return frag_26;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragVal = getArguments() != null ? getArguments().getInt("val") : 1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View layoutView = inflater.inflate(R.layout.fragment_lay_26, container,
                false);

        ImageView next = (ImageView) layoutView.findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //player.pause();

                Fragment_27 fragment_27 = new Fragment_27();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conl, fragment_27);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
       // ball = (ImageView) layoutView.findViewById(R.id.ball_13);

        /*tab_nam = (TextView) layoutView.findViewById(R.id.tab_nam);
        textView2 = (TextView) layoutView.findViewById(R.id.textView2);
        tab_nam2 = (TextView) layoutView.findViewById(R.id.tab_nam2);
*/
       /* tab_nam.setVisibility(View.GONE);
        tab_nam2.setVisibility(View.GONE);
        YoYo.with(Techniques.RotateIn)
                .duration(3000)
                .playOn(layoutView.findViewById(R.id.ball_13));


        tab_nam.postDelayed(new Runnable() {
            public void run() {
                tab_nam.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.SlideInLeft)
                        .duration(3000)
                        .playOn(layoutView.findViewById(R.id.tab_nam));
            }
        }, 3000);*/

        /*tab_nam2.postDelayed(new Runnable() {
            public void run() {
                tab_nam2.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.SlideInRight)
                        .duration(3000)
                        .playOn(layoutView.findViewById(R.id.tab_nam2));
            }
        }, 3000);*/
        /*imageView4.setVisibility(View.GONE);
        imageView4.postDelayed(new Runnable() {
            public void run() {
                imageView4.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.RotateInUpLeft)
                        .duration(2000)
                        .playOn(layoutView.findViewById(R.id.imageView4));
            }
        }, 1000);
        imageView4.setVisibility(View.GONE);*/
        /*imageView5.postDelayed(new Runnable() {
            public void run() {
                imageView4.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.RotateInUpRight)
                        .duration(2000)
                        .playOn(layoutView.findViewById(R.id.imageView5));
            }
        }, 1000);*/
        /*textView2.setVisibility(View.GONE);
        textView2.postDelayed(new Runnable() {
            public void run() {
                textView2.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.Flash)
                        .duration(4000)
                        .playOn(layoutView.findViewById(R.id.textView2));
            }
        }, 3000);*/

        return layoutView;
    }



}