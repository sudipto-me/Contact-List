package com.example.sudipto.contactlist;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sudipto on 3/31/2017.
 */

public class ContactsAdapter extends RecyclerView.Adapter<ContactViewHolder> {
    public ArrayList<ContactVO> contactVOList;
    public LayoutInflater inflater;


    public ContactsAdapter(List<ContactVO> contactVOList, LayoutInflater inflater ){
            this.contactVOList = (ArrayList<ContactVO>) contactVOList;
            this.inflater = inflater;
        }


    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ContactViewHolder(inflater.inflate(R.layout.contacts,parent,false));
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {

        holder.setUsername(contactVOList.get(position).ContactName);
        holder.setNumber(contactVOList.get(position).ContactNumber);

    }

    @Override
    public int getItemCount() {
        return contactVOList.size();
    }
    public void addData(ArrayList<ContactVO> contactVOList){
        this.contactVOList.addAll(contactVOList);
        notifyDataSetChanged();
    }
}



