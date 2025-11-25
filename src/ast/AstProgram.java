package ast;

public class AstProgram extends AstNode
{
    public AstDecList decList;

    public AstProgram(AstDecList decList, int lineNumber)
    {
        super(lineNumber);
        this.decList = decList;

    }

    public void printMe()
    {
        System.out.print("AST PROGRAM\n");

        if (decList != null) decList.printMe();
    }
    
}
