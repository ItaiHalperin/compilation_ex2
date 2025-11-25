package ast;
import java.util.ArrayList;
import java.util.List;

public class AstDecList extends AstNode
{
    public List<AstDec> decs = new ArrayList<>();

    public AstDecList(int lineNumber)
    {
        super(lineNumber);
    }
    public AstDecList(AstDec dec, int lineNumber)
    {
        super(lineNumber);
        decs.add(dec);
    }
    public void add(AstDec dec)
    {
        decs.add(dec);
    }

    public void printMe()
    {
    }
    
}
