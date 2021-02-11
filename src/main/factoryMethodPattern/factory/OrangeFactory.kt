package main.factoryMethodPattern.factory

import main.factoryMethodPattern.Fruit
import main.factoryMethodPattern.FruitFactory
import main.factoryMethodPattern.fruit.Orange

class OrangeFactory : FruitFactory {
    override fun getFruit(): Fruit {
        return Orange()
    }
}