package ast;

public class AstArrayTypedef extends AstDec
{
	public AstType type;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AstArrayTypedef(AstType type, int line_number)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		serialNumber = AstNodeSerialNumber.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/

        System.out.print("====================== dec -> ARRAY ID EQ type LBRACK RBRACK SEMICOLON\n");

		/*******************************/
		/* COPY INPUT DATA MEMBERS ... */
		/*******************************/
        this.type = type;
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
		System.out.print("AST NODE ARRAY TYPE DEF\n");

		/**************************************/
		/* RECURSIVELY PRINT type ... */
		/**************************************/
        type.printMe();
		
		/***************************************/
		/* PRINT Node to AST GRAPHVIZ DOT file */
		/***************************************/
        AstGraphviz.getInstance().logNode(
                serialNumber,
            String.format("ARRAY_DEF(%s)",type.type));

		/****************************************/
		/* PRINT Edges to AST GRAPHVIZ DOT file */
		/****************************************/
		AstGraphviz.getInstance().logEdge(serialNumber,type.serialNumber);
	}
}
