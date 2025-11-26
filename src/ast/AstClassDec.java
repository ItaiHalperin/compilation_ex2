package ast;

public class AstClassDec extends AstDec
{
	public String id;
	public String parent;
	public AstCFieldList c_fields;
    public AstStmtList statements;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AstClassDec(String id, String parent, AstCFieldList c_fields, int line_number)
	{
        super(line_number);
        /******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		serialNumber = AstNodeSerialNumber.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
        if(parent == null){
		    System.out.print("====================== dec -> CLASS ID LBRACE cFieldList RBRACE\n");
        }
        else{
            System.out.print("====================== dec -> CLASS ID EXTENDS ID LBRACE cFieldList RBRACE\n");
        }

		/*******************************/
		/* COPY INPUT DATA MEMBERS ... */
		/*******************************/
        this.id = id;
		this.parent = parent;
		this.c_fields = c_fields;
	}
	
	/*************************************************/
	/* The printing message for a binop exp AST node */
	/*************************************************/
	public void printMe()
	{
		/*************************************/
		/* AST NODE TYPE = AST FUNC DEC */
		/*************************************/
		System.out.print("AST NODE CLASS DEC\n");

		/**************************************/
		/* RECURSIVELY PRINT c_fields + statements ... */
		/**************************************/
        c_fields.printMe();

		/***************************************/
		/* PRINT Node to AST GRAPHVIZ DOT file */
		/***************************************/
        if(parent == null){
            AstGraphviz.getInstance().logNode(
                    serialNumber,
                String.format("CLASS_DEC(%s)",id));
        }
        else {
            AstGraphviz.getInstance().logNode(
                    serialNumber,
                String.format("CLASS_DEC(%s extends %s)",id, parent));
        }
		/****************************************/
		/* PRINT Edges to AST GRAPHVIZ DOT file */
		/****************************************/
		AstGraphviz.getInstance().logEdge(serialNumber,c_fields.serialNumber);
	}
}
