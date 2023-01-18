# Iterator Design Pattern

##### Iterator Design Pattern is behavioral design pattern that allows you to traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.).

## Intent

Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

## Applicability

Use the Iterator pattern when

* you want to access an aggregate object's contents without exposing its internal representation
* you want to support multiple traversals of aggregate objects
* you want to provide a uniform interface for traversing different aggregate structures (that is, you want to support polymorphic iteration)
* you want to define a standard way to iterate over different aggregate structures
* you want to support iteration in a collection that is different from the collection's interface
* you want to provide clients with a way to traverse a collection without exposing its internal structure
* you want to support multiple concurrent traversals of a collection

## Structure

![Iterator Pattern Structure](https://refactoring.guru/images/patterns/diagrams/iterator/structure.png)

## Participants

* **Iterator** declares an interface for accessing and traversing elements
* **ConcreteIterator** implements the Iterator interface. Keeps track of the current position in the traversal of the aggregate
* **Aggregate** declares an interface for creating an Iterator object
* **ConcreteAggregate** implements the Iterator creation interface to return an instance of the proper ConcreteIterator
* **Client** accesses the elements of an aggregate object sequentially without knowing its underlying representation
* **Additional Iterators** provide additional interfaces to the aggregate. Iterators can be layered to provide different interfaces to the same aggregate
* **Additional Aggregates** provide additional interfaces to the iterator. Aggregates can be layered to provide different interfaces to the same iterator
* **Additional Clients** provide additional interfaces to the iterator. Clients can be layered to provide different interfaces to the same iterator
* **Additional ConcreteIterators** provide additional interfaces to the aggregate. ConcreteIterators can be layered to provide different interfaces to the same aggregate
* **Additional ConcreteAggregates** provide additional interfaces to the iterator. ConcreteAggregates can be layered to provide different interfaces to the same iterator

## Collaborations

* The client accesses the elements of an aggregate object sequentially without knowing its underlying representation
* The client requests an iterator object from the aggregate
* The aggregate returns the proper iterator to the client. The client uses the first(), isDone(), next(), and currentItem() protocol to traverse the aggregate

## Consequences

* It supports variations in the traversal of an aggregate
* Iterators simplify the Aggregate interface
* More than one traversal can be pending on an aggregate
* Adds a few classes to the framework
* Iterators may be complex
* New operations are difficult to add to the Iterator interface
* New ConcreteIterators must be defined for each ConcreteAggregate subclass
* ConcreteIterators are coupled to their ConcreteAggregate
* ConcreteIterators must be updated when the ConcreteAggregate changes

## Related Patterns

* **Composite** can be used to implement an Iterator for a Composite structure
* **Factory Method** can be used to create Iterators
* **Memento** can be used to capture the state of an iterator

## Implementation

* **Iterator** is implemented as an interface or an abstract class
* **ConcreteIterator** is implemented as a class
* **Aggregate** is implemented as an interface or an abstract class
* **ConcreteAggregate** is implemented as a class
* **Client** is implemented as a class

## Known Uses

* [java.util.Iterator](https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html)
* [java.util.Enumeration](https://docs.oracle.com/javase/8/docs/api/java/util/Enumeration.html)
* [java.util.ListIterator](https://docs.oracle.com/javase/8/docs/api/java/util/ListIterator.html)