package DesignPatterns.TemplateMehodPattern.Code.TemplateMethodDefine;

public abstract class AbstractClass {

    final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
    }

    abstract void primitiveOperation1();

    abstract void primitiveOperation2();

    void concreteOperation() {
        System.out.println("concreteMethod");
    }

}
