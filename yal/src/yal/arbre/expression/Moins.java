package yal.arbre.expression;

/**
 * 3 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

public class Moins extends BinaireArithmetique {

    public Moins(Expression gauche, Expression droite) {
        super(gauche, droite);
    }

    @Override
    public String operateur() {
        return " - ";
    }

	@Override
	public void verifier() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return 0;
	}
    
}
