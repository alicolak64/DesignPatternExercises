# Singleton Design Pattern

## Definition

Singleton Design Pattern is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.

## Problem

Imagine that you are working on a project that uses a database. You need to create a database connection object and use it throughout the application. The problem is that you can’t pass the connection object to all the classes that need it. You could make the connection object a global variable, but that would violate the principle of encapsulation and make your code tightly coupled.

## Solution

The Singleton pattern suggests that you replace global variables with a class that controls access to an instance of the variable and lets you encapsulate its code in a single place. This class is called the singleton class.

The singleton class must ensure that it can’t be instantiated more than once. All of its constructors must be private or protected, and its declaration must include a static creation method. The creation method must call the constructor to create an object and save it in a static field. All following calls to this method must return the cached object.

## Real-World Analogy

The Singleton pattern is often implemented with a registry, which is an object that stores other objects and lets you retrieve them by name. The registry ensures that there is only one object of each type.

## Structure

![Singleton Design Pattern Structure](https://refactoring.guru/images/patterns/diagrams/singleton/structure-en.png?id=4e4306d3a90f40d74c7a4d2d2506b8ec)

1. The Singleton class defines the `GetInstance` method that lets clients access the unique singleton instance.
2. The Singleton class is responsible for creating and maintaining its own unique instance.
3. The client code calls the static creation method of the singleton class to get the unique singleton object.
4. The Singleton class can have other static methods that provide functionality related to the singleton object.
5. The Singleton class may be responsible for creating the objects that it manages.
6. The Singleton class may be responsible for managing the lifecycle of the objects it creates.
