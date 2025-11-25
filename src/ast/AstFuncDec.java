package ast;
public class AstFuncDec extends AstDec
{
	public AstType type;
	public String id;
	public AstParamList parameters;
    public AstStmtList statements;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AstFuncDec(AstType type, String id, AstParamList parameters, AstStmtList statements, int line_number)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		serialNumber = AstNodeSerialNumber.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
        if(parameters == null){
		    System.out.print("====================== dec -> type ID LPAREN RPAREN LBRACE stmtList RBRACE\n");
        }
        else{
            System.out.print("====================== dec -> type ID LPAREN paramList RPAREN LBRACE stmtList RBRACE\n");
        }

		/*******************************/
		/* COPY INPUT DATA MEMBERS ... */
		/*******************************/
        this.type = type;
		this.id = left;
		this.parameters = parameters;
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
		System.out.print("AST NODE FUNC DEC\n");

		/**************************************/
		/* RECURSIVELY PRINT type + id + type + parameters + statements ... */
		/**************************************/
        type.printMe();
		if (parameters != null) pramaters.printMe();
		statements.printMe();
		
		/***************************************/
		/* PRINT Node to AST GRAPHVIZ DOT file */
		/***************************************/
		AstGraphviz.getInstance().logNode(
				serialNumber,
			String.format("FUNC_DEC(%s)",id));
		
		/****************************************/
		/* PRINT Edges to AST GRAPHVIZ DOT file */
		/****************************************/
		AstGraphviz.getInstance().logEdge(serialNumber,type.serialNumber);
		if (paramaters  != null) AstGraphviz.getInstance().logEdge(serialNumber,parameters.serialNumber);
		AstGraphviz.getInstance().logEdge(serialNumber,statements.serialNumber);
	}
}
