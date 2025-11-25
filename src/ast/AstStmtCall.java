public class AstStmtCall extends AstStmt{
    public AstCallExp c;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AstStmtIf(AstCallExp c, int line_number)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		serialNumber = AstNodeSerialNumber.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
        System.out.print("====================== stmt -> callExp SEMICOLON\n");

		/*******************************/
		/* COPY INPUT DATA MEMBERS ... */
		/*******************************/
		this.c = c
		super(line_number);

	}
	public void printMe()
	{
		/*************************************/
		/* AST NODE TYPE = AST CALL STMT */
		/*************************************/
		System.out.print("AST NODE CALL STMT\n");

		/**************************************/
		/* RECURSIVELY PRINT statements ... */
		/**************************************/
		c.printMe();

		/***************************************/
		/* PRINT Node to AST GRAPHVIZ DOT file */
		/***************************************/
        AstGraphviz.getInstance().logNode(
                serialNumber,
            "CALL_STMT");

		/****************************************/
		/* PRINT Edges to AST GRAPHVIZ DOT file */
		/****************************************/
		AstGraphviz.getInstance().logEdge(serialNumber,c.serialNumber);
	}
}
