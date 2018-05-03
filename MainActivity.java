package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    float score = 0;
    RadioButton r1, r2, r3, r4, rb1, rb2, rb3, rb4;
    CheckBox cb1, cb2, cb3, cb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view) {
        Boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.r1:
                if (checked) {
                    Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
                    break;
                }
            case R.id.r2:
                if (checked) {
                    Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
                    break;
                }
            case R.id.r3:
                if (checked) {
                    Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
                    break;
                }
            case R.id.r4:
                if (score < 10.0) {
                    if (checked) {
                        score += 2.5;
                        Toast.makeText(this, "Correct Answer\nScore: " + score, Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
            case R.id.rb1:
                if (checked) {
                    Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
                    break;
                }
            case R.id.rb2:
                if (checked) {
                    Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
                    break;
                }
            case R.id.rb3:
                if (score < 10.0) {
                    if (checked) {
                        score += 2.5;
                        Toast.makeText(this, "Correct Answer\nScore: " + score, Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
            case R.id.rb4:
                if (checked) {
                    Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
                    break;
                }
        }
    }

    public void calculateScore(View view) {

        EditText ed = (EditText) findViewById(R.id.ed);
        String result = ed.getText().toString();
        if (score < 10.0) {
            if (result == "5") {
                score += 2.5;
                Toast.makeText(this, "Correct Answer\nScore: " + score, Toast.LENGTH_SHORT).show();

            }
        }
        else {
            Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
        }

        Toast.makeText(this, "Congratulations!\nYou have scored " + score + " / 10.0", Toast.LENGTH_SHORT).show();
    }


    public void onCheckBoxClicked(View view){
        Boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()){
            case R.id.cb1 :
                if (score < 10.0) {
                    if (checked) {
                        score += 1.25;
                        Toast.makeText(this, "Score: " + score, Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
            case R.id.cb2 :
                if (checked){
                    Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
                    break;
                }

            case R.id.cb3 :
                if (checked){
                    Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
                    break;
                }

            case R.id.cb4 :
                if (score < 10.0) {
                    if (checked) {
                        score += 1.25;
                        Toast.makeText(this, "Score: " + score, Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
        }
    }
}

