package com.jeongyoung.foodrecipe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jeongyoung.foodrecipe.databinding.FragmentRecipesBinding


class fragment_recipes : Fragment() {

    private lateinit var binding : FragmentRecipesBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentRecipesBinding.inflate(inflater, container,false)

        binding.recyclerView.showShimmer()


        return binding.root
    }
}