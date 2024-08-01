package exceptionHandeling;
class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        try {
            throw new MyException("this is user defined exception");
        } catch (MyException e) {
            System.out.println("Exception caught "+e);
        }

        // chained exception
        // Chained Exceptions allows to relate one exception with another exception, i.e one exception describes cause of another exception.
        try {
            // creating new exception
            ArrayIndexOutOfBoundsException ex = new ArrayIndexOutOfBoundsException("Exception");
            // setting a cause of the exception
            ex.initCause(new ArrayIndexOutOfBoundsException("this is actual cause"));
            // throw exception
            throw ex;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
            System.out.println(ex.getCause());
        }
    }
}
