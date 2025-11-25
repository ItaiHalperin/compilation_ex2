package ast;

public class AstCallExp extends AstNode{
    public AstVar var;
    public String funcName;
    public AstExpList args;
    
    public AstCallExp(AstVar var, String funcName, AstExpList args, int lineNumber){
        super(lineNumber);
        this.var = var;
        this.funcName = funcName;
        this.args = args;
    }
}
