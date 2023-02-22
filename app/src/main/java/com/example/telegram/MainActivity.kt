package com.example.telegram

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.telegram.R.drawable.*
import com.example.telegram.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    var profile = arrayOf(
        pro1,
        pro2,
        pro3,
        pro4,
        pro5,
        pro6,
        pro7,
        pro8,
        pro9,
        pro10,
        pro11,
        pro12,
        pro13
    )
    var name = arrayOf(
        "viraj",
        "raj",
        "shubha",
        "arjun",
        "pathan",
        "jay",
        "lakshit",
        "ms dhoni",
        "bill guest",
        "sunder pichai",
        "mukesh",
        "ajay",
        "vasu"
    )
    var msg = arrayOf(
        "hi",
        "hello",
        "good day",
        "good morning",
        "good nigth",
        "hi how are you",
        "what are you doing",
        "i am something",
        "sk",
        "gm",
        "gn",
        "i will go",
        "hk"
    )
    var Time = arrayOf(
        "2:33 pm",
        "2:00 pm",
        "29/1/2023",
        "yestrday",
        "today",
        " 5 hours",
        "4 hours",
        "4 miniute",
        "2 miniute",
        "10 hourse",
        "3:00 pm",
        "6:09 pm",
        "5:00 pm",
        "1:00 pm"
    )


    var arrayList = ArrayList<Chatdata>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        for (i in 0..profile.size - 1) {
            var data = Chatdata(profile.get(i), name.get(i), msg.get(i), Time.get(i))
            arrayList.add(data)
        }
        binding.lists.layoutManager = LinearLayoutManager(applicationContext)
        binding.lists.adapter = chatadepter(arrayList)

    }


}