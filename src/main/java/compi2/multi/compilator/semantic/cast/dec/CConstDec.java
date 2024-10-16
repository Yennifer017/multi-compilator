
package compi2.multi.compilator.semantic.cast.dec;

import compi2.multi.compilator.analysis.typet.PrimitiveType;
import compi2.multi.compilator.semantic.c.CDef;
import compi2.multi.compilator.semantic.c.CExp;
import compi2.multi.compilator.semantic.util.Label;

/**
 *
 * @author blue-dragon
 */
public class CConstDec extends CDef{
    
    private PrimitiveType type;
    private CExp exp;
    
    public CConstDec(Label name, PrimitiveType type, CExp exp){
        super.name = name;
        this.type = type;
        this.exp = exp;
    }

    
}
