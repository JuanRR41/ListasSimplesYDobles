public class ListasDobles <T>
{
    NodoDoble inicio;

    public void insertarInicio(T dato){
        NodoDoble n = new NodoDoble();
        n.setInfo(dato);
        n.setSig(inicio);
        n.setAnt(null);
        if(inicio!=null)
            inicio.setAnt(n);
        inicio = n;
    }

    public void insertarFin(T dato){
        NodoDoble n = new NodoDoble();
        n.setInfo(dato);
        n.setSig(null);
        if(inicio==null){
            n.setAnt(inicio);
            inicio=n;
        }
        NodoDoble r = inicio;
        while(r.getSig()!=null){
            r=r.getSig();
        }
        r.setSig(n);
        n.setAnt(r);

    }

    public T eliminarInicio(){
        T dato = null;
        if(inicio==null){
            System.out.println("LISTA VACIA");
        }

        else {
            dato=(T)inicio.getInfo();
            if(inicio.getSig()==null) {
                inicio=null;
            }
            else {
                inicio=inicio.getSig();
                inicio.setAnt(null);
            }
        }
        return dato;
    }

    public T eliminarFin(){
        T dato = null;
        if(inicio==null){
            System.out.println("LISTA VACIA");

        }
        else if(inicio.getSig()==null){
            dato = (T)inicio.getInfo();
            inicio=null;
        }
        else{
            NodoDoble r=inicio;
            while(r.getSig()!=null){
                r=r.getSig();
            }
            r.setAnt(null);
        }
        return dato;
    }

    public String recorrer(){
        String cadena = "";
        if(inicio==null){
            System.out.println("LISTA VACIA");
        }
        else {
            NodoDoble r = inicio;
            while(r!=null) {
                cadena+=r.getInfo()+"\n";
                r=r.getSig();
            }

        }
        return cadena;
    }

//    public String recursivoDerechaIzquierda(Nodo x){
//        String cadena = "";
//        return cadena;
//    }

    private String recursivo(NodoDoble x){
        if(x.getAnt()==null){
            return x.getInfo()+"";
        }
        else
            return ""+x.getInfo()+recursivo(x.getAnt());
    }

    public String llamarRecursivo(NodoDoble x){
        NodoDoble nAux = inicio;
        while(nAux.getSig()!=null) {
        nAux.getSig();
        }return "VACIO";
    }

}
