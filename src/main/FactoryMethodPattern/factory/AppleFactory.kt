package main.FactoryMethodPattern.factory

import main.FactoryMethodPattern.Fruit
import main.FactoryMethodPattern.FruitFactory
import main.FactoryMethodPattern.fruit.Apple

class AppleFactory : FruitFactory {
    override fun getFruit(): Fruit {
        return Apple()
    }
}