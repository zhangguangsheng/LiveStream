package com.team.finn.view.live.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseViewHolder;
import com.facebook.drawee.view.SimpleDraweeView;
import com.team.finn.R;
import com.team.finn.model.logic.live.bean.LiveOtherList;
import com.team.finn.ui.refreshview.recyclerview.BaseRecyclerAdapter;
import com.team.finn.utils.CalculationUtils;

import java.util.ArrayList;
import java.util.List;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public class LiveOtherColumnListAdapter extends BaseRecyclerAdapter<RecyclerView.ViewHolder> {

    private List<LiveOtherList> mLiveList;
    private Context context;

    public LiveOtherColumnListAdapter(Context context) {
        this.context = context;
        this.mLiveList = new ArrayList<LiveOtherList>();
    }

    public void getLiveOtherColumnList(List<LiveOtherList> mLiveList) {
        this.mLiveList.clear();
        this.mLiveList.addAll(mLiveList);
        notifyDataSetChanged();
    }

    public void getLiveOtherColumnLoadMore(List<LiveOtherList> mLiveList) {
        this.mLiveList.addAll(mLiveList);
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder getViewHolder(View view) {
        return new LiveOtherColumnListHolder(view);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType, boolean isItem) {
        return new LiveOtherColumnListHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_recommend_view, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position, boolean isItem) {
        if (holder instanceof LiveOtherColumnListHolder) {
            bindLiveAll((LiveOtherColumnListHolder) holder, position);
        }
    }

    private void bindLiveAll(LiveOtherColumnListHolder holder, int position) {
        holder.img_item_gridview.setImageURI(Uri.parse(mLiveList.get(position).getVertical_src()));
        holder.tv_column_item_nickname.setText(mLiveList.get(position).getRoom_name());
        holder.tv_nickname.setText(mLiveList.get(position).getNickname());
        holder.tv_online_num.setText(CalculationUtils.getOnLine(mLiveList.get(position).getOnline()));
    }

    @Override
    public int getAdapterItemCount() {
        return this.mLiveList.size();
    }
    public class LiveOtherColumnListHolder extends BaseViewHolder {
        //        图片
        public SimpleDraweeView img_item_gridview;
        //        房间名称
        public TextView tv_column_item_nickname;
        //        在线人数
        public TextView tv_online_num;
        //        昵称
        public TextView tv_nickname;

        public LiveOtherColumnListHolder(View view) {
            super(view);
            img_item_gridview = (SimpleDraweeView) view.findViewById(R.id.img_item_gridview);
            tv_column_item_nickname = (TextView) view.findViewById(R.id.tv_column_item_nickname);
            tv_online_num = (TextView) view.findViewById(R.id.tv_online_num);
            tv_nickname = (TextView) view.findViewById(R.id.tv_nickname);
        }
    }
}
