
package compi2.multi.compilator.semantic.jast;

import compi2.multi.compilator.analysis.symbolt.SymbolTable;
import compi2.multi.compilator.analysis.typet.TypeTable;
import compi2.multi.compilator.semantic.Statement;
import compi2.multi.compilator.semantic.jclases.components.JType;
import compi2.multi.compilator.semantic.util.JPassExp;
import compi2.multi.compilator.semantic.util.Label;
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
public class JDeclaration extends Statement{
    
    private String name;
    private JType type;
    private JPassExp value;

    public JDeclaration(Position initPos, String name, JType type) {
        super(initPos);
        this.name = name;
        this.type = type;
    }
    
    public JDeclaration(Position initPos, String name, JType type, JPassExp value){
        super(initPos);
        this.name = name;
        this.type = type;
        this.value = value;
    }
    
    @Override
    public ReturnCase validate(SymbolTable symbolTable, TypeTable typeTable, List<String> semanticErrors, SemanticRestrictions restrictions) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
