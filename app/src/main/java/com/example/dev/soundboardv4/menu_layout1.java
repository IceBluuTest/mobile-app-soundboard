package com.example.dev.soundboardv4;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class menu_layout1 extends ArrayAdapter<String> {

    private final int [] CharImgs;

    public menu_layout1(Context context, String [] MainTitle, int [] Imgs){
        super(context,R.layout.activity_menu_layout1, MainTitle);
        this.CharImgs = Imgs; }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater menuInflater = LayoutInflater.from(getContext());
        View MainMenuView = menuInflater.inflate(R.layout.activity_menu_layout1, parent, false);

        String IceCharText = getItem(position);


        TextView txtTitleList = (TextView) MainMenuView.findViewById(R.id.txtTitle);
        ImageView imgTitleList = (ImageView) MainMenuView.findViewById(R.id.imgTitle);


        txtTitleList.setText(IceCharText);
        imgTitleList.setImageResource(CharImgs[position]);




        return MainMenuView;

    }


}
