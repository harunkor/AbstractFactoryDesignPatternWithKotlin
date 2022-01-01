package com.harunkor.abstractfactorydesignpattern.model

import com.harunkor.abstractfactorydesignpattern.utils.FoodType

data class Food(
    var foodId:Int,
    var foodName:String,
    var foodType: FoodType,
    var foodPrice:Float
)
