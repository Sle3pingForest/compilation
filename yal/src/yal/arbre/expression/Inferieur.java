package yal.arbre.expression;

import yal.exceptions.AnalyseSemantiqueException;

/**
 * 3 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

public class Inferieur extends Comparaison {

    public Inferieur(Expression gauche, Expression droite) {
        super(gauche, droite);
    }

    @Override
    public String operateur() {
        return " < ";
    }

	@Override
	public void verifier() {
		if(!this.gauche.getType().equals(this.droite.getType())){
			throw new AnalyseSemantiqueException("Erreur sémantique : comparaison type incorrect");

		}
		
	}

	@Override
	public int getValue() {
		return 0;
	}
    
}
