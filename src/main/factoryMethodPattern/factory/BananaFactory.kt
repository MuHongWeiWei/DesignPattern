package main.factoryMethodPattern.factory

import main.factoryMethodPattern.Fruit
import main.factoryMethodPattern.FruitFactory
import main.factoryMethodPattern.fruit.Banana

class BananaFactory : FruitFactory {
    override fun getFruit(): Fruit {
        return Banana()
    }
}