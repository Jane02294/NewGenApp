package com.example.android.newgenapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.system.Os.close
import android.system.Os.open
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.view.ActionMode
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import com.example.android.newgenapp.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var drawer_layout: DrawerLayout
    private lateinit var navigation_view: NavigationView
    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        drawer_layout = binding.drawerlayout
        navigation_view = binding.navView
        toggle = ActionBarDrawerToggle(this,drawer_layout,R.string.open,R.string.close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

     fun onSupportNavigateUp(item:MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_aboutme -> {
                supportFragmentManager.beginTransaction().replace(R.id.fragment_contain,AboutmeFragment()).commit()
            }
            R.id.nav_contact -> {
                supportFragmentManager.beginTransaction().replace(R.id.fragment_contain,ContactFragment()).commit()
            }
            R.id.nav_list -> {
                supportFragmentManager.beginTransaction().replace(R.id.fragment_contain,AddListFragment()).commit()
            }
        }
        return true
    }
}