package yal.arbre.expression;

/**
 * 3 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

public abstract class Constante extends Expression {

    protected String cste ;
    
    protected Constante(String texte, int n) {
        super(n) ;
        cste = texte ;
    }
    
    protected Constante(String texte, int n, String s) {
        super(n,s) ;
        cste = texte ;
    }


    @Override
    public String toString() {
        return cste ;
    }

}
