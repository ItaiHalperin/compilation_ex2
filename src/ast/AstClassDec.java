package ast;

public class AstClassDec extends AstDec  {
    public String className;
    public AstClassFieldList fields;
    public String superClass;

    public AstClassDec(String className, String superClass, AstClassFieldList fields, int lineNumber) {
        super(lineNumber);
        this.className = className;
        this.fields = fields;
        this.superClass = superClass;
    }
    
}
