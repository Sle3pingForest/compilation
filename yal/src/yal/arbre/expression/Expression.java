package yal.arbre.expression;

import yal.arbre.ArbreAbstrait;

/**
 * 3 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

public abstract class Expression extends ArbreAbstrait {
	
	protected String type;
    
    protected Expression(int n) {
        super(n) ;
    }

    protected String getType(){
    	return type;
    }
}
