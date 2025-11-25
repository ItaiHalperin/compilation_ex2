package ast;

public class AstStmtDec extends AstStmt {
    public AstVarDec varDec;

    public AstStmtDec(AstVarDec varDec, int lineNumber) {
        super(lineNumber);
        this.varDec = varDec;
    }
}
