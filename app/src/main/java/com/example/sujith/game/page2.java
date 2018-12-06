package com.example.sujith.game;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class page2 extends AppCompatActivity {
    TextView pXsp,pOsp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        pXsp=findViewById(R.id.pXs);
        pOsp=findViewById(R.id.pOs);
        SharedPreferences spm=PreferenceManager.getDefaultSharedPreferences(page2.this);
        String X2=spm.getString("px",null);
        String O2=spm.getString("po",null);

        String X1="PLAYER X: ";
        String O1="PLAYER O: ";

        String X=X1.concat(X2);
        String O=O1.concat(O2);

        pXsp.setText(X);
        pOsp.setText(O);
    }
}
