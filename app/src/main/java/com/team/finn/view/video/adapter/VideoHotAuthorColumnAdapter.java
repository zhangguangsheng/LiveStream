package com.team.finn.view.video.adapter;


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
import com.team.finn.model.logic.video.bean.VideoHotAuthorColumn;
import com.team.finn.ui.refreshview.recyclerview.BaseRecyclerAdapter;
import com.team.finn.utils.CalculationUtils;

import java.util.ArrayList;
import java.util.List;

import static com.team.finn.R.id.img_item_gridview;
import static com.team.finn.R.id.tv_facescore_city;
import static com.team.finn.R.id.tv_nickname;

/**
 * 版本号：1.0
 * 备注消息：
 **/
public class VideoHotAuthorColumnAdapter extends BaseRecyclerAdapter<RecyclerView.ViewHolder> {
    private List<VideoHotAuthorColumn> mVideoHotAuthorColumn;
    private Context context;

    public VideoHotAuthorColumnAdapter(Context context) {
        this.context = context;
        this.mVideoHotAuthorColumn = new ArrayList<VideoHotAuthorColumn>();
    }

    public void getFaceScoreColumn(List<VideoHotAuthorColumn> mVideoHotAuthorColumn) {
          this.mVideoHotAuthorColumn.clear();
        this.mVideoHotAuthorColumn.addAll(mVideoHotAuthorColumn);
        notifyDataSetChanged();
    }
    public void getFaceScoreColumnLoadMore(List<VideoHotAuthorColumn> mVideoHotAuthorColumn) {
//          this.mHomeFaceScoreColumn.clear();
        this.mVideoHotAuthorColumn.addAll(mVideoHotAuthorColumn);
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder getViewHolder(View view) {
        return new FaceScoreColumnHolder(view);
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType, boolean isItem) {
        return new FaceScoreColumnHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_video_recommend_author, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position, boolean isItem) {
        if (holder instanceof FaceScoreColumnHolder) {
            bindFaceScoreHolder((FaceScoreColumnHolder) holder, position);

        }
    }
    private void bindFaceScoreHolder(FaceScoreColumnHolder holder, int position) {
        holder.img_item_photo.setImageURI(Uri.parse(mVideoHotAuthorColumn.get(position).getAuthor_avatar()));
        holder.tv_nickname.setText(mVideoHotAuthorColumn.get(position).getNickname());
        holder.tv_sub_num.setText(mVideoHotAuthorColumn.get(position).getFollow_num());
        holder.tv_video_num.setText(CalculationUtils.getOnLine(mVideoHotAuthorColumn.get(position).getSubmit_num()));
    }

    @Override
    public int getAdapterItemCount() {
        return mVideoHotAuthorColumn.size();
    }

    public class FaceScoreColumnHolder extends BaseViewHolder {
        public SimpleDraweeView img_item_photo;
        public TextView tv_nickname;
        public TextView tv_video_num;
        public TextView tv_sub_num;

        public FaceScoreColumnHolder(View view) {
            super(view);
            img_item_photo = (SimpleDraweeView) view.findViewById(R.id.img_item_photo);
            tv_nickname = (TextView) view.findViewById(R.id.tv_nickname);
            tv_video_num = (TextView) view.findViewById(R.id.tv_video_num);
            tv_sub_num = (TextView) view.findViewById(R.id.tv_sub_num);
        }
    }
}
