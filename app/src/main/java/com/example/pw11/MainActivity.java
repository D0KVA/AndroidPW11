package com.example.pw11;

    import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnFrameAnimation, btnTweenAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFrameAnimation = findViewById(R.id.btnFrameAnimation);
        btnTweenAnimation = findViewById(R.id.btnTweenAnimation);

        Animation buttonSlideIn = AnimationUtils.loadAnimation(this, R.anim.button_slide_in);

        btnFrameAnimation.startAnimation(buttonSlideIn);
        btnTweenAnimation.startAnimation(buttonSlideIn);

        btnFrameAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityGdeFrameAnimation.class);
                startActivity(intent);
            }
        });

        btnTweenAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityGdeTweenAnimation.class);
                startActivity(intent);
            }
        });
    }
}