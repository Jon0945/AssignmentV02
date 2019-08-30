package Se.Lexicon;

import org.junit.Assert;
import org.junit.Test;

public class AppTest
{
    //Tests Addition method in main App
    @Test
    public void additionTest()
    {
        //Arrange
        double expextedResult = 50;
        double selection1 = 25;
        double selection2 = 25;

        //Act
        double actualResult = App.addition(selection1, selection2);

        //Assert
        Assert.assertEquals(expextedResult, actualResult, 0);
    }

    //Test subtraction method in main App
    @Test
    public void subtractionTest()
    {
        //Arrange
        double expextedResult = 50;
        double selection1 = 100;
        double selection2 = 50;

        //Act
        double actualResult = App.subtraction(selection1, selection2);

        //Assert
        Assert.assertEquals(expextedResult, actualResult, 0);
    }

    //Test multiplication method in main App
    @Test
    public void multiplicationTest()
    {
        //Arrange
        double expextedResult = 36;
        double selection1 = 6;
        double selection2 = 6;

        //Act
        double actualResult = App.multiplication(selection1, selection2);

        //Assert
        Assert.assertEquals(expextedResult, actualResult, 0);
    }

    //Test the division method in main App
    @Test
    public void divisionTest()
    {
        //Arrange
        double expextedResult = 10;
        double selection1 = 50;
        double selection2 = 5;

        //Act
        double actualResult = App.division(selection1, selection2);

        //Assert
        Assert.assertEquals(expextedResult, actualResult, 0);
    }

    //Test the division method in main App for divide by zero on selection1
    @Test
    public void divisionbyZeroTest1()  {
        //Arrange
        double expectedResult = 0;
        double selection1 = 0;
        double selection2 = 3;

        //Act
        double actualResult = App.division(selection1, selection2);

        //Assert
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    //Test the division method in main App for divide by zero on selection2
    @Test
    public void divisionbyZeroTest2()  {
        //Arrange
        double selection1 = 3;
        double selection2 = 0;

        //Act
        double actualResult = App.division(selection1, selection2);

        //Assert
        Assert.assertTrue(Double.isInfinite(actualResult));
    }

    //Test the division method in main App for divide by zero on both selection1 and selection2
    @Test
    public void divisionbyZeroTest3() {
        //Arrange
        double selection1 = 0;
        double selection2 = 0;

        //Act
        double actualResult = App.division(selection1, selection2);

        //Assert
        Assert.assertTrue(Double.isNaN(actualResult));
    }

    //Test the overloaded method for Array Addition
    @Test
    public void additionArrayTest() {
        //Arrange
        double[] array = {54, 35, 45, 66};
        double expectedResult = 200;

        //Act
        double actualResult = App.addition(array);

        //Assert
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    //Test the overloaded method for Array Subtraction
    @Test
    public void subtractionArrayTest() {
        //Arrange
        double[] array = {54, 35, 45, 66};
        double expectedResult = -146;

        //Act
        double actualResult = App.subtraction(array);

        //Assert
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

}

