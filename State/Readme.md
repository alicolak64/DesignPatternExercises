# State Design Pattern

#### State Design Pattern is behavioral design pattern that allows an object to alter its behavior when its internal state changes. This pattern is close to the concept of finite-state machines. The state pattern can be interpreted as a strategy pattern, which is able to switch the strategy depending on the situation.

## Intent

Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

## Applicability

Use the State pattern when

* an object's behavior depends on its state, and it must change its behavior at run-time depending on that state
* operations have large, multipart conditional statements that depend on the object's state. This state is usually represented by one or more enumerated constants. Often, several operations will contain this same conditional structure. The State pattern puts each branch of the conditional in a separate class. This lets you treat the object's state as an object in its own right that can vary independently from other objects
* a class has multiple behaviors, and these appear as multiple conditional statements in its operations. Instead of many conditionals, move related conditional branches into their own State class
* many distinct operations will be implemented in terms of, and often delegate to, some common operation in a State superclass. You can factor out the common code into the State superclass to avoid code duplication
* you have a large monolithic class that cannot be divided into subclasses because it defines too many distinct behaviors. Such a class is usually difficult to understand and maintain. The State pattern lets you localize related behavior into State subclasses. In this way, you can transform a monolithic class into a set of cooperating State subclasses. In short, you can treat a large class that is difficult to understand as a set of smaller classes that are easier to understand
* you have a class that defines a large number of distinct states, and many of these states only differ slightly from one another. The State pattern lets you treat these states as variations of one another. This lets you reduce the number of distinct classes to the number of states in which the object can exist. This can make state transitions easier to implement and maintain
* you have a class that has a large number of operations, and many of these operations contain large conditional structures that depend on the object's state. The State pattern lets you move each branch of the conditional into a separate State subclass. This lets you treat the object's state as an object in its own right that can vary independently from other objects

## Structure

![State Pattern Structure](https://refactoring.guru/images/patterns/diagrams/state/structure-en.png)

## Participants

* **Context** defines the interface of interest to clients. It also maintains a reference to an instance of a State subclass, which represents the current state of the Context
* **State** declares an interface for encapsulating the behavior associated with a particular state of the Context
* **ConcreteState** subclasses each implement a behavior associated with a state of Context
* **Client** is configured with a ConcreteState object. The client maintains a reference to a State object that defines the current state
* **Context** passes itself as an argument to the State object's handling methods

## Collaborations

* Context delegates state-specific work to the current State object. Context may change its State object at run-time, either because the state has changed internally or because external clients have requested a change
* A State object may call back to the Context to change the Context's state

## Consequences

* It localizes state-specific behavior and partitions behavior according to state, so state-specific code is easier to locate and maintain
* It reduces the number of subclasses of Context
* It makes state transitions explicit
* It lets you localize state-dependent behavior in a single place, so you can change it easily
* It lets you distribute state-dependent behavior across several classes
* It may be difficult to implement transitions between several states simultaneously

## Related Patterns

* **Strategy** is similar to State in that both patterns can alter an object's behavior at run-time. However, Strategy doesn't imply that the behavior is state-dependent. State, on the other hand, implies that the behavior is state-dependent
* **State** can be used to make state transitions explicit. Strategy doesn't imply state transitions
* **Strategy** can be used to switch an algorithm at run-time. State can be used to switch the state of an object at run-time
* **State** can be used to localize state-dependent behavior in a single place, so you can change it easily. Strategy can be used to localize an entire family of algorithms in a single class
* **State** can be used to distribute state-dependent behavior across several classes. Strategy can be used to distribute a family of related algorithms across several classes
* **State** can be used to express complex state-dependent behavior. Strategy can be used to express a family of interchangeable algorithms
* **State** can be used to implement state machines. Strategy can be used to switch an algorithm at run-time
* **State** can be used to implement the Null Object pattern. Strategy can't be used to implement the Null Object pattern
* **State** can be used to implement the Chain of Responsibility pattern. Strategy can't be used to implement the Chain of Responsibility pattern
* **State** can be used to implement the Command pattern. Strategy can't be used to implement the Command pattern
* **State** can be used to implement the Interpreter pattern. Strategy can't be used to implement the Interpreter pattern
* **State** can be used to implement the Iterator pattern. Strategy can't be used to implement the Iterator pattern

## Implementation

* The State pattern is often implemented with a Context interface and a set of concrete State subclasses. The Context interface defines the interface of interest to clients, as well as a method for changing the State object at run-time. The State interface declares an interface for encapsulating the behavior associated with a particular state of the Context. Concrete State subclasses implement each state's behavior
* The State pattern can be implemented with a Context base class and a set of concrete State subclasses. The Context base class defines the interface of interest to clients, as well as a method for changing the State object at run-time. The State base class declares an interface for encapsulating the behavior associated with a particular state of the Context. Concrete State subclasses implement each state's behavior

## Known Uses

* [java.util.Calendar](https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html)
* [java.util.Timer](https://docs.oracle.com/javase/8/docs/api/java/util/Timer.html)
* [javax.faces.lifecycle.LifeCycle](https://docs.oracle.com/javaee/7/api/javax/faces/lifecycle/Lifecycle.html)

## Credits

* [State Design Pattern](https://refactoring.guru/design-patterns/state)
* [State Pattern](https://sourcemaking.com/design_patterns/state)
* [State Pattern](https://www.tutorialspoint.com/design_pattern/state_pattern.htm)
* [State Pattern](https://www.geeksforgeeks.org/state-design-pattern/)

