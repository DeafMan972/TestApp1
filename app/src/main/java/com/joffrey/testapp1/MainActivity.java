package com.joffrey.testapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txt1;
    private Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = (TextView) findViewById(R.id.lbl1);
        btn1 = (Button) findViewById(R.id.btnValider);
    }

    public void validerBouton(View view) {
        Intent intent = new Intent(this,WowActivity.class);
        startActivity(intent);
        finish();

    }
}
