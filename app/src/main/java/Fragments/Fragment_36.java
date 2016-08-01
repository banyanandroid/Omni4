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
import android.widget.TextView;

import com.banyan.omni.R;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.io.IOException;

public class Fragment_36 extends Fragment {
    int fragVal;

    TextView tv, head1, head2, text_no;
    ImageView iv, one, two;
    MediaPlayer player;
    AssetFileDescriptor afd;

    public static Fragment_36 init(int val) {
        Fragment_36 truitonFrag = new Fragment_36();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        truitonFrag.setArguments(args);
        return truitonFrag;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragVal = getArguments() != null ? getArguments().getInt("val") : 1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lay_20, container,
                false);
        tv = (TextView) view.findViewById(R.id.responce_frag1);
        tv.setText("Responsible for Chronic (episodic) Pancreatitis");
        tv.setTextSize(28);
        head1 = (TextView) view.findViewById(R.id.head1_frag1);
        head2 = (TextView) view.findViewById(R.id.head2_frag);
        text_no = (TextView) view.findViewById(R.id.text_no);
        text_no.setText("36");
        ImageView next = (ImageView) view.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //player.pause();

                Fragment_37 fragment_37 = new Fragment_37();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conm, fragment_37);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        YoYo.with(Techniques.SlideInDown)
                .duration(300)
                .playOn(view.findViewById(R.id.responce_frag1));

        YoYo.with(Techniques.FadeInUp)
                .duration(300)
                .playOn(view.findViewById(R.id.head1_frag1));
        YoYo.with(Techniques.Flash)
                .duration(300)
                .playOn(view.findViewById(R.id.head2_frag));

        //one = (ImageView) view.findViewById(R.id.one_frag1);
        two = (ImageView) view.findViewById(R.id.two_frag1);
       /* YoYo.with(Techniques.RollIn)
                .duration(2000)
                .playOn(view.findViewById(R.id.one_frag1));*/
        YoYo.with(Techniques.RotateIn)
                .duration(2000)
                .playOn(view.findViewById(R.id.two_frag1));

        return view;
    }



}