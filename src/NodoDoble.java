public class NodoDoble <T>{
    private T info;
    private NodoDoble sig;
    private NodoDoble ant;

    public NodoDoble() {
        info = (T) new Object();
        sig = null;
        ant = null;
    }
    public NodoDoble(T dato, NodoDoble sig,NodoDoble ant) {
        this.info=dato;
        this.sig=sig;
        this.ant=ant;
    }
    public NodoDoble(T dato) {
        this.info=dato;
    }

    public void setSig(NodoDoble sig){
        this.sig=sig;
    }
    public NodoDoble getSig(){
        return sig;
    }
    public void setAnt(NodoDoble ant){
        this.ant = ant;
    }
    public NodoDoble getAnt(){
        return ant;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

}
