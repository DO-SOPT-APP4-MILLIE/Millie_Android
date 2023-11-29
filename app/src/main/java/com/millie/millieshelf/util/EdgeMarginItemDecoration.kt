package com.millie.millieshelf.util

import android.content.res.Resources
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class EdgeMarginItemDecoration(private val edgeMargin: Int, private val itemMargin: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        super.getItemOffsets(outRect, view, parent, state)

        val position = parent.getChildAdapterPosition(view)
        val itemCount = state.itemCount

        if (position == 0) {
            // 첫 번째 아이템에 왼쪽 마진 적용
            outRect.left = edgeMargin
        } else if (position == itemCount - 1) {
            // 마지막 아이템에 오른쪽 마진 적용
            outRect.right = edgeMargin
        }

        // 모든 아이템에 아이템 간 마진 적용
        outRect.right = itemMargin
    }
}

val Int.dpToPx: Int
    get() = (this * Resources.getSystem().displayMetrics.density).toInt()
