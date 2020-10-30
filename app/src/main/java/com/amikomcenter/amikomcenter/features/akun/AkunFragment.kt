package com.amikomcenter.amikomcenter.features.akun

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.amikomcenter.amikomcenter.R

class AkunFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_akun, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val toolbar = view.findViewById<Toolbar>(R.id.my_appbar)

//        set action bar
        setActionBar(toolbar, "Akun")
    }

    private fun setActionBar(toolbar: Toolbar, title : String){
        (requireActivity() as AppCompatActivity).setSupportActionBar(toolbar)
        toolbar.title = title
    }

}