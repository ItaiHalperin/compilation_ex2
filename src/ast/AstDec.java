package ast;

public abstract class AstDec extends AstNode
{

    public AstDec(int lineNumber)
    {
        super(lineNumber);
    }
    public void printMe()
    {
        System.out.print("AST NODE UNKNOWN\n");
    }
}