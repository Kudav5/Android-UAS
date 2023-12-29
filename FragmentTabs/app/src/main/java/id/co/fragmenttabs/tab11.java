package id.co.fragmenttabs;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class tab11 extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horror);

        videoView = findViewById(R.id.nunview);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.thenun;
        Uri videoUri = Uri.parse(videoPath);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.setVideoURI(videoUri);
        videoView.start();
    }
}
