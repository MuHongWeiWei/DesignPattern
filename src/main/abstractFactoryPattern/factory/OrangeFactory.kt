package main.abstractFactoryPattern.factory

import main.abstractFactoryPattern.AbstractFactory
import main.abstractFactoryPattern.Bag
import main.abstractFactoryPattern.Fruit
import main.abstractFactoryPattern.bag.OrangeBag
import main.abstractFactoryPattern.fruit.Orange

class OrangeFactory : AbstractFactory() {
    override fun getFruit(): Fruit {
        return Orange()
    }

    override fun getBag(): Bag {
        return OrangeBag()
    }
}