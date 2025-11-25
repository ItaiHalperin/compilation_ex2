package ast;
public class AstStmtReturn extends AstStmt {
    public AstExp exp;
    public AstStmtReturn(AstExp exp, int lineNumber) {
        super(lineNumber);
        this.exp = exp;
    }
}
