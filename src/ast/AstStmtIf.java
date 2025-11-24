package ast;

public class AstStmtIf extends AstStmt
{
	public AstExp cond;
	public AstStmtList body;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AstStmtIf(AstExp cond, AstStmtList body, int lineNumber)
	{
		super(lineNumber);
		this.cond = cond;
		this.body = body;
	}

}