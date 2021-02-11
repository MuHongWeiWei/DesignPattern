package main.abstractFactoryPattern.bag

import main.abstractFactoryPattern.Bag
import main.abstractFactoryPattern.Fruit

class AppleBag: Bag {
    override fun pack(fruit: Fruit) {
        println("裝蘋果")
    }
}