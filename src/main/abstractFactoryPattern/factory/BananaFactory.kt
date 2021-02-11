package main.abstractFactoryPattern.factory

import main.abstractFactoryPattern.AbstractFactory
import main.abstractFactoryPattern.Bag
import main.abstractFactoryPattern.Fruit
import main.abstractFactoryPattern.bag.BananaBag
import main.abstractFactoryPattern.fruit.Banana

class BananaFactory : AbstractFactory() {
    override fun getFruit(): Fruit {
        return Banana()
    }

    override fun getBag(): Bag {
        return BananaBag()
    }
}