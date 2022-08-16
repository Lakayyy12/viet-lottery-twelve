package com.application.vietlotterytwelve.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.application.vietlotterytwelve.Detail
import com.application.vietlotterytwelve.R
import com.application.vietlotterytwelve.adapter.MyAdapter

class FragmentWays : Fragment() {

    private var newRecyclerView: RecyclerView? = null
    private var newArrayList: ArrayList<Detail>? = arrayListOf()

    private lateinit var title: Array<String>

    private lateinit var meaning: Array<String>

    private var returnView: View? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        // Inflate the layout for this fragment
        returnView = inflater.inflate(R.layout.fragment_ways, container, false)


        title = arrayOf(
            getString(R.string.w1),
            getString(R.string.w2),
            getString(R.string.w3)
        )

        meaning = arrayOf(
            getString(R.string.w11),
            getString(R.string.w22),
            getString(R.string.w33)
        )

        newRecyclerView = returnView?.findViewById(R.id.recyclerItems)
        newRecyclerView?.layoutManager = LinearLayoutManager(context)

        getUserdata()

        return returnView
    }

    private fun getUserdata() {
        title.forEachIndexed { i, s ->
            val news = Detail(title[i], meaning[i])
            newArrayList?.add(news)
        }

        newRecyclerView?.adapter = MyAdapter(newsList = newArrayList)
    }
}