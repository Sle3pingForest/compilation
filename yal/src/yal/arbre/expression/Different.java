package yal.arbre.expression;

import yal.exceptions.AnalyseSemantiqueException;

/**
 * 3 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

public class Different extends Comparaison {

    public Different(Expression gauche, Expression droite) {
        super(gauche, droite);
        
    }

    @Override
    public String operateur() {
        return " != ";
    }

	@Override
	public void verifier() {
		if ( gauche.getType() != droite.getType() ) {
			throw new AnalyseSemantiqueException("ERREUR SEMANTIQUE : les operandes ne sont "
					+ "pas du meme type");
		}
	}

	@Override
	public int getValue() {
		return this.valeur;
	}

	
  
}
