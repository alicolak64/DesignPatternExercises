package DesignPatterns.TemplateMehodPattern.Code.TemplateMethodDefineWithHook;

public abstract class AbstractClass {

    final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
        hook();
    }

    abstract void primitiveOperation1();

    abstract void primitiveOperation2();

    void concreteOperation() {
        System.out.println("concreteMethod");
    }

    void hook () {

    }

}
