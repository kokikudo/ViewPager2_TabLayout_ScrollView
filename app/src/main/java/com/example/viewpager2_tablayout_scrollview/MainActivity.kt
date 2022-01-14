package com.example.viewpager2_tablayout_scrollview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2

/*
    ページを捲るように、スワップでViewを移動させたいときはViewPager2を使う

    RecycleViewと同じで、メインレイアウトを配置、サブレイアウト作成、データモデル作成、
    ホルダー作成、アダプター作成をする

    捲る方向を決めるようなマネージャー設定はない
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 画像とタイトルを保持したモデルのリスト
        val data = listOf(
            ListItem(
                title = "散歩中のぞう",
                photo = ContextCompat.getDrawable(this, R.drawable.elephant)
            ),
            ListItem(
                title = "我が家のペット",
                photo = ContextCompat.getDrawable(this, R.drawable.pet)
            ),

            ListItem(
                title = "手を振ってくれるアザラシ",
                photo = ContextCompat.getDrawable(this, R.drawable.seal)
            ),
        )

        // ViewPager2にデータを割り当てる（バインドする）
        val pager = findViewById<ViewPager2>(R.id.pager)
        pager.adapter = MyListAdapter(data)
    }
}