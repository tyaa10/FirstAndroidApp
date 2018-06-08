package org.tyaa.firstandroidapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button firstButton =
                findViewById(R.id.firstButton);
        final TextView firstTextView =
                findViewById(R.id.firstLabel);
        firstButton.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                firstTextView.setText("Test text");
            }
        });
    }
}
