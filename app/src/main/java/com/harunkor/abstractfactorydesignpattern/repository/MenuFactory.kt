package com.harunkor.abstractfactorydesignpattern.repository

import com.harunkor.abstractfactorydesignpattern.model.Food
import com.harunkor.abstractfactorydesignpattern.repository.Menu

interface MenuFactory {
    fun makeMenu(food: Food): Menu
    fun changePrice(food: Food):Menu
}