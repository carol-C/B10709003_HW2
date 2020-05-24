package com.example.b10709003_hw2;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/*public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    private Context mcontext;
    private Cursor mcursor;
    public ItemAdapter(Context context,Cursor cursor){
        mcontext=context;
        mcursor=cursor;
    }
    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        LayoutInflater inflater=LayoutInflater.from(mcontext);
        View view=inflater.inflate(R.layout.item,parent,false);
        return  new ItemViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder,int position){
        if(!mcursor.moveToPosition(position)){
            return;
        }
       String name=mcursor.getString(mcursor.getColumnIndex(itemContract.itemEntry.Item_Name));
        String num=mcursor.getString(mcursor.getColumnIndex(itemContract.itemEntry.Item_num));
        long id =mcursor.getLong(mcursor.getColumnIndex(itemContract.itemEntry._ID));

        holder.nameText.setText(name);
        holder.countText.setText(num);
        holder.itemView.setTag(id);
    }

    public int getItemCount(){return mcursor.getCount()}

    public class ItemViewHolder extends RecyclerView.ViewHolder{
        public TextView nameText;
        public TextView countText;

        public ItemViewHolder(@NonNull View itemView){
            super(itemView);
            nameText=itemView.findViewById(R.id.ET_NAME);
            countText=itemView.findViewById(R.id.ET_AMOUNT);
        }
    }
   public void swapCursor(Cursor newCursor){
        if(mcursor!=null){
            mcursor.close();
        }
        mcursor=newCursor;
        if (newCursor!=null){
            notifyDataSetChanged();
        }*/