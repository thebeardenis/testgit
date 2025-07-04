package testgit.back.exceptions;

public class UserNotFound extends Exception{
    private String exception(Exception exception) {
        return exception.getMessage();
    }
}
