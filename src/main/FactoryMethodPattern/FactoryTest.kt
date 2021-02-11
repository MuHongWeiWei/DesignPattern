package main.FactoryMethodPattern

import main.FactoryMethodPattern.factory.BananaFactory


class FactoryTest {

    lateinit var fruitFactory: FruitFactory

    fun flyDo() {
        fruitFactory = BananaFactory()
        fruitFactory.getFruit().eat()
    }

}