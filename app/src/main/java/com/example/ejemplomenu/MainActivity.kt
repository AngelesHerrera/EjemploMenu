package com.example.ejemplomenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate: MenuInflater= menuInflater
        inflate.inflate(R.menu.menu_principal,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId){
        R.id.menus_configuracion ->{
            Log.e("MENU","Se presiono Configuracion")
            true
        }
        R.id.menus_acercade->{
            Log.e("MENU","Se presiono Acerca De")
            true
        }
        else->{
            Log.e("MENU","Se presiono Usuarios")
            true
        }
    }

}
