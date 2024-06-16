package org.strings;

import java.lang.constant.ConstantDesc;
import java.lang.invoke.MethodHandles;

public class ResolveConstantDescClass {
    private static final String EXPRESSION = "Hello world";
    public static void main(String[] args) {
        ConstantDesc constantDesc =  EXPRESSION.resolveConstantDesc(MethodHandles.lookup());
        System.out.println(constantDesc);

        Integer someInt = 43;
        ConstantDesc constantDesc1 =  someInt.resolveConstantDesc(MethodHandles.publicLookup());
        System.out.println(constantDesc1);

        Double someDouble = 43.0;
        ConstantDesc constantDesc2 =  someDouble.resolveConstantDesc(MethodHandles.publicLookup());
        System.out.println(constantDesc2);
    }
}
