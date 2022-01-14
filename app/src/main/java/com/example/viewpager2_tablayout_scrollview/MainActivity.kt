package com.example.viewpager2_tablayout_scrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
    スクロールする画面を作りたいときはレイアウト新規作成時にRoot elementをScrollViewにする
    ScrollViewのは以下にLinerLayoutなどの要素を配置する
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}