# Observer Design Pattern
##### Observer Design Pattern is behavioral design pattern that allows you to define a subscription mechanism to notify multiple objects about any events that happen to the object they are observing.

##### Java's Built in Observer Pattern is a good example of this pattern. The Observable class is the subject and the Observer interface is the observer. The subject maintains a list of observers and notifies them when a change occurs. The observer interface has a single method called update() which is called by the subject when a change occurs. The observer interface is implemented by the observer classes. The observer classes are registered with the subject using the addObserver() method. The observer classes are notified when a change occurs using the notifyObservers() method.

### Principles

1 -> Strive for loosely coupled, designs between objects that interact.

### Observer Patterns vs Java Built in 

Java Built in 2 design principle violates

1 -> Program to an interface, not an implementation

2 -> Favor composition over inheritance

### Difference between Observer and Observable

1 - Observable is a class and Observer is an interface.

2 - Observable has a method called notifyObservers() and Observer has a method called update().

3 - Observable has a method called setChanged() and Observer doesn't have any such method.

3 - Observable has a method called clearChanged() and Observer doesn't have any such method.

4 - Observable has a method called hasChanged() and Observer doesn't have any such method.




