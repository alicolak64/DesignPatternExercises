# Adapter Pattern

## Intent

Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

## Applicability

Use the Adapter pattern when you want to

* use an existing class, and its interface does not match the one you need
* make a reusable class that cooperates with unrelated or unforeseen classes, that is, classes that don't necessarily have compatible interfaces
* need to use several existing subclasses, but it's impractical to adapt their interface by subclassing every one. An object adapter can adapt the interface of its parent class

## Structure

### Object Adapter
![Object Adapter Pattern Structure](https://refactoring.guru/images/patterns/diagrams/adapter/structure-object-adapter.png)

### Class Adapter
![Class Adapter Pattern Structure](https://refactoring.guru/images/patterns/diagrams/adapter/structure-class-adapter.png)


## Participants

* **Target** defines the domain-specific interface that Client uses
* **Client** collaborates with objects conforming to the Target interface
* **Adaptee** defines an existing interface that needs adapting
* **Adapter** adapts the interface of Adaptee to the Target interface
* **Object Adapter** implements the Target interface and composes an Adaptee object
* **Class Adapter** implements the Target interface and extends the Adaptee class


## Collaborations

* A client creates a Target object and configures it with an Adapter object
* The Adapter receives requests from the client via the Target interface and forwards them to the Adaptee object
* The Adapter is responsible for adapting the interface of the Adaptee to the Target interface
* The Adaptee is responsible for carrying out the request
* The client is responsible for creating a Target object and configuring it with an Adapter object
* The Adapter is responsible for creating and maintaining a reference to an Adaptee object
* The Adaptee is responsible for knowing how to perform the operations associated with carrying out a request
* The Adapter is responsible for knowing how to adapt the interface of the Adaptee to the Target interface
* The Adapter is responsible for knowing how to forward requests from the Target to the Adaptee
* The Target is responsible for knowing how to perform the operations associated with carrying out a request


## Consequences

* It lets classes work together that couldn't otherwise because of incompatible interfaces
* It allows reusability of existing subclasses
* It lets you adapt a class into multiple subclasses
* It lets you adapt an object and its subclasses
* It lets you adapt a class to a single


## Known Uses

* [java.util.Arrays#asList()](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#asList-T...-)
* [javax.xml.bind.annotation.adapters.XmlAdapter](https://docs.oracle.com/javase/8/docs/api/javax/xml/bind/annotation/adapters/XmlAdapter.html)
* [java.util.concurrent.Executor#execute()](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Executor.html#execute-java.lang.Runnable-)
* [java.io.InputStreamReader(InputStream)](https://docs.oracle.com/javase/8/docs/api/java/io/InputStreamReader.html#InputStreamReader-java.io.InputStream-)
* [java.io.OutputStreamWriter(OutputStream)](https://docs.oracle.com/javase/8/docs/api/java/io/OutputStreamWriter.html#OutputStreamWriter-java.io.OutputStream-)
* [java.util.Collections#list()](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#list-java.util.Enumeration-)
* [java.util.Collections#enumeration()](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#enumeration-java.util.Collection-)



