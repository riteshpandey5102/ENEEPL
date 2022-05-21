package com.example.eneepl

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.eneepl.adapter.home_activity_frag_adapter
import com.example.eneepl.databinding.FragmentHomeActivityFragBinding
import com.example.eneepl.model.userinfo


class home_activity_frag : Fragment() {
    private lateinit var binding : FragmentHomeActivityFragBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding= FragmentHomeActivityFragBinding.inflate(inflater,container,false)
        val users = addusers()

        var adapter = home_activity_frag_adapter(activity as homeactivity,users)
        binding.rvHome.layoutManager= LinearLayoutManager(activity as homeactivity,
            RecyclerView.VERTICAL,false)
        binding.rvHome.adapter=adapter

        return binding.root
    }

    private fun addusers(): ArrayList<userinfo> {
        var user1 = userinfo("Nandani","Delhi",R.drawable.userprofile_1,"Good friends, good books, and a sleepy conscience: this is the ideal life",R.drawable.post_img_1)
        var user2 = userinfo("Ankit","Delhi",R.drawable.userprofile_2,"Instead of worrying about what you cannot control, shift your energy to what you can create",R.drawable.post_img_2)
        var user3 = userinfo("Mohit","Jaipur",R.drawable.userprofile_3,"Be the reason someone smiles. Be the reason someone feels loved and believes in the goodness in people",R.drawable.post_img_3)
        var user4 = userinfo("Archana","Delhi",R.drawable.userprofile_4,"Believe in yourself. You are braver than you think, more talented than you know, and capable of more than you imagine",R.drawable.post_img_4)
        var user5 = userinfo("Khusboo","Delhi",R.drawable.userprofile_5,"Success is not how high you have climbed, but how you make a positive difference to the world",R.drawable.post_img_5)

        val users = arrayListOf<userinfo>(user1,user2,user3,user4,user5)
        return users
    }
}