
package compi2.multi.compilator.analysis.symbolt;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author blue-dragon
 */
@Getter @Setter
public abstract class ModuleRowST extends RowST{
    
    protected SymbolTable internalST;
    protected List<String> typesParams; 
    protected String convertedName;
    
    public ModuleRowST(String name, Category category, String type, 
            SymbolTable internalST, List<String> typesParams) {
        super(name, category, type);
        this.internalST = internalST;
        this.typesParams = typesParams;
    }
    
    protected void addReturRow(){
        internalST.put(
                AdditionalInfoST.DIR_RETORNO_ROW.getNameRow(), 
                new ReturnRow(internalST.getLastDir())
        );
        internalST.incrementLastDir(1);
    }
    
    /**
     *
     * @return el nombre completo
     */
    public abstract String getCompleateName();
    
}
