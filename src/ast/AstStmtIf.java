package ast;

public class AstStmtIf extends AstStmt
{
	public AstExp cond;
	public AstStmtList body;
	public AstStmtElse e;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AstStmtIf(AstExp cond, AstStmtList body, AstStmtElse e, int line_number)
	{
		super(line_number);

		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		serialNumber = AstNodeSerialNumber.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
        if(e == null){
		    System.out.print("====================== stmt -> IF LPAREN exp RPAREN LBRACE stmtList RBRACE\n");
        }
        else{
		    System.out.print("====================== stmt -> IF LPAREN exp RPAREN LBRACE stmtList RBRACE elseStmt\n");

        }

		/*******************************/
		/* COPY INPUT DATA MEMBERS ... */
		/*******************************/
		this.cond = cond;
		this.body = body;
		this.e = e;

	}
	public void printMe()
	{
		/*************************************/
		/* AST NODE TYPE = AST IF STMT */
		/*************************************/
		System.out.print("AST NODE IF STMT\n");

		/**************************************/
		/* RECURSIVELY PRINT statements ... */
		/**************************************/
		cond.printMe();
		body.printMe();
		if(e != null) e.printMe();

		/***************************************/
		/* PRINT Node to AST GRAPHVIZ DOT file */
		/***************************************/
        AstGraphviz.getInstance().logNode(
                serialNumber,
            "IF_STMT");

		/****************************************/
		/* PRINT Edges to AST GRAPHVIZ DOT file */
		/****************************************/
		AstGraphviz.getInstance().logEdge(serialNumber,cond.serialNumber);
		AstGraphviz.getInstance().logEdge(serialNumber,body.serialNumber);
		if(e != null) AstGraphviz.getInstance().logEdge(serialNumber,e.serialNumber);

	}
}