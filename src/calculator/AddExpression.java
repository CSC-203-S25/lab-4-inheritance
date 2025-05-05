package calculator;

public class AddExpression extends BinaryExpression
{


   public AddExpression(final Expression lft, final Expression rht)
   {
      super(lft, rht, " + ");
   }

   protected double applyOperator(double lftOprnt, double rhtOprnt)
   {
      return lftOprnt + rhtOprnt;
   }

}
