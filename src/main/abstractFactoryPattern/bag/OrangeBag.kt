package main.abstractFactoryPattern.bag

import main.abstractFactoryPattern.Bag
import main.abstractFactoryPattern.Fruit

class OrangeBag: Bag {
    override fun pack(fruit: Fruit) {
        println("裝橘子")
    }
}