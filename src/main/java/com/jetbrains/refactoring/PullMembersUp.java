package com.jetbrains.refactoring;

import static java.lang.System.out;

public class PullMembersUp {
    public class A {
        class B extends A {
            public void ab() {
                out.println("a");
                out.println("b");
            }

            //Pull these methods up to superclass
            public void a() {
                out.println("a");
            }

            public void b() {
                out.println("b");
            }

            public void c() {
                out.println("c");
            }

            public void d() {
                out.println("d");
            }
        }

        class C extends A {
            public void cd() {
                out.println("c");
                out.println("d");
            }
        }

        class D extends A {
            public void da() {
                out.println("d");
                out.println("a");
            }
        }
    }
}
