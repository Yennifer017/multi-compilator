
package compi2.multi.compilator.semantic.cexp;

import compi2.multi.compilator.semantic.c.CExp;
import compi2.multi.compilator.util.Position;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author blue-dragon
 */
@Getter @Setter
public class CLiteral extends CExp{
    private Object object;
    public CLiteral(Position pos, Object object) {
        super(pos);
        this.object = object;
    }
    
}
