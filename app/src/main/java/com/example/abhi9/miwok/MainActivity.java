package com.example.abhi9.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNumbersList(View view)
    {
        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);
    }

    public void openFamilyMembersList(View view)
    {
        Intent i = new Intent(this, FamilyActivity.class);
        startActivity(i);
    }

    public void openColorsList(View view)
    {
        Intent i = new Intent(this, ColorsActivity.class);
        startActivity(i);
    }

    public void openPhrasesList(View view)
    {
        Intent i = new Intent(this, PhrasesActivity.class);
        startActivity(i);
    }

}
