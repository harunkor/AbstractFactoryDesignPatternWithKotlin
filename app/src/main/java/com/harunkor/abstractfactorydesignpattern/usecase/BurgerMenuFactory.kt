package com.harunkor.abstractfactorydesignpattern.usecase

import com.harunkor.abstractfactorydesignpattern.utils.FoodType
import com.harunkor.abstractfactorydesignpattern.model.Food
import com.harunkor.abstractfactorydesignpattern.repository.BurgerMenu
import com.harunkor.abstractfactorydesignpattern.repository.Menu
import com.harunkor.abstractfactorydesignpattern.repository.MenuFactory

class BurgerMenuFactory : MenuFactory {
    override fun makeMenu(food: Food): BurgerMenu {
        return when(food.foodType){
            FoodType.DEFAULT -> setMenuFood(food)
            FoodType.MENU -> setDefaultFood(food)
        }
    }

    override fun changePrice(food: Food): Menu {
        return  setPriceFood(food)
    }

    private class setPriceFood(food: Food): BurgerMenu {
        var food = food
        override fun food(): Food {
            food.foodPrice=food.foodPrice*2
            return food
        }


    }

    private class setDefaultFood(food: Food):  BurgerMenu {
        var food = food
        override fun food(): Food {
            food.foodType= FoodType.DEFAULT
            return food
        }


    }

    private class setMenuFood(food: Food):  BurgerMenu {
        var food = food
        override fun food(): Food {
           food.foodType= FoodType.MENU
            return food
        }


    }



}