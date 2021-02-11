package main.abstractFactoryPattern.fruit

import main.abstractFactoryPattern.Fruit

class Orange : Fruit {
    override fun eat() {
        print("吃橘子\t")
    }
}