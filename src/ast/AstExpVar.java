package ast;

public class AstExpVar extends AstExp
{
	public AstVar var;
	public AstExpVar(AstVar var, int lineNumber)
	{
		super(lineNumber);
		this.var = var;
	}
}
