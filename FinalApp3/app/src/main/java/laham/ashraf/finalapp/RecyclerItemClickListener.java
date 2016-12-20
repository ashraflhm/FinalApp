package laham.ashraf.finalapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Ashraf on 12/18/2016.
 */

interface ItemClickListener {
    void onClick(View view, int position);
}
