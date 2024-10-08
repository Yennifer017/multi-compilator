
package compi2.multi.compilator.analysis.symbolt.clases;

import compi2.multi.compilator.analysis.symbolt.AccessMod;
import compi2.multi.compilator.analysis.symbolt.Category;
import compi2.multi.compilator.analysis.symbolt.RowST;

/**
 *
 * @author blue-dragon
 */
public class FieldST extends RowST{
    
    private AccessMod access;
    
    public FieldST(String name, String type, AccessMod access) {
        super(name, Category.JField, type);
        this.access = access;
    }

    @Override
    public boolean isLinked() {
        return false;
    }
    
}
