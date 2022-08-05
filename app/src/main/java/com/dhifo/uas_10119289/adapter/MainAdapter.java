package com.dhifo.uas_10119289.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.dhifo.uas_10119289.R;
import com.dhifo.uas_10119289.model.MainModel;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private List<MainModel> items;
    private MainAdapter.onSelectData onSelectData;

    public interface onSelectData {
        void onSelected(MainModel mdlMain);
    }

    public MainAdapter(List<MainModel> items, MainAdapter.onSelectData xSelectData) {
        this.items = items;
        this.onSelectData = xSelectData;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final MainModel data = items.get(position);
        holder.imgMainData.setImageResource(data.getImgSrc());
        holder.tvMainData.setText(data.getTxtName());
        holder.cvMainData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSelectData.onSelected(data);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    //Class Holder
    class ViewHolder extends RecyclerView.ViewHolder {

        public CardView cvMainData;
        public TextView tvMainData;
        public ImageView imgMainData;

        public ViewHolder(View itemView) {
            super(itemView);
            cvMainData = itemView.findViewById(R.id.cvMainData);
            tvMainData = itemView.findViewById(R.id.tvMainData);
            imgMainData = itemView.findViewById(R.id.imgMainData);
        }
    }
}
