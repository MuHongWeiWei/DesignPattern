package main.abstractFactoryPattern

abstract class AbstractFactory {
    abstract fun getFruit(): Fruit
    abstract fun getBag(): Bag
}