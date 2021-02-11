package main.abstractFactoryPattern.bag

import main.abstractFactoryPattern.Bag
import main.abstractFactoryPattern.Fruit

class BananaBag: Bag {
    override fun pack(fruit: Fruit) {
        println("裝香蕉")
    }
}