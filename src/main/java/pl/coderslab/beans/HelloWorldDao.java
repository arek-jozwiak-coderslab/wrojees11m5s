package pl.coderslab.beans;


public class HelloWorldDao {
    private String message;
    public HelloWorldDao() {
        System.out.println("TWORZE OBIEKT");
    }

    public HelloWorldDao(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void printMessage() {
        System.out.println("Your Message : " + message);
    }
}