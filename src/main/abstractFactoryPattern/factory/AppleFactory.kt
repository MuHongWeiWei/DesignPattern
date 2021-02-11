package main.abstractFactoryPattern.factory

import main.abstractFactoryPattern.AbstractFactory
import main.abstractFactoryPattern.Bag
import main.abstractFactoryPattern.Fruit
import main.abstractFactoryPattern.bag.AppleBag
import main.abstractFactoryPattern.fruit.Apple

class AppleFactory : AbstractFactory() {
    override fun getFruit(): Fruit {
        return Apple()
    }

    override fun getBag(): Bag {
        return AppleBag()
    }
}