//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AssignmentOperatorsDemo{
    public static void main(String args[]) {
        //assigning primitive values below
        int j,k;
        j = 10;// j is given the value of 10
        j = 5; //j is given a new value of 5. this overwrites 10;
        k = j; //k is given the value of 5. Which is j

        //Below is the answer to the equation given above. it will be the first two values

        System.out.println("j is" + j);
        System.out.println("k is :" +k);
        k = j = 10;
        System.out.println("j is :" +j);
        System.out.println("k is: " +k);
    }
}
