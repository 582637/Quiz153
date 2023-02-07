package no.hvl.quiz153;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    Button buttonEasy;
    Button buttonHard;
    Button buttonStart;
    Button buttonDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        buttonEasy = (Button) findViewById(R.id.button_easy);
        buttonHard = (Button) findViewById(R.id.button_hard);
        buttonStart = (Button) findViewById(R.id.button_start);
        buttonDatabase = (Button) findViewById(R.id.button_db);



        buttonDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                act("db");
            }
        });

    }

    private void act(String type) {
        switch (type) {
            case "db":
                Intent intent = new Intent(this, DatabaseActivity.class);
                startActivity(intent);

        }


    }
}