package com.pockete_mita;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.pockete_mita.pockete_mitra.R;

public class Commanservices extends Activity implements View.OnClickListener {

     public ImageButton adhar;
     public ImageButton Bhama;
    public  ImageButton Toilet;
    public ImageButton NextTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commanservices);
        adhar=(ImageButton)findViewById(R.id.adhar);
        Bhama=(ImageButton)findViewById(R.id.bhama);
        Toilet = (ImageButton)findViewById(R.id.toiletId);
        NextTwo = (ImageButton)findViewById(R.id.nextTwo);

        adhar.setOnClickListener(this);
        Bhama.setOnClickListener(this);
        NextTwo.setOnClickListener(this);
        Toilet.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == adhar) {
            startActivity(new Intent(getApplicationContext(), Adhaar.class));
        }
        if( v == Bhama)
        {
            startActivity(new Intent(getApplicationContext(),Bhamapage.class));
        }
        if(v == NextTwo){
            startActivity(new Intent(getApplicationContext(),Farmerseva.class));
        }
        if(v == Toilet){
            startActivity(new Intent(getApplicationContext(),Toilet.class));
        }
    }


}
