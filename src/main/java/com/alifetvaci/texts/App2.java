package com.alifetvaci.texts;

public class App2 {

    public static void main(String[] args) {

        // Line  terminator is required
        // equal to-> var text = ""
        var text = """
                """;

//        var text2 = """"""; // illegal text block start
//        var text3 = """ """; // illegal text block start

        TextUtil.printText(text);
    }
}
