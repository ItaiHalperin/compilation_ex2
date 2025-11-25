package ast;

public class AstFuncDec extends AstDec
{
    public String name;
    public AstType returnType;
    public AstStmtList funcBody;
    public AstTypeNameList params;

    public AstFuncDec(AstType returnType, String name, AstTypeNameList params, AstStmtList funcBody, int lineNumber)
    {
        super(lineNumber);
        this.name = name;
        this.returnType = returnType;
        this.params = params;
        this.funcBody = funcBody;
    }

    public void printMe()
    {
    }
    
}