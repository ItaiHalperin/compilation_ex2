package ast;

public class AstClassField extends AstNode{
    public AstVarDec varDec;
    public AstFuncDec funcDec;

    public AstClassField(AstVarDec varDec, int lineNumber) {
        super(lineNumber);
        this.varDec = varDec;
    }
    public AstClassField(AstFuncDec funcDec, int lineNumber) {
        super(lineNumber);
        this.funcDec = funcDec;
    }
}
