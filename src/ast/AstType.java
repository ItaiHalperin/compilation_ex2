package ast;

public class AstType extends AstNode
{
    public String type;

    public AstType(String type, int lineNumber)
    {
        super(lineNumber);
        this.type = type;
    }

    public void printMe()
    {
    }
    
}


