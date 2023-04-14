package String;

public class SMSmessage {
    /*
    Given a String **message** in the following format:
` Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}`
assign the value of the **sender, phoneNumber, and messageBody** variables and print them.

```
Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving
```
     */
    public static void main(String[] args) {
        String message = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";

        String sender = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        String number = message.substring(message.indexOf("[")+1,message.indexOf("]"));
        String text = message.substring(message.indexOf("{")+1,message.indexOf("}"));

        System.out.println("Sender: " + sender);
        System.out.println("Phone Number: " + number);
        System.out.println("Message body: " + text);


    }
}
