package com.harunkor.abstractfactorydesignpattern

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.harunkor.abstractfactorydesignpattern.databinding.ActivityMainBinding
import com.harunkor.abstractfactorydesignpattern.model.Food
import com.harunkor.abstractfactorydesignpattern.repository.Menu
import com.harunkor.abstractfactorydesignpattern.repository.MenuFactory
import com.harunkor.abstractfactorydesignpattern.usecase.PizzaMenuFactory
import com.harunkor.abstractfactorydesignpattern.utils.FoodType

class MainActivity : AppCompatActivity(), View.OnClickListener,
    CompoundButton.OnCheckedChangeListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var pizzaFood:Food
    private lateinit var pizzaMenuFactory: PizzaMenuFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.orderbutton.setOnClickListener(this)
        binding.chipmenu.setOnCheckedChangeListener(this)
        binding.chipnormal.setOnCheckedChangeListener(this)

        pizzaMenuFactory= PizzaMenuFactory()
        //create model
        pizzaFood= Food(10,"Chicken Carbonara", FoodType.DEFAULT,25f)

        binding.pricetext.text=pizzaFood.foodPrice.toString()
    }

    fun setMakeMenu(factory: MenuFactory, food: Food) : Menu {
        return factory.makeMenu(food)
    }

    fun setPriceMenu(factory: MenuFactory, food: Food) : Menu {
        return  factory.changePrice(food)
    }

    fun setMenuOperation(){
        var menuPizza=setMakeMenu(pizzaMenuFactory,pizzaFood)
        val pricePizza=setPriceMenu(pizzaMenuFactory,menuPizza.food())
        Log.v("FOOD",pricePizza.food().toString())
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.orderbutton -> {
                binding.pricetext.text=pizzaFood.foodPrice.toString()
            }
        }
    }

    override fun onCheckedChanged(chipButton: CompoundButton?, chipChecked: Boolean) {
        when(chipButton?.id){
            binding.chipmenu.id -> {
                if(chipChecked) setMenuOperation()
                else binding.chipnormal.isChecked=true
            }
            binding.chipnormal.id -> {
                if(chipChecked) setMenuOperation()
                else binding.chipmenu.isChecked=true
            }
        }
    }

}