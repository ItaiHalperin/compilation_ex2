package ast;
public class AstExpString extends AstExp{
    public String value;
    public AstExpString(String value, int lineNumber) {
        super(lineNumber);
        this.value = value;
    }
    
}
