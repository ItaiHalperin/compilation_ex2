package ast;

public class AstVarDec extends AstDec
{
	public AstType type;
    public String id;
	public AstExp e;
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AstVarDec(AstType type, String id, AstExp e, int line_number)
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
			System.out.print("====================== varDec -> type ID SEMICOLON\n");
		}
		else if(e instanceof AstNewExp){
			System.out.print("====================== varDec -> type ID ASSIGN newExp SEMICOLON\n");
		}
		else{
			System.out.print("====================== varDec -> type ID ASSIGN exp SEMICOLON\n");
		}
		/*******************************/
		/* COPY INPUT DATA MEMBERS ... */
		/*******************************/
        this.type = type;
		this.id = id;
		this.e = e;
	}
	
	/*************************************************/
	/* The printing message for a var dec AST node */
	/*************************************************/
	public void printMe()
	{
		/*************************************/
		/* AST NODE TYPE = AST VAR DEC */
		/*************************************/
		System.out.print("AST NODE VAR DEC\n");

		/**************************************/
		/* RECURSIVELY PRINT type ... */
		/**************************************/
        type.printMe();
		if(e != null) e.printMe();
		
		/***************************************/
		/* PRINT Node to AST GRAPHVIZ DOT file */
		/***************************************/
        AstGraphviz.getInstance().logNode(
                serialNumber,
            String.format("VAR\nDEC(%s)",type.type));

		/****************************************/
		/* PRINT Edges to AST GRAPHVIZ DOT file */
		/****************************************/
		AstGraphviz.getInstance().logEdge(serialNumber,type.serialNumber);
		if(e != null) AstGraphviz.getInstance().logEdge(serialNumber,e.serialNumber);
	}
}
