
package compi2.multi.compilator.semantic.jexp;

import compi2.multi.compilator.analysis.symbolt.SymbolTable;
import compi2.multi.compilator.analysis.typet.TypeTable;
import compi2.multi.compilator.semantic.DefiniteOperation;
import compi2.multi.compilator.semantic.Expression;
import compi2.multi.compilator.semantic.util.JPassExp;
import compi2.multi.compilator.semantic.util.Label;
import compi2.multi.compilator.util.Position;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author blue-dragon
 */
@Getter @Setter
public class JUnaryOp extends Expression{
    
    private JPassExp passExp;
    
    private DefiniteOperation operation;

    public JUnaryOp(Position pos, JPassExp passExp, DefiniteOperation operation) {
        super.pos = pos;
        this.passExp = passExp;
        this.operation = operation;
    }
    

    @Override
    public Label validateSimpleData(SymbolTable symbolTable, List<String> semanticErrors) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Label validateComplexData(SymbolTable symbolTable, TypeTable typeTable, List<String> semanticErrors) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
