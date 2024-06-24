package day29exception;



    public class HealtProblemException extends RuntimeException{
        public HealtProblemException(){
            super();
        }
        public HealtProblemException(String msg){
            super(msg);
        }
    }
