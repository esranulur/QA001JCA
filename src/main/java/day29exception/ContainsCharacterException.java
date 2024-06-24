package day29exception;

public class ContainsCharacterException extends  RuntimeException {
    public ContainsCharacterException(String s) {
        super(s);
    }
    public ContainsCharacterException() {
        super();
    }
}