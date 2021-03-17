package com.joffrey.testapp1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import org.w3c.dom.Text;

import static java.security.AccessController.getContext;

public class WowActivity extends AppCompatActivity {

    private Intent intent;
    private VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        intent = getIntent();
        setContentView(R.layout.activity_wow);
        video = (VideoView) findViewById(R.id.vw_afficher);
        video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.videotest));
        video.start();
    }

}