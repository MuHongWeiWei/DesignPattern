package main.FactoryMethodPattern

import main.FactoryMethodPattern.factory.AppleFactory
import main.FactoryMethodPattern.factory.BananaFactory
import main.FactoryMethodPattern.factory.OrangeFactory


fun main() {
    FactoryTest().flyGetApple()
    FactoryTest().flyGetBanana()
    FactoryTest().flyGetOrange()
}

class FactoryTest {

    private lateinit var fruitFactory: FruitFactory

    fun flyGetBanana() {
        fruitFactory = BananaFactory()
        fruitFactory.getFruit().eat()
    }

    fun flyGetApple() {
        fruitFactory = AppleFactory()
        fruitFactory.getFruit().eat()
    }

    fun flyGetOrange() {
        fruitFactory = OrangeFactory()
        fruitFactory.getFruit().eat()
    }
}