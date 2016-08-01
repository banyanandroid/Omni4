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
import android.widget.ImageView;
import android.widget.TextView;

import com.banyan.omni.R;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.io.IOException;

public class Fragment_1 extends Fragment {
    int fragVal;

    TextView tv, head1, head2;
    //ImageView iv,one,two;
    MediaPlayer player;
    AssetFileDescriptor afd;

    public static Fragment_1 init(int val) {
        Fragment_1 truitonFrag = new Fragment_1();
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
        View view = inflater.inflate(R.layout.fragment_lay_1, container,
                false);
        tv = (TextView) view.findViewById(R.id.responce_frag1);
        head1 = (TextView) view.findViewById(R.id.head1_frag1);
        head2 = (TextView) view.findViewById(R.id.head2_frag);
        ImageView next = (ImageView) view.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //player.pause();
                Fragment_2 fragment_2 = new Fragment_2();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.conm, fragment_2);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        YoYo.with(Techniques.ZoomIn)
                .duration(1000)
                .playOn(view.findViewById(R.id.responce_frag1));

        YoYo.with(Techniques.ZoomIn)
                .duration(2000)
                .playOn(view.findViewById(R.id.head1_frag1));
        YoYo.with(Techniques.ZoomIn)
                .duration(2000)
                .playOn(view.findViewById(R.id.head2_frag));

        /*one = (ImageView) view.findViewById(R.id.one_frag1);
        two = (ImageView) view.findViewById(R.id.two_frag1);
        YoYo.with(Techniques.RollIn)
                .duration(1000)
                .playOn(view.findViewById(R.id.one_frag1));
        YoYo.with(Techniques.RotateIn)
                .duration(1000)
                .playOn(view.findViewById(R.id.two_frag1));*/
        sng();

        return view;
    }

    void sng() {
        try {
// Read the music file from the asset folder
            afd = getActivity().getAssets().openFd("damino.mp3");
// Creation of new media player;
            player = new MediaPlayer();
// Set the player music source.
            try {
                player.setAudioStreamType(AudioManager.STREAM_MUSIC);
                player.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            } catch (IOException e) {
                e.printStackTrace();
            }
// Set the looping and play the music.
            player.setLooping(false);
            player.prepare();
            player.start();
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                public void onCompletion(MediaPlayer mp) {
                    mp.release();

                }

                ;
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}