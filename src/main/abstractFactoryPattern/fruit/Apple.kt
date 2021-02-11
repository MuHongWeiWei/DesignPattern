package main.abstractFactoryPattern.fruit

import main.abstractFactoryPattern.Fruit

class Apple: Fruit {
    override fun eat() {
        print("吃蘋果\t")
    }
}