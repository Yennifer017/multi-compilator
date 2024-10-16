
package compi2.multi.compilator.semantic.cast.defaultfuncs;

import compi2.multi.compilator.analysis.symbolt.SymbolTable;
import compi2.multi.compilator.analysis.typet.TypeTable;
import compi2.multi.compilator.semantic.Statement;
import compi2.multi.compilator.semantic.c.CStatement;
import compi2.multi.compilator.semantic.util.ReturnCase;
import compi2.multi.compilator.semantic.util.SemanticRestrictions;
import compi2.multi.compilator.util.Position;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author blue-dragon
 */
@Getter @Setter
public class CDefaultSimpleFun extends CStatement{
    public final static String CLEAR_FUN = "clear";
    public final static String GETCH_FUN = "getch";
    
    private String functionName;

    public CDefaultSimpleFun(Position initPos, String functionName) {
        super(initPos);
        this.functionName = functionName;
    }

    
}
