package ast;

public class AstNewExp extends AstExp
{
    public AstType type;
    public AstExp subscript;

    public AstNewExp(AstType type, AstExp subscript, int lineNumber)
    {
        super(lineNumber);
        this.type = type;
        this.subscript = subscript;
    }

    public void printMe()
    {

    }
    
}
