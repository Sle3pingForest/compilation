package yal.arbre.expression;

import yal.exceptions.AnalyseSemantiqueException;

/**
 * 3 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

public abstract class Comparaison extends Binaire {
     
    protected Comparaison(Expression gauche, Expression droite) {
        super(gauche, droite);
    }
    
    
	@Override
	public void verifier() {
		if(!this.gauche.getType().equals(this.droite.getType())){
			throw new AnalyseSemantiqueException(" Comparaison operateur "+ operateur() + " incorrect entre " + this.gauche.getType() + " & " + this.droite.getType());
		}

	}

}
