package com.example.hangidiliogrenmeliyim

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dogruMu = false

        var button1 : Button = findViewById(R.id.button1)
        var button2 : Button = findViewById(R.id.button2)
        var button3 : Button = findViewById(R.id.button3)
        var button4 : Button = findViewById(R.id.button4)
        var button5 : Button = findViewById(R.id.button5)
        var button6 : Button = findViewById(R.id.button6)
        var button7 : Button = findViewById(R.id.button7)
        var button8 : Button = findViewById(R.id.button8)
        var button9 : Button = findViewById(R.id.button9)
        var sans : Button = findViewById(R.id.button11)
        var oneri : Button = findViewById(R.id.button10)
        var resim : ImageView = findViewById(R.id.imageView)
        var aciklama : TextView = findViewById(R.id.textView)

        fun changeImage (button : Button, imageName : Int, info : String) {
            button.setOnClickListener(){
                aciklama.textSize = 14F
                resim.setImageResource(imageName)
                aciklama.text = info
            }
        }

        changeImage(button1,R.drawable.js,"JavaScript, yaygın olarak web tarayıcılarında kullanılmakta olan dinamik bir programlama dilidir. JavaScript ile yazılan istemci tarafı betikler sayesinde tarayıcının kullanıcıyla etkileşimde bulunması, tarayıcının kontrol edilmesi, asenkron bir şekilde sunucu ile iletişime geçilmesi ve web sayfası içeriğinin değiştirilmesi gibi işlevler sağlanır. JavaScript, Node.js gibi platformlar sayesinde sunucu tarafında da yaygın olarak kullanılmaktadır.")
        changeImage(button2,R.drawable.java,"Java, Sun Microsystems mühendislerinden James Gosling tarafından geliştirilmeye başlanmış açık kaynak kodlu, nesneye yönelik, zeminden bağımsız, yüksek verimli, çok işlevli, yüksek seviye, adım adım işletilen (yorumlanan - interpreted) bir dildir.")
        changeImage(button3,R.drawable.python,"Python, nesne yönelimli, yorumlamalı, birimsel (modüler) ve etkileşimli yüksek seviyeli bir programlama dilidir. Python ile sistem programlama, kullanıcı arabirimi programlama, ağ programlama, web programlama, uygulama ve veri tabanı yazılımı programlama gibi birçok alanda yazılım geliştirebilirsiniz. ")
        changeImage(button4,R.drawable.csharp,"C#; Microsoft tarafından .NET Teknolojisi için geliştirilen modern bir programlama dilidir. Sözdizimi C-like (C benzeri) bir deneyim sunar.")
        changeImage(button5,R.drawable.kotlin,"Kotlin, Java sanal makinesi (JVM) üzerinde çalışan ve ayrıca JavaScript kaynak koduna derlenebilir, statik tipli bir programlama dilidir. İlk geliştirme Sankt-Peterburg, Rusya merkezli JetBrains programcıları tarafından yapılmıştır. İsmi Kotlin Adası'ndan gelmektedir. Java ile uyumlu sözdizimi olmasa da, Kotlin Java kodu ile birlikte çalışmak üzere tasarlanmıştır.")
        changeImage(button6,R.drawable.dart,"Dart, ilk kez Google tarafından geliştirilen ve daha sonraları ECMA tarafından standart (ECMA-408) haline getirilen açık kaynaklı ve genel-amaçlı bir programlama dilidir. Dart dili kullanılarak web, sunucu, mobil uygulamalar ve IoT cihazları geliştirilebilir.")
        changeImage(button7,R.drawable.swift,"Swift, Apple tarafından iOS ve macOS platformlarına iOS ve Mac uygulamaları geliştirmek için oluşturulan, derlenerek çalışan güçlü ve kullanımı kolay, nesne yönelimli bir programlama dili.")
        changeImage(button8,R.drawable.c,"AT&T Bell laboratuvarlarında, Ken Thompson ve Dennis Ritchie tarafından UNIX İşletim Sistemi' ni geliştirebilmek amacıyla B dilinden türetilmiş yapısal bir programlama dilidir. Geliştirilme tarihi 1972 olmasına rağmen yayılıp yaygınlaşması Brian Kernighan ve Dennis M. Ritchie tarafından yayımlanan \"C Programlama Dili\" kitabından sonra hızlanmıştır.")
        changeImage(button9,R.drawable.cplus,"Bell Laboratuvarlarından Bjarne Stroustrup tarafından 1979 yılından itibaren geliştirilmeye başlanmış, C'yi kapsayan ve çok paradigmalı, yaygın olarak kullanılan, genel amaçlı bir programlama dilidir. İlk olarak C With Classes (Sınıflarla C) olarak adlandırılmış, 1983 yılında ismi C++ olarak değiştirilmiştir.")

        sans.setOnClickListener(){
            aciklama.textSize = 30F
            var rastgeleSayi = (1..9).random()
            when (rastgeleSayi) {
                1 -> {resim.setImageResource(R.drawable.js); aciklama.text = "JavaScript"}
                2 -> {resim.setImageResource(R.drawable.java); aciklama.text = "Java"}
                3 -> {resim.setImageResource(R.drawable.python); aciklama.text = "Python"}
                4 -> {resim.setImageResource(R.drawable.csharp); aciklama.text = "C#"}
                5 -> {resim.setImageResource(R.drawable.kotlin); aciklama.text = "Kotlin"}
                6 -> {resim.setImageResource(R.drawable.dart); aciklama.text = "Dart"}
                7 -> {resim.setImageResource(R.drawable.swift); aciklama.text = "Swift"}
                8 -> {resim.setImageResource(R.drawable.c); aciklama.text = "C"}
                9 -> {resim.setImageResource(R.drawable.cplus); aciklama.text = "C++"}
            }
        }

        oneri.setOnClickListener(){
            aciklama.textSize = 30F
            resim.setImageResource(R.drawable.kotlin)
            aciklama.text = "Kotlin"
        }
    }
}