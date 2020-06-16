package com.kp.mvvmarch.latest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.kp.mvvmarch.R
import com.kp.mvvmarch.Result
import com.kp.mvvmarch.databinding.ItemMoviesBinding

class LatestMoviesAdapter(private var mList: ArrayList<Result>) :
    RecyclerView.Adapter<LatestMoviesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
      val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(ItemMoviesBinding.inflate(inflater))
    }
    fun setData(mData:List<Result> ?){
        val count = mList.size
        mData?.let { mList.addAll(it) }
        notifyItemRangeInserted(count,mData!!.size-1)

    }
    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(mList.get(position))
    }

    class ViewHolder(private var  itemMoviesBinding: ItemMoviesBinding) :
        RecyclerView.ViewHolder(itemMoviesBinding.root) {
        fun bind(mResult: Result){
            itemMoviesBinding.result = mResult
        }
    }
}