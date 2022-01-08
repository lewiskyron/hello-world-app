package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView =  ((TextView) findViewById(R.id.label));
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.label)).setTextColor(getResources().getColor(R.color.white));
            }
        });

        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.purple_200));
            }

        });

        findViewById(R.id.clickToChangeText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.label)).setText("Mobile dev is awesome!");
            }
        });

        //user can tap on background to return the app to its default settings.
        // 1.Change text back to "Hello from Lewis" - id/label
        // 2. Change background to original color (
        // 3. Change text color back to original color - original color -black id/label
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Hello from Kyron");
                textView.setTextColor(getResources().getColor(R.color.black));
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.haze_blue));
            }
        });
        findViewById(R.id.custom_text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredtext = ((EditText) findViewById(R.id.editText)).getText().toString();
                if (enteredtext.isEmpty()) {
                    textView.setText("Enter your own text!");
                } else {
                    textView.setText(enteredtext);
                }
            }
        });
    }
}

