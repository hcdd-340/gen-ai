package edu.psu.ist.hcdd340.gptexamples;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Happy View Click Listener
        ShapeableImageView happyView = findViewById(R.id.happyView);
        happyView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSnackbar("Happy!");
            }
        });

        // Sad View Click Listener
        ShapeableImageView sadView = findViewById(R.id.sadView);
        sadView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSnackbar("Oh no!");
            }
        });

        // Angry View Click Listener
        ShapeableImageView angryView = findViewById(R.id.angryView);
        angryView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSnackbar("🤬");
            }
        });
    }

    private void showSnackbar(String message) {
        Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), message, Snackbar.LENGTH_SHORT);
        View snackbarView = snackbar.getView();
        TextView textView = snackbarView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setMaxLines(5); // Set max lines to avoid ellipsis (...) for emojis
        snackbar.show();
    }
}
