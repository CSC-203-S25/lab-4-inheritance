package calculator;
public class SubtractExpression
   extends BinaryExpression
{

   public SubtractExpression(final Expression lft, final Expression rht)
   {
      super(lft, rht);

   }

   @Override
   protected double applyOperator(double lftOprnt, double rhtOprnt) {
      return lftOprnt - rhtOprnt;

   }
}

