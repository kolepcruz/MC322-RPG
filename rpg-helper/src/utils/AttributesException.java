package utils;

public class AttributesException extends Exception {

    private static final long serialVersionUID = 1L;
    private int codigo = 322;
    public AttributesException(String message,int codigo)
    {
        super(message);
        this.codigo = codigo;
    }
}