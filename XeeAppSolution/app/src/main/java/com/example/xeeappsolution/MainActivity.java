package com.example.xeeappsolution;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {
    CardView LogOutCardView,OrderCardView,buyMedicineCardView,labTestCardView,HealthArticleCardView,doctorCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        LogOutCardView=findViewById( R.id.LogOutCardView);
        OrderCardView=findViewById( R.id.OrderCardView);
        buyMedicineCardView=findViewById( R.id.buyMedicineCardView);
        labTestCardView=findViewById( R.id.labTestCardView);
        HealthArticleCardView=findViewById( R.id.HealthArticleCardView);
        doctorCardView=findViewById( R.id.doctorCardView);



        OrderCardView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,OnlineOrder.class);
                startActivity( intent );
          }
        } );
        buyMedicineCardView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Medicine.class);
                startActivity( intent );
            }
        } );
        labTestCardView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,TestLab.class);
                startActivity( intent );

            }
        } );
        doctorCardView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Doctors.class);
                startActivity( intent );
            }
        } );
        HealthArticleCardView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Articles.class);
                startActivity( intent );
            }
        } );
        LogOutCardView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,LoginActivity.class);
                startActivity( intent );
                finish();
            }
        } );


    }

}