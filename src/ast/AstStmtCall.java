package ast;
public class AstStmtCall extends AstStmt{
    public AstCallExp callExp;
    public AstStmtCall(AstCallExp callExp, int lineNumber){
        super (lineNumber);
        this.callExp = callExp;
    }
}
