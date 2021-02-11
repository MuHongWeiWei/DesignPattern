package main.FactoryMethodPattern.factory

import main.FactoryMethodPattern.Fruit
import main.FactoryMethodPattern.FruitFactory
import main.FactoryMethodPattern.fruit.Banana

class BananaFactory : FruitFactory {
    override fun getFruit(): Fruit {
        return Banana()
    }
}