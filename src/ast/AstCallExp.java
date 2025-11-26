package ast;

public class AstCallExp extends AstExp{
    public AstVar var;
    public String id;
    public AstExpList exp_list;
    public AstCallExp(AstVar var, String id, AstExpList exp_list, int line_number) {
        super(line_number);
        /******************************/
        /* SET A UNIQUE SERIAL NUMBER */
        /******************************/
        serialNumber = AstNodeSerialNumber.getFresh();

        /***************************************/
        /* PRINT CORRESPONDING DERIVATION RULE */
        /***************************************/
        String message = "====================== callExp -> ";
        if(var != null){
            message += "var DOT ";
        }
        message += "ID LPAREN ";
        if(exp_list != null) {
            message += "expList";
        }
        message += " RPAREN\n";
        System.out.print(message);

        /*******************************/
        /* COPY INPUT DATA MEMBERS ... */
        /*******************************/
        this.var = var;
        this.id = id;
        this.exp_list = exp_list;
    }
    /*************************************************/
    /* The printing message for a call expression AST node */
    /*************************************************/
    public void printMe()
    {
        /*********************************/
        /* AST NODE TYPE = AST CALL EXPRESSION */
        /*********************************/
        System.out.print("AST NODE CALL EXP\n");

        /**********************************************/
        /* RECURSIVELY PRINT VAR, then FIELD NAME ... */
        /**********************************************/
        if (var != null) var.printMe();
        if (exp_list != null) exp_list.printMe();

        System.out.format("CALL EXP %s\n",id);

        /***************************************/
        /* PRINT Node to AST GRAPHVIZ DOT file */
        /***************************************/
        AstGraphviz.getInstance().logNode(
                serialNumber,
                String.format("CALL\nEXP\n...->%s",id));

        /****************************************/
        /* PRINT Edges to AST GRAPHVIZ DOT file */
        /****************************************/
        if (var != null) AstGraphviz.getInstance().logEdge(serialNumber,var.serialNumber);
        if (exp_list != null) AstGraphviz.getInstance().logEdge(serialNumber,exp_list.serialNumber);
    }
}
