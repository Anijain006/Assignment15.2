package com.animeshjain.assignment152;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Jain on 28-12-2017.
 */

//Class to Implement RecyclerView Adapter
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

//    String Array containing the versions name
    private String[] versionName= {"alpha","beta","cupcake","donut","eclair","froyo","ginger bread","Honeycomb","IceCream Sandwich",
            "JellyBean","Kitkat","LollyPop","Marshmallow","Nougat","Oreo"};

    class ViewHolder extends RecyclerView.ViewHolder{

        public TextView versionNameTxtView;

        public ViewHolder(View itemView) {
            super(itemView);

            versionNameTxtView = (TextView)itemView.findViewById(R.id.versionTxtView);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

//        Inflating the CardView:: So that Items can be added in the Cards
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

//    Bindind Card View With RecyclerView using Adapter
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.versionNameTxtView.setText(versionName[i]);

    }

    @Override
    public int getItemCount() {
        return versionName.length;
    }
}
