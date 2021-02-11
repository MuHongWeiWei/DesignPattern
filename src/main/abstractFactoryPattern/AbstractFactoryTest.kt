package main.abstractFactoryPattern

import main.abstractFactoryPattern.factory.AppleFactory
import main.abstractFactoryPattern.factory.BananaFactory
import main.abstractFactoryPattern.factory.OrangeFactory

fun main() {
    AbstractFactoryTest().flyGetBanana()
    AbstractFactoryTest().flyGetApple()
    AbstractFactoryTest().flyGetOrange()
}

class AbstractFactoryTest {

    private lateinit var fruitFactory: AbstractFactory

    fun flyGetBanana() {
        fruitFactory = BananaFactory()
        val banana = fruitFactory.getFruit()
        banana.eat()
        fruitFactory.getBag().pack(banana)
    }

    fun flyGetApple() {
        fruitFactory = AppleFactory()
        val apple = fruitFactory.getFruit()
        apple.eat()
        fruitFactory.getBag().pack(apple)
    }

    fun flyGetOrange() {
        fruitFactory = OrangeFactory()
        val orange = fruitFactory.getFruit()
        orange.eat()
        fruitFactory.getBag().pack(orange)
    }
}