package ast;

public class AstStmtElse extends AstStmt
{
    public AstStmtList statements;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AstStmtElse(AstStmtList statements, int line_number)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		serialNumber = AstNodeSerialNumber.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/

        System.out.print("====================== elseStmt -> ELSE LBRAC stmtList RBRACE\n");


		/*******************************/
		/* COPY INPUT DATA MEMBERS ... */
		/*******************************/
		this.statements = statements;
        super(line_number);
	}
	
	/*************************************************/
	/* The printing message for a binop exp AST node */
	/*************************************************/
	public void printMe()
	{
		/*************************************/
		/* AST NODE TYPE = AST FUNC DEC */
		/*************************************/
		System.out.print("AST NODE ELSE STMT\n");

		/**************************************/
		/* RECURSIVELY PRINT statements ... */
		/**************************************/
		statements.printMe();
		
		/***************************************/
		/* PRINT Node to AST GRAPHVIZ DOT file */
		/***************************************/
        AstGraphviz.getInstance().logNode(
                serialNumber,
            "ELSE_STMT");

		/****************************************/
		/* PRINT Edges to AST GRAPHVIZ DOT file */
		/****************************************/
		AstGraphviz.getInstance().logEdge(serialNumber,statements.serialNumber);
	}
}
