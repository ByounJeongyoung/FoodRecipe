package com.jeongyoung.foodrecipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.jeongyoung.foodrecipe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        navController = findNavController(R.id.navHostFragment)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.fragment_recipes,
                R.id.fragment_favorite_recipes,
                R.id.fragment_food_joke
            )
        )
        //Controll navHost by bottomNav
        binding.bottomNavigationView.setupWithNavController(navController)
        //This Func will controll "navController" with "appBarConfiguration"
        setupActionBarWithNavController(navController,appBarConfiguration)
    }

    override fun onSupportNavigateUp(): Boolean {
           return super.onSupportNavigateUp() || navController.navigateUp()
    }
}