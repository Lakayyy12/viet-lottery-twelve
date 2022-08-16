package com.application.vietlotterytwelve.fragments

import android.os.Bundle
import android.transition.Transition
import android.transition.TransitionInflater
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.view.animation.AnimationUtils.loadAnimation
import android.widget.Button
import com.application.vietlotterytwelve.Navigator
import com.application.vietlotterytwelve.R
import java.lang.System.load

class FragmentTips : Fragment(), View.OnClickListener {

    private var t2 : Button? = null
    private var t3 : Button? = null
    private var t4 : Button? = null
    private var t5 : Button? = null
    private var tipView : View? = null
    private lateinit var transition : Transition

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        tipView = inflater.inflate(R.layout.fragment_tips, container, false)
        initComponents()
        initListener()
        return tipView
    }
    private fun initComponents(){
        t2 = tipView?.findViewById(R.id.t2)
        t3 = tipView?.findViewById(R.id.t3)
        t4 = tipView?.findViewById(R.id.t4)
        t5 = tipView?.findViewById(R.id.t5)
    }
    private fun initListener(){
        t2?.setOnClickListener(this)
        t3?.setOnClickListener(this)
        t4?.setOnClickListener(this)
        t5?.setOnClickListener(this)
    }
    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.t2 -> Navigator.showContent(context, getString(R.string.tip1))
            R.id.t3 -> Navigator.showContent(context, getString(R.string.tip2))
            R.id.t4 -> Navigator.showContent(context, getString(R.string.tip3))
            R.id.t5 -> Navigator.showContent(context, getString(R.string.tip4))
        }
    }
}