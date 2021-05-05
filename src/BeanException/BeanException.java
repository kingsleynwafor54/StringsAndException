package BeanException;

public class BeanException extends Exception{

    public BeanException(){
        super();
    }
public BeanException(String message){
        super(message);
}
public BeanException (Throwable ex){
        super(ex);
}
public BeanException(String message,Throwable ex){
      super(message,ex) ;
}

}
