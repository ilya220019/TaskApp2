package com.example.taskapp2.ui.profile


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.taskapp2.databinding.FragmentProfileBinding



class profileFragment : Fragment() {
    lateinit var binding: FragmentProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(LayoutInflater.from(context), container, false)
        initListener()
        return binding.root
    }

    private fun initListener() {
        binding.ivProfile.setOnClickListener {
            mGetContent.launch("image/*");

        }
    }
}
