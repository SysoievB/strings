package org.strings;

import java.util.Arrays;
import java.util.stream.Stream;

import static java.lang.Boolean.valueOf;
import static java.lang.String.join;

public class StringClass {
    public static void main(String[] args) {
        String str = "Hello world";
        //toCharArray()
        char[] arr = str.toCharArray();
        Stream.of(arr).forEach(value -> System.out.print(Arrays.toString(value) + " "));
        //[H, e, l, l, o,  , w, o, r, l, d]
        System.out.println("hello".concat("!!!"));//hello!!!
        System.out.println(valueOf(true));//true
        String s1 = "aaa";
        String s2 = "bbb";
        String s3 = "ccc";
        System.out.println(join(", ", s1, s2, s3));//aaa, bbb, ccc
        System.out.println(s1.compareTo(s2));//-1
        System.out.println(s1.compareTo("aaa"));//0
        char[] chars = new char[4];
        str.getChars(1, 4, chars, 0);
        Stream.of(chars).forEach(value -> System.out.print(Arrays.toString(value) + " "));
        //[e, l, l,  ]
        System.out.println("AAA".equalsIgnoreCase("aaa"));//true
        //regionMatches
        System.out.println("welcome to baeldung".regionMatches(false, 11, "baeldung", 0, 8));//true
        //indexOf
        System.out.println(str.indexOf("e"));//1
        //lastIndexOf
        System.out.println(str.lastIndexOf("l"));//9
        //startsWith
        System.out.println(str.startsWith("Hel"));//true
        //endsWith
        System.out.println(str.endsWith("rld"));//true
        //replace
        System.out.println(str.replace("Hello", "bye"));//bye world
        //trim & strip
        String string = '\u2001' + "String    with    space" + '\u2001';
        System.out.println("Before: \"" + string + "\"");
        System.out.println("After trim: \"" + string.trim() + "\"");
        System.out.println("After strip: \"" + string.strip() + "\"");
        //Before: "  String    with    space  "
        //After trim: " String    with    space "
        //After strip: "String    with    space"
        System.out.println(str.substring(0, 4));//Hell
        //IntStream chars()
        "String".chars().forEach(ch -> System.out.print(ch + " "));//83 116 114 105 110 103
        "String".chars().forEach(ch -> System.out.print((char) ch + " "));//S t r i n g
        //IntStream codePoints()
        "hello 🌍".codePoints().forEach(cp -> System.out.print(Character.toChars(cp)));//hello 🌍
        //lines()
        String lines = """
                line
                line2
                line3
                """;

        lines.lines().forEach(System.out::println);
        //line
        //line2
        //line3

        //isBlank
        System.out.println("    ".isBlank());//true
        //repeat
        System.out.println("12".repeat(3));//121212
        //stripLeading
        System.out.println("    1".stripLeading());//1
        System.out.println("   11".stripLeading());//11
        //stripTrailing
        System.out.println("   1    ".stripTrailing());//   1
        System.out.println("  11    ".stripTrailing());//  11
        //stripIndent
        System.out.println("   123".stripIndent());//123
        System.out.println("123   ".stripIndent());//123
        //indent()
        String text = "This is line one.\nThis is line two.\nThis is line three.";

        // Add 4 spaces to the beginning of each line
        String indentedText = text.indent(4);

        System.out.println("Original Text:");
        System.out.println(text);
        System.out.println("\nIndented Text:");
        System.out.println(indentedText);
        //Original Text:
        //This is line one.
        //This is line two.
        //This is line three.
        //
        //Indented Text:
        //    This is line one.
        //    This is line two.
        //    This is line three.

        //transform()
        System.out.println((String) "abc"
                .transform(s -> s.concat("xyz"))
                .transform(String::toUpperCase)
        );//ABCXYZ

        //describeConstable()
        System.out.println("123".describeConstable().orElse(""));//123
        System.out.println("abc".describeConstable().get());//abc

        //formatted()
        System.out.println("1) %s 2) %s 3) %s ".formatted("Java", "Python", "JavaScript"));//1) Java 2) Python 3) JavaScript
        //translateEscapes()
        String input = "Hello\\nWorld\\tTab\\\"Quote\\\"";
        System.out.println("Original String: " + input);

        String translated = input.translateEscapes();
        System.out.println("Translated String: " + translated);
        //Translated String: Hello
        //World	Tab"Quote"
    }
}