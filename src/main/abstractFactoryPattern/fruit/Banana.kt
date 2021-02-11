package main.abstractFactoryPattern.fruit

import main.abstractFactoryPattern.Fruit

class Banana : Fruit {
    override fun eat() {
        print("吃香蕉\t")
    }
}