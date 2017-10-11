package com.gohool.myrv.myrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class delete extends AppCompatActivity {

    private String a;
    private int b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        Intent obj= this.getIntent();
        a=obj.getStringExtra("go");
        b=Integer.parseInt(a);
        //Toast.makeText(delete.this, a, Toast.LENGTH_LONG).show();

        if(b==1){
            setContentView(R.layout.one);

        }
        else if(b==2){

            setContentView(R.layout.two);
        }
        else if(b==3){
            setContentView(R.layout.three);

        }
        else{
            setContentView(R.layout.four);

        }
    }
}
