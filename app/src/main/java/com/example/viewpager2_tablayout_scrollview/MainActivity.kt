package com.example.viewpager2_tablayout_scrollview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 画像とタイトルを保持したモデルのリスト
        val data = listOf(
            ListItem(
                title = "散歩中のぞう",
                photo = ContextCompat.getDrawable(this, R.drawable.elephant),
                icon = ContextCompat.getDrawable(this, R.drawable.tab_icon1), // リソースファイルをセット
                shortTitle = "ゾウ" // 追加
            ),
            ListItem(
                title = "我が家のペット",
                photo = ContextCompat.getDrawable(this, R.drawable.pet),
                icon = ContextCompat.getDrawable(this, R.drawable.tab_icon2),
                shortTitle = "ハムスター"
            ),

            ListItem(
                title = "手を振ってくれるアザラシ",
                photo = ContextCompat.getDrawable(this, R.drawable.seal),
                icon = ContextCompat.getDrawable(this, R.drawable.tab_icon3),
                shortTitle = "アザラシ"
            ),
        )

        // ViewPager2にデータを割り当てる（バインドする）
        val pager = findViewById<ViewPager2>(R.id.pager)
        pager.adapter = MyListAdapter(data)

        // TabLayoutとViewPagerの紐付け
        val tabs = findViewById<TabLayout>(R.id.tabs)

        // タブとViewPager2を紐づけるにはTabLayoutMediatorクラスとattach()を使う
        // TabLayoutとViewPager2が引数
        // 選択中のタブとインデックスが渡される
        TabLayoutMediator(tabs, pager) { tab, position ->
            // tabの値を更新する
            tab.apply {
                text = data[position].shortTitle
                contentDescription = "Page ${position + 1}"
                icon = data[position].icon
            }
        }.attach()
    }
}