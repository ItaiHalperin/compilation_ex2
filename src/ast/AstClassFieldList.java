package ast;
import java.util.List;
import java.util.ArrayList;

public class AstClassFieldList  extends AstNode  {
    public List<AstClassField> classFields = new ArrayList<AstClassField>();

    public AstClassFieldList(AstClassField classField, int lineNumber) {
        super(lineNumber);
        classFields.add(classFields);
    }  

    public void add(AstClassField field){
        classFields.add(field);
    }
    
}
