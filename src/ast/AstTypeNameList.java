package ast;
import java.util.ArrayList;
import java.util.List;

public class AstTypeNameList extends AstNode
{
    public List<AstType> typeList = new ArrayList<AstType>();
    public List<String> nameList = new ArrayList<String>();
    
    public AstTypeNameList(AstType type, String name, int lineNumber)
    {
        super(lineNumber);
        typeList.add(type);
        nameList.add(name);
    }
    
    public void add(AstType typeName, String name)
    {
        typeList.add(typeName);
        nameList.add(name);
    }
    
    public void printMe()
    {
    }
}
