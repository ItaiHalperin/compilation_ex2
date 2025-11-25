package ast;

public class AstStmtAssignNew extends AstStmt {
	public final AstVar var;
	public final AstNewExp exp;

	public AstStmtAssignNew(AstVar var, AstNewExp exp, int lineNumber) {
		super(lineNumber);
		this.var = var;
		this.exp = exp;
	}
}