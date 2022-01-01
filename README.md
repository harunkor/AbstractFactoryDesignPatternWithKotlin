# AbstractFactoryDesignPatternWithKotlin
Abstract Factory Design Pattern With Kotlin
Abstract Factory patterns work around a super-factory which creates other factories. This factory is also called as factory of factories. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.


Abstract Factory Pattern: Advantages and Disadvantages
The abstract factory pattern has a number of advantages that can be summarized in the following points:
Compatibility between products created by the same factory class is guaranteed.
Clean code because the open-closed principle is guaranteed since new product families can be introduced without breaking the existing code.
Cleaner code because the single responsibility principle (SRP) is respected since the responsibility of creating the concrete product is transferred to the concrete creator class instead of the client class having this responsibility.
However, the main drawback of the abstract factory pattern, like most design patterns, is that there is an increase in complexity in the code and an increase in the number of classes required for the code. However, this disadvantage is well known when applying design patterns for it is the price to pay for gaining abstraction in the code.

<img src="https://github.com/harunkor/AbstractFactoryDesignPatternWithKotlin/blob/master/app/device-2022-01-01-234127.gif?raw=true" alt="SS" width="300" height="550">


The project is designed according to the design in the link below.

https://www.sketchappsources.com/free-source/3976-pizza-ordering-app-sketch-freebie-resources.html


