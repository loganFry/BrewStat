package com.brewstat.ui.brew

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.brewstat.R

class BrewFragment : Fragment() {

    private lateinit var brewViewModel: BrewViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        brewViewModel =
            ViewModelProviders.of(this).get(BrewViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_brew, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        brewViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}