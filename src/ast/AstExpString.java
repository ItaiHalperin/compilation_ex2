package ast;

public class AstExpString extends AstExp{
    public String value;

    /******************/
    /* CONSTRUCTOR(S) */
    /******************/
    public AstExpString(String value, int line_number)
    {
        super(line_number);
        /******************************/
        /* SET A UNIQUE SERIAL NUMBER */
        /******************************/
        serialNumber = AstNodeSerialNumber.getFresh();

        /***************************************/
        /* PRINT CORRESPONDING DERIVATION RULE */
        /***************************************/
        System.out.format("====================== exp -> INT( %s )\n", value);

        /*******************************/
        /* COPY INPUT DATA MEMBERS ... */
        /*******************************/
        this.value = value;
    }

    /************************************************/
    /* The printing message for a string exp AST node */
    /************************************************/
    public void printMe()
    {
        /*******************************/
        /* AST NODE TYPE = AST STRING EXP */
        /*******************************/
        System.out.format("AST NODE INT( %s )\n",value);

        /*********************************/
        /* Print to AST GRAPHVIZ DOT file */
        /*********************************/
        AstGraphviz.getInstance().logNode(
                serialNumber,
                String.format("INT(%s)",value));
    }
}
