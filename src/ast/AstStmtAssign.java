package ast;

public class AstStmtAssign extends AstStmt {
	public final AstVar var;
	public final AstExp exp;

	public AstStmtAssign(AstVar var, AstExp exp, int left) {
		super(left);
		this.var = var;
		this.exp = exp;
	}
}
