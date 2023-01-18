# Composite Design Pattern

#### Composite Design Pattern is structural design pattern that allows you to compose objects into tree structures and then work with these structures as if they were individual objects.

## Intent

Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

## Applicability

Use the Composite pattern when

* you want to represent part-whole hierarchies of objects
* you want clients to be able to ignore the difference between compositions of objects and individual objects. Clients will treat all objects in the composite structure uniformly
* you want to simplify client code by having clients treat leaf objects and composite objects uniformly
* you want to define recursive structures that contain a group of objects or a group of groups of objects
* you want to make it easy for clients to add new kinds of components to the hierarchy

## Structure

![Composite Pattern Structure](https://refactoring.guru/images/patterns/diagrams/composite/structure-en.png)

## Participants

* **Component** declares the interface for objects in the composition
* **Leaf** defines behavior for primitive objects in the composition
* **Composite** defines behavior for components having children. Stores child components. Implements child-related operations in the Component interface
* **Client** manipulates objects in the composition through the Component interface

## Collaborations

* The client calls the Component interface to manipulate objects in the composition
* The client calls the child-related operations defined in the Component interface to manipulate child components

## Consequences

* It makes the client simple
* It makes it easier to add new kinds of components
* It makes it harder to add new kinds of clients
* It complicates the Component interface
* It makes it harder to restrict the components of a composite
* It makes it harder to define shared components
* It makes it harder to support recursive components
* It makes it harder to support transparent composite hierarchies
* It makes it harder to support multiple compositions
* It makes it harder to support multiple representations
* It makes it harder to support multiple operations
* It makes it harder to support multiple types of components
* It makes it harder to support multiple types of children
* It makes it harder to support multiple types of composites
* It makes it harder to support multiple types of leafs
* It makes it harder to support multiple types of parents
* It makes it harder to support multiple types of roots
* It makes it harder to support multiple types of trees

## Related Patterns

* **Decorator** can be used to add behavior to individual objects without affecting the behavior of other objects in the same composition
* **Visitor** can be used to define new operations for a composite
* **Chain of Responsibility** can be used to implement a recursive traversal of a composite

## Known Uses

* [java.awt.Container](https://docs.oracle.com/javase/8/docs/api/java/awt/Container.html) and [java.awt.Component](https://docs.oracle.com/javase/8/docs/api/java/awt/Component.html) classes
* [javax.faces.component.UIComponent](https://docs.oracle.com/javaee/7/api/javax/faces/component/UIComponent.html) class
* [javax.swing.JComponent](https://docs.oracle.com/javase/8/docs/api/javax/swing/JComponent.html) class

## Credits

* [Composite Pattern](https://refactoring.guru/design-patterns/composite)   
* [Composite Pattern](https://www.tutorialspoint.com/design_pattern/composite_pattern.htm)


