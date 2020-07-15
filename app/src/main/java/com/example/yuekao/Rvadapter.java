package com.example.yuekao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Rvadapter extends RecyclerView.Adapter<Rvadapter.ViewHolder> {
    private ArrayList<Bean.DataBean.DatasBean> list;
    private Context context;
    private OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public Rvadapter(ArrayList<Bean.DataBean.DatasBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.item, null);

        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tv_title.setText(list.get(position).getTitle());
        holder.tv_time.setText("阅读时间长："+list.get(position).getTime());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(onItemClickListener!=null){
                    onItemClickListener.OnItemClick(position);
                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_title;
        public TextView tv_time;
        public CheckBox ck;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tv_title = (TextView) itemView.findViewById(R.id.tv_title);
            this.tv_time = (TextView) itemView.findViewById(R.id.tv_time);
            this.ck = (CheckBox) itemView.findViewById(R.id.ck);
        }
    }
    public  interface OnItemClickListener{
        void OnItemClick(int position);
    }


}
