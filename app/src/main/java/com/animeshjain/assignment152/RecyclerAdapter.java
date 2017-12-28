package com.animeshjain.assignment152;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Jain on 28-12-2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private String[] versionName= {"alpha","beta","cupcake","donut","eclair","froyo","ginger bread","Honeycomb","IceCream Sandwich",
            "JellyBean","Kitkat","LollyPop","Marshmallow","Nougat","Oreo"};

    class ViewHolder extends RecyclerView.ViewHolder{

        public TextView title;

        public ViewHolder(View itemView) {
            super(itemView);

            title = (TextView)itemView.findViewById(R.id.versionTxtView);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.title.setText(versionName[i]);

    }

    @Override
    public int getItemCount() {
        return versionName.length;
    }
}
