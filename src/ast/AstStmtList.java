package ast;
import java.util.ArrayList;
import java.util.List;

public class AstStmtList extends AstNode{
	public List<AstStmt> stmts = new ArrayList<AstStmt>();

	public AstStmtList(int lineNumber) {
		super(lineNumber);
	}
	public void add(AstStmt stmt) {
		stmts.add(stmt);
	}
}