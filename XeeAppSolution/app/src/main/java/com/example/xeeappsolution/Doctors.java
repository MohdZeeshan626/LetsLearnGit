package com.example.xeeappsolution;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Doctors extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    List<ModelClass> userList;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_doctors );

        initData();
        initRecyclerView();



    }

    private void initData() {
        userList=new ArrayList<>();
        userList.add( new ModelClass( R.drawable.logo,"Dr Harvinder singh","MBBS","8373225699" ) );
        userList.add( new ModelClass( R.drawable.logo,"Dr Mukesh kumar","MBBS","9045347726" ) );
        userList.add( new ModelClass( R.drawable.logo,"Dr Vinita singh","MBBS","9897365748" ) );
        userList.add( new ModelClass( R.drawable.logo,"Dr Ashu sharma","MBBS","9359932567" ) );
        userList.add( new ModelClass( R.drawable.logo,"Dr Uday pratap","MBBS","9540683245 " ) );
        userList.add( new ModelClass( R.drawable.logo,"Dr Manish jain","MBBS","8954000105 " ) );
        userList.add( new ModelClass( R.drawable.logo,"Dr Afeefa khan","MBBS","9410445199 " ) );
        userList.add( new ModelClass( R.drawable.logo,"Dr Harvinder singh","MBBS","8373225699" ) );
        userList.add( new ModelClass( R.drawable.logo,"Dr Mukesh kumar","MBBS","9045347726" ) );
        userList.add( new ModelClass( R.drawable.logo,"Dr Vinita singh","MBBS","9897365748" ) );
        userList.add( new ModelClass( R.drawable.logo,"Dr Ashu sharma","MBBS","9359932567" ) );
        userList.add( new ModelClass( R.drawable.logo,"Dr Uday pratap","MBBS","9540683245 " ) );
        userList.add( new ModelClass( R.drawable.logo,"Dr Manish jain","MBBS","8954000105 " ) );
        userList.add( new ModelClass( R.drawable.logo,"Dr Afeefa khan","MBBS","9410445199 " ) );
        userList.add( new ModelClass( R.drawable.logo,"Dr Harvinder singh","MBBS","8373225699" ) );
        userList.add( new ModelClass( R.drawable.logo,"Dr Mukesh kumar","MBBS","9045347726" ) );
        userList.add( new ModelClass( R.drawable.logo,"Dr Vinita singh","MBBS","9897365748" ) );
        userList.add( new ModelClass( R.drawable.logo,"Dr Ashu sharma","MBBS","9359932567" ) );
        userList.add( new ModelClass( R.drawable.logo,"Dr Uday pratap","MBBS","9540683245 " ) );
        userList.add( new ModelClass( R.drawable.logo,"Dr Manish jain","MBBS","8954000105 " ) );
        userList.add( new ModelClass( R.drawable.logo,"Dr Afeefa khan","MBBS","9410445199 " ) );


    }

    private void initRecyclerView() {

        recyclerView=findViewById( R.id.recycler );
        linearLayoutManager=new LinearLayoutManager( this );
        linearLayoutManager.setOrientation( RecyclerView.VERTICAL );
        recyclerView.setLayoutManager( linearLayoutManager );
        adapter=new Adapter( userList );
        recyclerView.setAdapter( adapter );
        adapter.notifyDataSetChanged();
    }
}