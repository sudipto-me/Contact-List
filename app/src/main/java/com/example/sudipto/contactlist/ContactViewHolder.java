package com.example.sudipto.contactlist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by sudipto on 4/1/2017.
 */

public class ContactViewHolder extends RecyclerView.ViewHolder {

    public TextView username;
    public TextView number;


    public ContactViewHolder(View itemView) {
        super(itemView);
        username = (TextView) itemView.findViewById(R.id.textView3);
        number = (TextView) itemView.findViewById(R.id.textView4);


    }

    void setUsername(String S){
        username.setText(S);
    }
    void setNumber(String S){
        number.setText(S);
    }

}