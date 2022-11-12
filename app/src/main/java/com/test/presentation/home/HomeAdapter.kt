package com.test.presentation.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.test.R
import com.test.data.local.database.movie.MovieEntity
import com.test.databinding.ItemMovieBinding

class HomeAdapter(
    private var movies: List<MovieEntity>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    fun swapData(dataList: List<MovieEntity>) {
        if (movies !== dataList) {
            movies = dataList
            notifyDataSetChanged()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = DataBindingUtil.inflate<ItemMovieBinding>(
                LayoutInflater.from(parent.context),
                R.layout.item_movie, parent, false
        )

        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(rawHolder: RecyclerView.ViewHolder, position: Int) {
        val holder = rawHolder as ItemViewHolder
        holder.onBind(movies[position])
    }

    override fun getItemCount() = movies.size
}

class ItemViewHolder(private val mBinding: ItemMovieBinding) : RecyclerView.ViewHolder(mBinding.root) {

    fun onBind(movie: MovieEntity) {
        mBinding.movie = movie

        mBinding.card.setOnClickListener {

        }
    }
}