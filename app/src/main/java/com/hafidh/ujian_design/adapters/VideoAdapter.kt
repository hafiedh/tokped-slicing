package com.hafidh.ujian_design.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hafidh.ujian_design.data.VideoDiskon
import com.hafidh.ujian_design.databinding.VideoCardItemBinding

class VideoAdapter(private val listVideo: List<VideoDiskon>) :
    RecyclerView.Adapter<VideoAdapter.VideoViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): VideoAdapter.VideoViewHolder {
        val binding =
            VideoCardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VideoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: VideoAdapter.VideoViewHolder, position: Int) =
        holder.bind(listVideo[position])

    override fun getItemCount(): Int = listVideo.size

    inner class VideoViewHolder(private val binding: VideoCardItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: VideoDiskon) {
            with(binding) {
                videoThumbnail.setImageResource(data.image)
                videoWatchCount.text = data.watcher
                videoDiskon.text = data.discount
                videoTitle.text = data.titleVideo
                videoTitleStore.text = data.storeVideo
            }
        }
    }

}
