package main.factoryMethodPattern

import main.factoryMethodPattern.factory.AppleFactory
import main.factoryMethodPattern.factory.BananaFactory
import main.factoryMethodPattern.factory.OrangeFactory


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