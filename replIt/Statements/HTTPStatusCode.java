package Statements;

import java.util.Scanner;

public class HTTPStatusCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter status code:");
        int statusCode = input.nextInt();

        String message = "";

        switch (statusCode){
                case 200: message = "OK";
                break;
                case 201: message = "Created";
                break;
                case 202: message = "Accepted";
                break;
                case 301: message = "Moved Permanently";
                break;
                case 303: message = "See Other";
                break;
                case 304: message = "Not Modified";
                break;
                case 307: message = "Temporary Redirect";
                break;
                case 400: message = "Bad Request";
                break;
                case 401: message = "Unauthorized";
                break;
                case 403: message = "Forbidden";
                break;
                case 404: message = "Not Found";
                break;
                case 410: message = "Gone";
                break;
                case 500: message = "Internal Server Error";
                break;
                case 503: message = "Service Unavailable";
                break;
                default: message = "Invalid status code!";
        }
        System.out.println(message);
        input.close();
    }
}
