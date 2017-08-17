package com.pockete_mita;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.pockete_mita.pockete_mitra.R;

public class Farmerseva extends AppCompatActivity implements View.OnClickListener{
    public ImageButton NextThree;
    public ImageButton atal;
    public ImageButton fasal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmerseva);
        NextThree = (ImageButton)findViewById(R.id.nextThree);
        atal=(ImageButton)findViewById(R.id.atal);
        fasal=(ImageButton)findViewById(R.id.fasal);
        assert NextThree != null;
        NextThree.setOnClickListener(this);
        atal.setOnClickListener(this);
        fasal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if( v == NextThree){
            startActivity(new Intent(getApplicationContext(),Camplaint.class));
        }
        if(v == atal) {
            startActivity(new Intent(getApplicationContext(), AtalPansion.class));
        }
        if( v == fasal)
        {
            startActivity(new Intent(getApplicationContext(),Fasalbima.class));
        }
    }
}
