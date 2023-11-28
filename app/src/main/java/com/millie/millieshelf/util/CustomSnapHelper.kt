package com.millie.millieshelf.util

import android.view.View
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView

class CustomSnapHelper : LinearSnapHelper() {

    override fun calculateDistanceToFinalSnap(layoutManager: RecyclerView.LayoutManager, targetView: View): IntArray? {
        // 왼쪽 정렬을 위해 거리를 계산
        val out = IntArray(2)
        if (layoutManager.canScrollHorizontally()) {
            out[0] = layoutManager.getDecoratedLeft(targetView) - layoutManager.paddingStart
        }
        return out
    }

    override fun findTargetSnapPosition(layoutManager: RecyclerView.LayoutManager?, velocityX: Int, velocityY: Int): Int {
        // 기본적인 타겟 포지션을 찾는 로직은 유지
        return super.findTargetSnapPosition(layoutManager, velocityX, velocityY)
    }
}
