
package compi2.multi.compilator.semantic.jast.inv;

import compi2.multi.compilator.semantic.util.JPassExp;
import compi2.multi.compilator.util.Position;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author blue-dragon
 */
@Getter @Setter
public class JArrayUse extends JVarUse{
    private List<JPassExp> arrayAccess;
    
    public JArrayUse(Position position, String name, JContextRef context, List<JPassExp> arrayAccess) {
        super(position, name, context);
        this.arrayAccess = arrayAccess;
    }
    
}
