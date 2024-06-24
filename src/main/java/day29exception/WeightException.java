package day29exception;

    public class WeightException extends RuntimeException{
        public WeightException(){
            super();
        }
        public WeightException(String msg){
            super(msg);
        }
    }
