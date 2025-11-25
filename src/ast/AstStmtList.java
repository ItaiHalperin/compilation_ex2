package ast;
import java.util.ArrayList;
import java.util.List;

public class AstStmtList extends AstNode{
	public List<AstStmt> stmts = new ArrayList<AstStmt>();

	public AstStmtList(AstStmt stmt, int lineNumber) {
		super(lineNumber);
		stmts.add(stmt);
	}
	public void add(AstStmt stmt) {
		stmts.add(stmt);
	}
}