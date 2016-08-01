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

import com.banyan.omni.Cur_Activity;
import com.banyan.omni.R;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.squareup.picasso.Picasso;

import java.io.IOException;


public class Fragment_7 extends Fragment {
    int fragVal;

    ImageView tab_frag7, center_bg, omni_bg;
    TextView head_frag7, tab_head_frag7, strngth_bg;
    //LinearLayout linear_frag7;

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


    public static Fragment_7 init(int val) {
        Fragment_7 frag_7 = new Fragment_7();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        frag_7.setArguments(args);
        return frag_7;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragVal = getArguments() != null ? getArguments().getInt("val") : 1;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View layoutView = inflater.inflate(R.layout.fragment_lay_7, container,
                false);

        tab_frag7 = (ImageView) layoutView.findViewById(R.id.tab_img_frag7);
        //linear_frag7 = (LinearLayout) layoutView.findViewById(R.id.linear_frag7);
        head_frag7 = (TextView) layoutView.findViewById(R.id.head_frag7);
        tab_head_frag7 = (TextView) layoutView.findViewById(R.id.inside_head_frag7);
        omni_bg = (ImageView) layoutView.findViewById(R.id.omni_bg);
        center_bg = (ImageView) layoutView.findViewById(R.id.center_bg);
        strngth_bg = (TextView) layoutView.findViewById(R.id.strength_bg);
        ImageView back = (ImageView) layoutView.findViewById(R.id.back);
        ImageView next = (ImageView) layoutView.findViewById(R.id.next);
        ImageView prev = (ImageView) layoutView.findViewById(R.id.prev);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_5 fragment_5 = new Fragment_5();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.cont, fragment_5);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        YoYo.with(Techniques.ZoomInLeft)
                .duration(800)
                .playOn(layoutView.findViewById(R.id.omni_bg));
        YoYo.with(Techniques.ZoomIn)
                .duration(800)
                .playOn(layoutView.findViewById(R.id.center_bg));
        YoYo.with(Techniques.ZoomInRight)
                .duration(800)
                .playOn(layoutView.findViewById(R.id.strength_bg));


        //linear_frag7.setVisibility(View.GONE);
        tab_frag7.setVisibility(View.GONE);
        //head_frag7.setVisibility(View.GONE);
        tab_head_frag7.setVisibility(View.GONE);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_9 fragment_9 = new Fragment_9();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.cont, fragment_9);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_10_3 fragment_10_3 = new Fragment_10_3();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.cont, fragment_10_3);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        /*head_frag7.postDelayed(new Runnable() {
            public void run() {
                head_frag7.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.BounceInDown)
                        .duration(2000)
                        .playOn(layoutView.findViewById(R.id.head_frag7));
            }
        }, 1000);
              linear_frag7.postDelayed(new Runnable() {
                    public void run() {
                        linear_frag7.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.RubberBand)
                        .duration(2000)
                        .playOn(layoutView.findViewById(R.id.linear_frag7));
            }
        }, 3000);*/

        tab_head_frag7.postDelayed(new Runnable() {
            public void run() {
                tab_head_frag7.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.ZoomInLeft)
                        .duration(500)
                        .playOn(layoutView.findViewById(R.id.inside_head_frag7));
            }
        }, 100);
        tab_frag7.postDelayed(new Runnable() {
            public void run() {
                tab_frag7.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.FadeInLeft)
                        .duration(1000)
                        .playOn(layoutView.findViewById(R.id.tab_img_frag7));
            }
        }, 200);

        tab_frag7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                ImageView view = (ImageView) v;
                System.out.println("matrix=" + savedMatrix.toString());
                switch (event.getAction() & MotionEvent.ACTION_MASK) {
                    case MotionEvent.ACTION_DOWN:
                        savedMatrix.set(matrix);
                        startPoint.set(event.getX(), event.getY());
                        mode = DRAG;
                        break;
                    case MotionEvent.ACTION_POINTER_DOWN:
                        oldDist = spacing(event);
                        if (oldDist > 10f) {
                            savedMatrix.set(matrix);
                            midPoint(midPoint, event);
                            mode = ZOOM;
                        }
                        break;
                    case MotionEvent.ACTION_UP:
                    case MotionEvent.ACTION_POINTER_UP:
                        mode = NONE;
                        break;
                    case MotionEvent.ACTION_MOVE:
                        if (mode == DRAG) {
                            matrix.set(savedMatrix);
                            matrix.postTranslate(event.getX() - startPoint.x, event.getY() - startPoint.y);
                        } else if (mode == ZOOM) {
                            float newDist = spacing(event);
                            if (newDist > 10f) {
                                matrix.set(savedMatrix);
                                float scale = newDist / oldDist;
                                matrix.postScale(scale, scale, midPoint.x, midPoint.y);
                            }
                        }
                        break;
                }
                view.setImageMatrix(matrix);
                return true;
            }


            private float spacing(MotionEvent event) {
                float x = event.getX(0) - event.getX(1);
                float y = event.getY(0) - event.getY(1);
                return (float) Math.sqrt(x * x + y * y);
            }

            private void midPoint(PointF point, MotionEvent event) {
                float x = event.getX(0) + event.getX(1);
                float y = event.getY(0) + event.getY(1);
                point.set(x / 2, y / 2);
            }
        });


        return layoutView;
    }



}