package Fragments;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.banyan.omni.Cur_Activity;
import com.banyan.omni.R;

import java.io.IOException;

public class Fragment_Svideo1 extends Fragment {
    int fragVal;
    MediaPlayer player;
    AssetFileDescriptor afd;
    ImageView img, prev;

    public static Fragment_Svideo1 init(int val) {
        Fragment_Svideo1 truitonFrag = new Fragment_Svideo1();
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
        View view = inflater.inflate(R.layout.fragment_video, container,
                false);
        // MediaController mc= new MediaController(getActivity());

        final VideoView video = (VideoView) view.findViewById(R.id.videoView);
        img = (ImageView) view.findViewById(R.id.img);
        prev = (ImageView) view.findViewById(R.id.prev);
        ImageView next = (ImageView) view.findViewById(R.id.next);
        prev.setVisibility(View.INVISIBLE);
        /*String path = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.omni;
        video.setVideoURI(Uri.parse(path));
        video.setMediaController(mc);*/


        final ImageView play = (ImageView) view.findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setVisibility(View.GONE);
                play.setVisibility(View.GONE);
                MediaController mc = new MediaController(getActivity());
                String path = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.omni;
                video.setVideoURI(Uri.parse(path));
                video.setMediaController(mc);
                video.start();
                video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment_Svideo2 Fragment_Svideo2 = new Fragment_Svideo2();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.con, Fragment_Svideo2);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        return view;
    }



}