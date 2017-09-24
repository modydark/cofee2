package com.example.mohamed.cofee;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int totalquantity=0;
    int m;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void txtshow (){
        TextView quantity =(TextView)findViewById(R.id.quantity);
        quantity.setText(""+""+totalquantity);

    }
    public void plus(View view){

        totalquantity=totalquantity+1;
        txtshow();

    }

    public void mins(View view){
        totalquantity=totalquantity-1;
        txtshow();
    }

    public void txtshow2(View view){

        TextView ordersummary =(TextView)findViewById(R.id.ordersummary);
        CheckBox whippedcream =(CheckBox)findViewById(R.id.whippedcream);
        CheckBox chocolate =(CheckBox)findViewById(R.id.chocolate);
        if (chocolate.isChecked() & whippedcream.isChecked()){
            m=totalquantity*7;
            ordersummary.setText("" + "$" + m);

        }
        else if (chocolate.isChecked()){
            m=totalquantity*6;
            ordersummary.setText("" + "$" + m);
        }
        else if (whippedcream.isChecked()){
            m=totalquantity*6;
            ordersummary.setText("" + "$" + m);
        }
        else {
            m = totalquantity * 5;
            ordersummary.setText("" + "$" + m);
        }


    }
}
