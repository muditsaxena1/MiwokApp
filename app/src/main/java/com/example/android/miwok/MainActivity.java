package com.example.android.miwok;

import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        //Opens NumbersActivity when Numbers is clicked in Main Activity
        TextView numberTextView=(TextView)findViewById(R.id.numbers);
        numberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent= new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(numberIntent);
            }
        });

        //Opens FamilyActivity when Family is clicked in Main Activity
        TextView familyTextView=(TextView)findViewById(R.id.family);
        familyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent= new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        //Opens ColorsActivity when Colors is clicked in Main Activity
        TextView colorsTextView=(TextView)findViewById(R.id.colors);
        colorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent= new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        //Opens PhrasesActivity when Phrases is clicked in Main Activity
        TextView phrasesTextView=(TextView)findViewById(R.id.phrases);
        phrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent= new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

    }

}
