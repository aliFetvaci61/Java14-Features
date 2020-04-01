package com.alifetvaci.texts;

import static com.alifetvaci.texts.TextUtil.printText;

public class App7 {

    public static void main(String[] args) {
        String html = """
                      <html>                  
                         <body>               
                           <p>%s, %s</p>
                         </body>              
                      </html>                 
                      """;
        html = html.formatted("Merhaba", "Dünya");

        printText(html);
    }
}
