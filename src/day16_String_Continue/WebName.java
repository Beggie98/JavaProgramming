package day16_String_Continue;

public class WebName {
    public static void main(String[] args) {
        //lastIndexOf() - returns the index of last character occurred. Returns int
        String url = "www.amazon.com";

        String name = url.substring(url.indexOf(".")+1,url.lastIndexOf("."));
        System.out.println("name = " + name);
        
        String domain = url.substring(url.lastIndexOf(".")+1);
        System.out.println("domain = " + domain);


    }
}
