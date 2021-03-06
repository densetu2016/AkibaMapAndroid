package net.dentare.akibamapandroid.adapter;

import android.content.Context;

import net.dentare.akibamapandroid.resources.Spot;

import java.util.List;

public class RankingRecyclerViewAdapter extends BaseSpotListRecyclerViewAdapter{

    public RankingRecyclerViewAdapter(Context context, List<Spot> spotList) {
        super(context, spotList);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
        isVisibleRankText(holder,true);
        setRankText(holder,position);
    }
}