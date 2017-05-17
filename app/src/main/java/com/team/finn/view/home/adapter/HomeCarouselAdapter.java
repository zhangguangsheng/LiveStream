package com.team.finn.view.home.adapter;

import android.net.Uri;
import android.view.ViewTreeObserver;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.team.finn.utils.FrescoUtils;
import com.team.finn.utils.L;

import cn.bingoogolapple.bgabanner.BGABanner;

/**
 * 版本号：
 */
public class HomeCarouselAdapter implements BGABanner.Adapter<SimpleDraweeView, String> {
    @Override
    public void fillBannerItem(BGABanner banner, SimpleDraweeView itemView, String model, int position) {
        itemView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                                                                     @Override
                                                                     public void onGlobalLayout() {
                                                                         if (itemView.getWidth() != 0 && itemView.getHeight() != 0) {
                                                                             FrescoUtils.showThumb(itemView,model, itemView.getWidth(),itemView.getHeight());
                                                                         }
                                                                     }
                                                                 });
    }
}
