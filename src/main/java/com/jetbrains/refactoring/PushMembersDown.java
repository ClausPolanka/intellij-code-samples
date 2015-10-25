package com.jetbrains.refactoring;

import static java.lang.System.out;

public class PushMembersDown {
    public class A {
        //Push these members down to subclasses
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

        class B extends A {
            public void ab() {
                a();
                b();
            }
        }

        class C extends A {
            public void cd() {
                c();
                d();
            }
        }

        class D extends A {
            public void da() {
                d();
                a();
            }
        }
    }
}
