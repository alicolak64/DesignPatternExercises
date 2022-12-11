# Facade Pattern    

## Intent

Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

## Applicability

Use the Facade pattern when you want to 

* provide a simple interface to a complex subsystem
* define a subsystem in terms of higher-level objects
* hide the implementation details of a subsystem from clients
* simplify the dependencies between clients and the implementation of an abstraction
* make a subsystem easier to use , more reusable and independent of its clients

## Structure

![Facade Pattern Structure](https://refactoring.guru/images/patterns/diagrams/facade/structure.png)

## Participants

* **Facade** provides a simple interface to the complex logic of one or more subsystems. The Facade delegates client requests to appropriate objects within the subsystem. The Facade is also responsible for managing their lifecycle. All of this shields clients from the undesired complexity of the subsystem
* **Subsystem Classes** implement the subsystem functionality. Handle work assigned by the Facade object. Have no knowledge of the facade and keep no reference to it
* **Client** is supported by a simple interface provided by the Facade. The client is not aware of the existence of the subsystem. The client communicates with the subsystem only via the Facade
* **Additional Facades** provide additional interfaces to the subsystem. Facades can be layered to provide different interfaces to the same subsystem

## Collaborations

* The client communicates with the subsystem only via the Facade
* The Facade delegates client requests to appropriate objects within the subsystem
* The Facade is responsible for managing the lifecycle of the subsystem objects
* The Facade is not aware of the existence of the subsystem. The subsystem has no reference to the facade
* The subsystem objects have no knowledge of the facade. The subsystem objects keep no reference to the facade
* The client is not aware of the existence of the subsystem. The client has no reference to the subsystem objects

## Consequences

* It shields clients from subsystem components, thereby reducing the number of objects that clients deal with and making the subsystem easier to use
* It promotes weak coupling between the subsystem and its clients
* It doesn't prevent applications from using subsystem classes if they need to
* It doesn't prevent clients from using the subsystem classes if they are aware of them

## Known Uses

* [java.lang.Class](https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)
* [java.lang.Runtime](https://docs.oracle.com/javase/8/docs/api/java/lang/Runtime.html)
* [java.awt.Graphics](https://docs.oracle.com/javase/8/docs/api/java/awt/Graphics.html)
* [javax.faces.context.FacesContext](https://docs.oracle.com/javaee/7/api/javax/faces/context/FacesContext.html)
* [javax.servlet.http.HttpServletRequest](https://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpServletRequest.html)


