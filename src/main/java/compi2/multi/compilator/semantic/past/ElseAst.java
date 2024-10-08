
package compi2.multi.compilator.semantic.past;

import compi2.multi.compilator.semantic.ControlStruct;
import compi2.multi.compilator.semantic.Statement;
import compi2.multi.compilator.analysis.symbolt.SymbolTable;
import compi2.multi.compilator.analysis.typet.TypeTable;
import compi2.multi.compilator.semantic.util.ReturnCase;
import compi2.multi.compilator.semantic.util.SemanticRestrictions;
import compi2.multi.compilator.util.Position;
import java.util.List;

/**
 *
 * @author blue-dragon
 */
public class ElseAst extends ControlStruct{
    
    public ElseAst(List<Statement> stmts){
        super(null);
        super.internalStmts = stmts;
    }

    @Override
    public ReturnCase validate(SymbolTable symbolTable, TypeTable typeTable, 
            List<String> semanticErrors, SemanticRestrictions restrictions) {
        return super.validateInternalStmts(symbolTable, typeTable, semanticErrors, restrictions);
    }
    
    public void setInitPos(Position initPos){
        super.initPos = initPos;
    }

}
