import java.util.Objects;

public class Nodo<T> {
    private int valor;
    private T info;
    private Nodo sig;

    public Nodo() {
        valor=0;
        info = (T) new Object();
        sig = null;
    }
    public Nodo(T dato, Nodo sig) {
        this.info=dato;
        this.sig=sig;
    }
    public Nodo(T dato) {
        this.info=dato;
    }

    public int getValor(){
        return valor;
    }
    public void setValor(int valor){
        this.valor=valor;
    }
    public void setSig(Nodo sig){
        this.sig=sig;
    }
    public Nodo getSig(){
        return sig;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

//    @Override
//    public String toString() {
//        StringBuffer n = new StringBuffer();
//
//        n.append("Nodo:\n"+"info="+info+", sig="+sig);
//        return n.toString();
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Nodo<?> nodo = (Nodo<?>) o;
//        return Objects.equals(info, nodo.info) && Objects.equals(sig, nodo.sig);
//    }

}
