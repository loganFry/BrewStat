package com.brewstat.ui.my_coffees

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.brewstat.R

class MyCoffeesFragment : Fragment() {

    private lateinit var myCoffeesViewModel: MyCoffeesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        myCoffeesViewModel =
            ViewModelProviders.of(this).get(MyCoffeesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_my_coffees, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        myCoffeesViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}