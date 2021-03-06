package com.avidaldo.navigationdrawer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.avidaldo.navigationdrawer.databinding.FragmentDest1Binding

class Dest1Fragment : Fragment() {
    private var _binding: FragmentDest1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDest1Binding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = Navigation.findNavController(view)

        binding.btnToDest12.setOnClickListener {
            navController.navigate(Dest1FragmentDirections.actionNavDest1ToNavDest12())
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}