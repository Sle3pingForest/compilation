package yal.arbre.expression;

import yal.exceptions.AnalyseSemantiqueException;

/**
 * 3 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

public class Div extends BinaireArithmetique {

    public Div(Expression gauche, Expression droite) {
        super(gauche, droite);
    }

    @Override
    public String operateur() {
        return " / ";
    }

	@Override
	public void verifier() {
		// TODO Auto-generated method stub
		if (gauche.getType() != "entier" || droite.getType() != "entier") {
			
			throw new AnalyseSemantiqueException("Erreur sémantique division : une ou plusieurs expressions " +
					" ne sont pas de type entier");
		}
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return 0;
	}
    
}
