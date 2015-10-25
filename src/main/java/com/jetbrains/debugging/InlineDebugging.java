package com.jetbrains.debugging;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;
import static java.util.Arrays.asList;
import static org.apache.commons.lang3.StringUtils.getJaroWinklerDistance;
import static org.apache.commons.lang3.StringUtils.getLevenshteinDistance;


public class InlineDebugging {

    static class MyList<T> {
        public T head;
        public MyList<T> tail = null;

        public MyList(List<T> list) {
            if (!list.isEmpty()) {
                head = list.get(0);
                tail = new MyList<T>(list.subList(1, list.size()));
            }
        }
    }

    static MyList<String> list;

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>(asList(1, 2, 3));
        out.println(getNthFromLast(list, 2));

        int i = getLevenshteinDistance("intellij", "idea", 3);
        double j = getJaroWinklerDistance("intellij", "idea");

        out.println(i + "," + j);
    }

    private static <T> T getNthFromLast(MyList<T> list, int n) {
        int i = 0;
        MyList<T> nthFromLast = null, last = list;

        while ((last = last.tail) != null) {
            if (i++ >= n) { //Breakpoint
                nthFromLast = (nthFromLast == null ? list : nthFromLast.tail);
            }
        }

        return nthFromLast.head;
    }
}
