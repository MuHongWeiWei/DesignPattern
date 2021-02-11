package main.FactoryMethodPattern.factory

import main.FactoryMethodPattern.Fruit
import main.FactoryMethodPattern.FruitFactory
import main.FactoryMethodPattern.fruit.Orange

class OrangeFactory : FruitFactory {
    override fun getFruit(): Fruit {
        return Orange()
    }
}