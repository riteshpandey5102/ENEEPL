package com.example.eneepl.adapter

import android.content.Context
import android.text.Spannable
import android.text.SpannableString
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.eneepl.R
import com.example.eneepl.model.userinfo


class home_activity_frag_adapter(private val context: Context,private val users:ArrayList<userinfo>) :
    RecyclerView.Adapter<home_activity_frag_adapter.viewHolder>() {


    class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var tv_title1: TextView = itemView.findViewById(R.id.tv_title1)
        var userdp: ImageView = itemView.findViewById(R.id.img_icon)
        var tv_subtitle: TextView = itemView.findViewById(R.id.tv_subtitle)
        var tv_post_details: TextView = itemView.findViewById(R.id.tv_post_details)
        var tv_user_name: TextView = itemView.findViewById(R.id.tv_user_name)

        var cl_save_post: ConstraintLayout = itemView.findViewById(R.id.cl_save_post)
        var cl_save: ConstraintLayout = itemView.findViewById(R.id.cl_save)
        var img_post_image: ImageView = itemView.findViewById(R.id.img_post_image)
        var img_user_dp: ImageView = itemView.findViewById(R.id.img_user_dp)
        var img_save: ImageView = itemView.findViewById(R.id.img_save)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.home_adapter, parent, false)
        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {


        if (position == 0) {
            holder.tv_title1.setText(users[position].username)
            holder.tv_user_name.setText(users[position].username)
            holder.tv_subtitle.setText(users[position].usercity)
            holder.userdp.setImageDrawable(context.getDrawable(users[position].userdp))
            holder.tv_post_details.setText(users[position].userpost)
            holder.img_post_image.setImageDrawable(context.getDrawable(users[position].post_img))
            holder.img_user_dp.setImageDrawable(context.getDrawable(users[position].post_img))
//            holder.img_save.setImageDrawable(context.getDrawable(users[position].userdp))

            holder.cl_save.visibility = VISIBLE
            holder.cl_save_post.visibility = GONE
            holder.img_post_image.visibility = GONE
        } else {
            holder.tv_title1.setText(users[position].username)
            holder.tv_subtitle.setText(users[position].usercity)
            holder.userdp.setImageDrawable(context.getDrawable(users[position].userdp))
            holder.tv_post_details.setText(users[position].userpost)
            holder.img_post_image.setImageDrawable(context.getDrawable(users[position].post_img))
            holder.img_user_dp.setImageDrawable(context.getDrawable(users[position].post_img))
//            holder.img_save.setImageDrawable(context.getDrawable(users[position].userdp))

            holder.cl_save.visibility = GONE
            holder.cl_save_post.visibility = VISIBLE
            holder.img_post_image.visibility = VISIBLE

        }
    }

    override fun getItemCount(): Int {
        return users.size
    }
}