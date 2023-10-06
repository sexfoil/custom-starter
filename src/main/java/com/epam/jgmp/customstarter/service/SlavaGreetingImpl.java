package com.epam.jgmp.customstarter.service;

public class SlavaGreetingImpl implements SlavaGreeting {
    @Override
    public void sayHello() {
        System.out.println("************************************");
        System.out.println("* This is default on missing bean. *");
        System.out.println("************************************");
        System.out.println(
                        " ***   *        *    *   *    *  \n" +
                        "*   *  *       * *   *   *   * * \n" +
                        "*      *      *   *  *   *  *   *\n" +
                        " ***   *      *****  *   *  *****\n" +
                        "    *  *      *   *  *   *  *   *\n" +
                        "*   *  *      *   *   * *   *   *\n" +
                        " ***   *****  *   *    *    *   *\n"


        );
    }
}
