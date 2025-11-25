package ast;

public class AstExpInt extends AstExp
{
	public int value;
	public AstExpInt(int value, int lineNumber)
	{
		super(lineNumber);
		this.value = value;
	}
}
