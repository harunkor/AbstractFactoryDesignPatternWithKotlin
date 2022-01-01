package com.harunkor.abstractfactorydesignpattern.usecase

import com.harunkor.abstractfactorydesignpattern.utils.FoodType
import com.harunkor.abstractfactorydesignpattern.model.Food
import com.harunkor.abstractfactorydesignpattern.repository.Menu
import com.harunkor.abstractfactorydesignpattern.repository.MenuFactory
import com.harunkor.abstractfactorydesignpattern.repository.PizzaMenu

class PizzaMenuFactory : MenuFactory {
    override fun makeMenu(food: Food): PizzaMenu {
        return when(food.foodType){
            FoodType.DEFAULT -> setMenuFood(food)
            FoodType.MENU ->  setDefaultFood(food)
        }
    }

    override fun changePrice(food: Food): Menu {
        return  setPriceFood(food)
    }

    private class setPriceFood(food: Food): PizzaMenu {
         var food =food
        override fun food(): Food {
            when(food.foodType){
                FoodType.MENU ->   food.foodPrice=food.foodPrice*3
                FoodType.DEFAULT-> food.foodPrice=food.foodPrice/3
            }
            return food
        }

    }

    private class setDefaultFood(food: Food): PizzaMenu {
        var food =food
        override fun food(): Food {
            food.foodType= FoodType.DEFAULT
            return food
        }


    }

    private class setMenuFood(food: Food): PizzaMenu {
        var food =food
        override fun food(): Food {
            food.foodType= FoodType.MENU
            return food
        }


    }
}