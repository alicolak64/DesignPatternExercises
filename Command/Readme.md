# Command Pattern

## Intent

Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

## Applicability

Use the Command pattern when you want to

* parameterize objects by an action to perform
* specify, queue, and execute requests at different times
* support undo
* support logging of requests
* structure a system around high-level operations built on primitives operations
* model a system with a single threaded execution in mind
* implement a reversible command
* implement deferred execution of a command
* implement a macro command
* implement a composite command

## Structure

![Command Pattern Structure](https://refactoring.guru/images/patterns/diagrams/command/structure.png)

## Participants

* **Command** declares an interface for executing an operation
* **ConcreteCommand** defines a binding between a Receiver object and an action. Implements Execute by invoking the corresponding operation(s) on Receiver
* **Client** creates a ConcreteCommand object and sets its receiver
* **Invoker** asks the command to carry out the request
* **Receiver** knows how to perform the operations associated with carrying out a request. Any class may serve as a Receiver

## Collaborations

* A client creates a ConcreteCommand object and specifies its receiver
* The Invoker issues a request by calling Execute on the command
* The command carries out the request by calling its receiver's action
* The client is responsible for creating a ConcreteCommand object and specifying its receiver
* The Invoker is responsible for issuing a request by calling Execute on the command
* The command is responsible for carrying out the request by calling its receiver's action
* The receiver is responsible for knowing how to perform the operations associated with carrying out a request
* The ConcreteCommand object is responsible for binding a Receiver object with an action

## Consequences

* It simplifies the sender and receiver of a request because a command encapsulates the request
* It allows commands to be assembled into a composite command
* It makes it easy to add new commands, because you don't have to change existing classes
* It makes it easy to implement undo/redo
* It makes it easy to implement deferred execution of operations
* It makes it easy to implement logging of requests
* It makes it easy to implement macro commands
* It makes it easy to implement composite commands
* It makes it easy to implement a reversible command
* It makes it easy to implement a command that is executed at a different time
* It makes it easy to implement a command that is executed on a different thread

## Related Patterns

* [Chain of Responsibility](https://refactoring.guru/design-patterns/chain-of-responsibility) can use Command objects to implement request chaining
* [Composite](https://refactoring.guru/design-patterns/composite) can use Command objects to implement recursive operations
* [Prototype](https://refactoring.guru/design-patterns/prototype) can use Command objects to implement delayed initialization
* [Visitor](https://refactoring.guru/design-patterns/visitor) can use Command objects to implement double dispatch
* [Strategy](https://refactoring.guru/design-patterns/strategy) can use Command objects to implement an alternative strategy for executing a request

## Known Uses

* Gui buttons and menu items 
* Macro recording 
* Mobile Code 
* Multi-level undo
* Thread pools
* Network protocol stacks
* Transaction processing
* Distributed object invocation
* Parallel processing
* Wizards

## Other Uses

* [java.lang.Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)
* [javax.swing.Action](https://docs.oracle.com/javase/8/docs/api/javax/swing/Action.html)
* [java.util.TimerTask](https://docs.oracle.com/javase/8/docs/api/java/util/TimerTask.html)
* [java.util.concurrent.Callable](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html)
* [java.util.concurrent.Future](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Future.html)
* [java.awt.event.ActionListener](https://docs.oracle.com/javase/8/docs/api/java/awt/event/ActionListener.html)
* [javax.servlet.http.HttpServlet](https://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpServlet.html)


## Credits

* [Command Pattern](https://refactoring.guru/design-patterns/command)
* [Command Pattern - Wikipedia](https://en.wikipedia.org/wiki/Command_pattern)
* [Command Pattern - SourceMaking](https://sourcemaking.com/design_patterns/command)
* [Command Pattern - Dofactory](https://www.dofactory.com/net/command-design-pattern)
* [Command Pattern - TutorialsPoint](https://www.tutorialspoint.com/design_pattern/command_pattern.htm)
* [Command Pattern - GeeksForGeeks](https://www.geeksforgeeks.org/command-pattern/)
* [Command Pattern - JavaTPoint](https://www.javatpoint.com/command-pattern)







