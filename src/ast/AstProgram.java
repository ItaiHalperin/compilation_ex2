package ast;

public class AstProgram extends AstNode
{
	public AstDec dec;
    public AstProgram program;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AstProgram(AstDec dec, AstProgram program, int line_number)
	{
		super(line_number);
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		serialNumber = AstNodeSerialNumber.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
        if(program == null){
		    System.out.format("====================== program -> dec\n");
        }
        else{
            System.out.format("====================== program -> dec program\n");
        }

		/*******************************/
		/* COPY INPUT DATA MEMBERS ... */
		/*******************************/
		this.dec = dec;
        this.program = program;
	}

	/************************************************/
	/* The printing message for an int exp AST node */
	/************************************************/
	public void printMe()
	{
		/**************************************/
		/* AST NODE TYPE = AST PROGRAM */
		/**************************************/
		System.out.print("AST NODE PROGRAM\n");

		/*************************************/
		/* RECURSIVELY PRINT DEC + PROGRAM ... */
		/*************************************/
		if (dec != null) dec.printMe();
		if (program != null) program.printMe();

		/**********************************/
		/* PRINT to AST GRAPHVIZ DOT file */
		/**********************************/
		AstGraphviz.getInstance().logNode(
				serialNumber,
			"PROGRAM\n");
		
		/****************************************/
		/* PRINT Edges to AST GRAPHVIZ DOT file */
		/****************************************/
		if (dec != null) AstGraphviz.getInstance().logEdge(serialNumber,dec.serialNumber);
		if (program != null) AstGraphviz.getInstance().logEdge(serialNumber,program.serialNumber);
	}
	
}
