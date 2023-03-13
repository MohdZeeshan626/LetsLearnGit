package com.example.xeeappsolution;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
private List<ModelClass> userlist;

public Adapter(List<ModelClass>userlist){
    this.userlist=userlist;
}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from( parent.getContext() ).inflate( R.layout.item_design,parent,false );
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    int resource=userlist.get(position).getImageView();
    String name=userlist.get( position ).getTextView1();
        String subject=userlist.get( position ).getTextView2();
        String msg=userlist.get( position ).getTextView3();

        holder.setData(resource,name,subject,msg);

    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView textView1;
        private TextView textView2;
        private TextView textView3;

        public ViewHolder(@NonNull View itemView) {
            super( itemView );


            imageView=itemView.findViewById( R.id.image );
            textView1=itemView.findViewById( R.id.text1 );
            textView2=itemView.findViewById( R.id.text2 );
            textView3=itemView.findViewById( R.id.text3 );


        }

        public void setData(int resource, String name, String subject, String msg) {

            imageView.setImageResource( resource );
            textView1.setText( name );
            textView2.setText( subject );
            textView3.setText( msg );
        }
    }
}
