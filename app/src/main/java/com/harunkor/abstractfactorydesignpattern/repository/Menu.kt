package com.harunkor.abstractfactorydesignpattern.repository

import com.harunkor.abstractfactorydesignpattern.model.Food

interface Menu {
    fun food(): Food
}