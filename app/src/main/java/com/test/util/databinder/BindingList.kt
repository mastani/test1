package com.test.util.databinder

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.test.data.local.database.movie.MovieEntity
import com.test.presentation.home.HomeAdapter

class BindingList {

    companion object {

        @JvmStatic
        @BindingAdapter("setup_adapter")
        fun setItems(recyclerView: RecyclerView, items: List<MovieEntity>?) {
            val adapter = recyclerView.adapter as HomeAdapter?

            if (adapter != null && items != null) {
                adapter.swapData(items)
            }
        }
    }
}
