package main.factoryMethodPattern.factory

import main.factoryMethodPattern.Fruit
import main.factoryMethodPattern.FruitFactory
import main.factoryMethodPattern.fruit.Apple

class AppleFactory : FruitFactory {
    override fun getFruit(): Fruit {
        return Apple()
    }
}