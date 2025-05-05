package calculator;

public class DivideExpression extends BinaryExpression
{

   public DivideExpression(final Expression lft, final Expression rht)
   {
      super(lft, rht);
   }

   @Override
   protected double applyOperator(double lftOprnt, double rhtOprnt) {
      return lftOprnt / rhtOprnt;
   }
}

