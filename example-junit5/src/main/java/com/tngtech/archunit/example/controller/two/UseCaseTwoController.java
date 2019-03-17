package com.tngtech.archunit.example.controller.two;

import com.tngtech.archunit.example.AbstractController;
import com.tngtech.archunit.example.controller.one.UseCaseOneTwoController;

public class UseCaseTwoController extends AbstractController {
    public static final String doSomethingTwo = "doSomethingTwo";

    public void doSomethingTwo() {
        new UseCaseOneTwoController().doSomethingOne();
    }
}
