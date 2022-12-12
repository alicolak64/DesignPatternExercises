# Template Method Pattern

## Intent

Template Method defines the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

## Applicability

Use the Template Method pattern when

* you want to let subclasses redefine certain steps of an algorithm without letting them to change the algorithm's structure
* you have several classes that contain almost identical algorithms
* you want to localize the changes in a template algorithm
* you want to control subclasses extensions
* you want to defer some steps of an algorithm to subclasses
* you want to implement the "invariants" of an algorithm once and leave it up to subclasses to implement the behavior that can vary
* you want to implement the "placeholders" for future extensions in an algorithm
* you want to implement the "hooks" for extensions in an algorithm
* you want to implement the "steps" of an algorithm as "primitives" that subclasses can override

## Structure

![Template Method Pattern Structure](https://refactoring.guru/images/patterns/diagrams/template-method/structure.png)

## Participants

* **AbstractClass** defines abstract primitive operations that concrete subclasses define to implement steps of an algorithm. It also implements a template method defining the skeleton of an algorithm. The template method calls primitive operations as well as operations defined in AbstractClass or those of other objects.
* **ConcreteClass** implements the primitive operations to carry out subclass-specific steps of the algorithm.
* **Client** calls the template method to execute an algorithm. Client does not know the concrete class of an object it works with, since it works with all objects via the interface of their base class.
* **Template Method** defines the skeleton of an algorithm as an abstract class that provides a skeletal implementation of some steps of an algorithm, called primitives. It defers some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
* **Primitive Operation** is a step of an algorithm that subclasses implement to carry out subclass-specific steps of the algorithm.

## Collaborations

* A client creates a ConcreteClass object and configures it with an AbstractClass object
* The AbstractClass object calls primitive operations as well as operations defined in AbstractClass or those of other objects
* The ConcreteClass object implements the primitive operations to carry out subclass-specific steps of the algorithm

## Known Uses

* [java.util.AbstractList](https://docs.oracle.com/javase/8/docs/api/java/util/AbstractList.html)
* [java.util.AbstractSet](https://docs.oracle.com/javase/8/docs/api/java/util/AbstractSet.html)
* [java.util.AbstractMap](https://docs.oracle.com/javase/8/docs/api/java/util/AbstractMap.html)
* [java.util.AbstractSequentialList](https://docs.oracle.com/javase/8/docs/api/java/util/AbstractSequentialList.html)
* [java.util.AbstractCollection](https://docs.oracle.com/javase/8/docs/api/java/util/AbstractCollection.html)
* [java.util.AbstractQueue](https://docs.oracle.com/javase/8/docs/api/java/util/AbstractQueue.html)
* [java.util.AbstractMap.SimpleEntry](https://docs.oracle.com/javase/8/docs/api/java/util/AbstractMap.SimpleEntry.html)



