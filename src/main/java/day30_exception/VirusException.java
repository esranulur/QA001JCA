package day30_exception;

public class VirusException  extends RuntimeException {
    public VirusException(String msg) {
        super(msg);
    }

    public VirusException() {
        super();

    }
}