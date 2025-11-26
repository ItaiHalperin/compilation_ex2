package ast;

public class AstStmtWhile extends AstStmt
{
	public AstExp cond;
	public AstStmtList body;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AstStmtWhile(AstExp cond, AstStmtList body, int line_number)
	{
		super(line_number);
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		serialNumber = AstNodeSerialNumber.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
		System.out.print("====================== stmt -> WHILE LPAREN exp RPAREN LBRACE stmtList RBRACE\n");


		/*******************************/
		/* COPY INPUT DATA MEMBERS ... */
		/*******************************/
		this.cond = cond;
		this.body = body;
	}
	public void printMe()
	{
		/*************************************/
		/* AST NODE TYPE = AST WHILE STMT */
		/*************************************/
		System.out.print("AST NODE WHILE STMT\n");

		/**************************************/
		/* RECURSIVELY PRINT statements ... */
		/**************************************/
		cond.printMe();
		body.printMe();

		/***************************************/
		/* PRINT Node to AST GRAPHVIZ DOT file */
		/***************************************/
        AstGraphviz.getInstance().logNode(
                serialNumber,
            "WHILE_STMT");

		/****************************************/
		/* PRINT Edges to AST GRAPHVIZ DOT file */
		/****************************************/
		AstGraphviz.getInstance().logEdge(serialNumber,cond.serialNumber);
		AstGraphviz.getInstance().logEdge(serialNumber,body.serialNumber);

	}
}