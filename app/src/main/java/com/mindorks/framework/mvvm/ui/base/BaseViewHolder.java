package com.mindorks.framework.mvvm.ui.base;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;

/**
 * Created by amitshekhar on 11/07/17.
 */

public abstract class BaseViewHolder extends RecyclerView.ViewHolder {

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void onBind(int position);
}
