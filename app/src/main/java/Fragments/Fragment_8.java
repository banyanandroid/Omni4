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


public class Fragment_8 extends Fragment {
    int fragVal;
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

    ImageView center_bg, omni_bg; //flow_arrow1_frag8, flow_arrow2_frag8, flow_arrow3_frag8;
    //ImageView flow_belowarw1_frag8,flow_belowarw2_frag8,flow_belowarw3_frag8;
    TextView strngth_bg, head_frag8;//flow_1_frag8,flow_2_frag8,flow_3_frag8,flow_4_frag8;
    //TextView flow_top1_frag8,flow_top2_frag8,flow_top3_frag8,curcumin_frag8;
    //LinearLayout lay_1,lay_2,lay_3;

    public static Fragment_8 init(int val) {
        Fragment_8 frag_8 = new Fragment_8();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        frag_8.setArguments(args);
        return frag_8;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragVal = getArguments() != null ? getArguments().getInt("val") : 1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View layoutView = inflater.inflate(R.layout.fragment_lay_8, container,
                false);


        omni_bg = (ImageView) layoutView.findViewById(R.id.omni_bg);
        center_bg = (ImageView) layoutView.findViewById(R.id.center_bg);

        /*flow_arrow1_frag8 = (ImageView)layoutView.findViewById(R.id.flow_arrow1_frag8);
        flow_arrow2_frag8 = (ImageView)layoutView.findViewById(R.id.flow_arrow2_frag8);
        flow_arrow3_frag8 = (ImageView)layoutView.findViewById(R.id.flow_arrow3_frag8);*/
        ImageView next = (ImageView) layoutView.findViewById(R.id.next);
        ImageView prev = (ImageView) layoutView.findViewById(R.id.prev);


        strngth_bg = (TextView) layoutView.findViewById(R.id.strength_bg);
        head_frag8 = (TextView) layoutView.findViewById(R.id.head_frag8);
        /*curcumin_frag8 = (TextView) layoutView.findViewById(R.id.curcumi_frag8);

        flow_1_frag8 = (TextView) layoutView.findViewById(R.id.flow_1_frag8);
        flow_2_frag8 = (TextView) layoutView.findViewById(R.id.flow_2_frag8);
        flow_3_frag8 = (TextView) layoutView.findViewById(R.id.flow_3_frag8);
        flow_4_frag8 = (TextView) layoutView.findViewById(R.id.flow_4_frag8);

        flow_top1_frag8 = (TextView) layoutView.findViewById(R.id.flow_top1_frag8);
        flow_top2_frag8 = (TextView) layoutView.findViewById(R.id.flow_top2_frag8);
        flow_top3_frag8 = (TextView) layoutView.findViewById(R.id.flow_top3_frag8);


        lay_1 = (LinearLayout) layoutView.findViewById(R.id.lay_1);
        lay_2 = (LinearLayout) layoutView.findViewById(R.id.lay_2);
        lay_3 = (LinearLayout) layoutView.findViewById(R.id.lay_3);
        //lay_bg = (LinearLayout) layoutView.findViewById(R.id.lay_bg);

        lay_1.setVisibility(View.GONE);
        lay_2.setVisibility(View.GONE);
        lay_3.setVisibility(View.GONE);
        //lay_bg.setVisibility(View.GONE);
        //head_frag8.setVisibility(View.GONE);
        curcumin_frag8.setVisibility(View.GONE);
        flow_arrow1_frag8.setVisibility(View.GONE);
        flow_arrow2_frag8.setVisibility(View.GONE);
        flow_arrow3_frag8.setVisibility(View.GONE);


        flow_1_frag8.setVisibility(View.GONE);
        flow_2_frag8.setVisibility(View.GONE);
        flow_3_frag8.setVisibility(View.GONE);
        flow_4_frag8.setVisibility(View.GONE);

        flow_top1_frag8.setVisibility(View.GONE);
        flow_top2_frag8.setVisibility(View.GONE);
        flow_top3_frag8.setVisibility(View.GONE);*/

        ImageView back = (ImageView) layoutView.findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_5 fragment_5 = new Fragment_5();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conq, fragment_5);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_9 fragment_9 = new Fragment_9();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conq, fragment_9);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_11 fragment_11 = new Fragment_11();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conq, fragment_11);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        YoYo.with(Techniques.ZoomIn)
                .duration(1000)
                .playOn(layoutView.findViewById(R.id.omni_bg));
        YoYo.with(Techniques.ZoomOut)
                .duration(200)
                .playOn(layoutView.findViewById(R.id.center_bg));
        YoYo.with(Techniques.ZoomIn)
                .duration(1000)
                .playOn(layoutView.findViewById(R.id.center_bg));
        YoYo.with(Techniques.RubberBand)
                .duration(100)
                .playOn(layoutView.findViewById(R.id.strength_bg));
  /*lay_1.postDelayed(new Runnable() {
      public void run() {
          lay_1.setVisibility(View.VISIBLE);
          YoYo.with(Techniques.Pulse)
                  .duration(300)
                  .playOn(layoutView.findViewById(R.id.lay_1));
      }
  }, 100);
        lay_2.postDelayed(new Runnable() {
            public void run() {
                lay_2.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.Pulse)
                        .duration(300)
                        .playOn(layoutView.findViewById(R.id.lay_2));
            }
        }, 200);

        lay_3.postDelayed(new Runnable() {
            public void run() {
                lay_3.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.Pulse)
                        .duration(300)
                        .playOn(layoutView.findViewById(R.id.lay_3));
            }
        }, 300);*/
        /*head_frag8.postDelayed(new Runnable() {
            public void run() {
                head_frag8.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.Flash)
                        .duration(3000)
                        .playOn(layoutView.findViewById(R.id.head_frag8));
            }
        }, 1000);*/
        /*lay_bg.postDelayed(new Runnable() {
            public void run() {
                lay_bg.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.RubberBand)
                        .duration(3000)
                        .playOn(layoutView.findViewById(R.id.head_frag8));
            }
        }, 1500);*/

        /*flow_1_frag8.postDelayed(new Runnable() {
            public void run() {
                flow_1_frag8.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.Pulse)
                        .duration(300)
                        .playOn(layoutView.findViewById(R.id.flow_1_frag8));
            }
        }, 700);
        flow_arrow1_frag8.postDelayed(new Runnable() {
            public void run() {
                flow_arrow1_frag8.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.Pulse)
                        .duration(300)
                        .playOn(layoutView.findViewById(R.id.flow_arrow1_frag8));
            }
        }, 700);


        flow_2_frag8.postDelayed(new Runnable() {
            public void run() {
                flow_2_frag8.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.Pulse)
                        .duration(300)
                        .playOn(layoutView.findViewById(R.id.flow_2_frag8));
            }
        }, 700);
        flow_arrow2_frag8.postDelayed(new Runnable() {
            public void run() {
                flow_arrow2_frag8.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.Pulse)
                        .duration(300)
                        .playOn(layoutView.findViewById(R.id.flow_arrow2_frag8));
            }
        }, 700);

        flow_3_frag8.postDelayed(new Runnable() {
            public void run() {
                flow_3_frag8.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.Pulse)
                        .duration(300)
                        .playOn(layoutView.findViewById(R.id.flow_3_frag8));
            }
        }, 700);
        flow_arrow3_frag8.postDelayed(new Runnable() {
            public void run() {
                flow_arrow3_frag8.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.Pulse)
                        .duration(300)
                        .playOn(layoutView.findViewById(R.id.flow_arrow3_frag8));
            }
        }, 700);

        flow_4_frag8.postDelayed(new Runnable() {
            public void run() {
                flow_4_frag8.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.Pulse)
                        .duration(300)
                        .playOn(layoutView.findViewById(R.id.flow_4_frag8));
            }
        }, 700);

        curcumin_frag8.postDelayed(new Runnable() {
            public void run() {
                curcumin_frag8.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.Pulse)
                        .duration(300)
                        .playOn(layoutView.findViewById(R.id.curcumi_frag8));
            }
        }, 700);
*/

        /*tab8.setOnTouchListener(new View.OnTouchListener() {
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
        });*/

        return layoutView;
    }


}