package com.example.taskapp2.ui.home.newTask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController
import com.example.taskapp2.databinding.FragmentNewTaskBinding

class NewTaskFragment : Fragment() {
    private lateinit var binding: FragmentNewTaskBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {
        binding = FragmentNewTaskBinding.inflate(LayoutInflater.from(context), container, false)
        initListener()
        initView()

        return binding.root
    }


    private fun initListener() {
        binding.btnSave.setOnClickListener {
            findNavController().navigateUp()
            setFragmentResult(
                "new_task",
                bundleOf("title" to binding.etTytle.text.toString(), "desc" to binding.etDesc.text.toString())
            )
        }
    }

    private fun initView() {

    }
}