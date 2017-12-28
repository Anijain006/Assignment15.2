package com.animeshjain.assignment152;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    String[] versionName= {"alpha","beta","cupcake","donut","eclair","froyo","ginger bread","Honeycomb","IceCream Sandwich",
    "JellyBean","Kitkat","LollyPop","Marshmallow","Nougat","Oreo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView.ViewHolder recyclerView;

//        CustomAdapter customAdapter= new CustomAdapter();
//        recyclerView.setAdapter(customAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items,menu );
        return super.onCreateOptionsMenu(menu);
    }

}

