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
import android.widget.Button;
import android.widget.ImageView;

import com.banyan.omni.R;

import java.io.IOException;


public class Fragment_333 extends Fragment {
    int fragVal;
    ImageView back, next;
    MediaPlayer player;
    AssetFileDescriptor afd;

    public static Fragment_333 init(int val) {
        Fragment_333 frag_333 = new Fragment_333();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        frag_333.setArguments(args);
        return frag_333;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragVal = getArguments() != null ? getArguments().getInt("val") : 3;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layoutView = inflater.inflate(R.layout.fragment_3, container,
                false);
        back = (ImageView) layoutView.findViewById(R.id.back);
        next = (ImageView) layoutView.findViewById(R.id.next);
        ImageView prev = (ImageView) layoutView.findViewById(R.id.prev);
        prev.setVisibility(View.INVISIBLE);
        next.setVisibility(View.VISIBLE);
        back.setVisibility(View.INVISIBLE);



        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment_44 fragment_44 = new Fragment_44();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.con, fragment_44);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        return layoutView;
    }


}