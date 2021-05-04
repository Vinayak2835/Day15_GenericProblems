package com.generics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class MaximumTest {

	Maximum maximum;

    @Before
    public void setup() throws  Exception {
        maximum = new Maximum();
    }
    @Test
    public void Given_Max_Number_at_1st_Position_return_the_Same_Number() {
        Integer maximumResult=maximum.checkMaximum(5,4,3);
        Integer expected=5;
        Assert.assertEquals(expected,maximumResult);
    }
    @Test
    public void Given_Max_Number_at_2nd_Position_return_the_Same_Number(){
        Integer maximumResult=maximum.checkMaximum(4,5,3);
        Integer expected=5;
        Assert.assertEquals(expected,maximumResult);
    }
    @Test
    public void Given_Max_Number_at_3rd_Position_return_the_Same_Number() {
        Integer maximumResult=maximum.checkMaximum(3,4,5);
        Integer expected=5;
        Assert.assertEquals(expected,maximumResult);
    }
    @Test
    public void Given_Max_Float_at_1st_Position_return_the_Same_Float() {
        Float maximumResult=maximum.checkMaximum(5.5f,4.4f,3.3f);
        Float expectedResult=5.5f;
        Assert.assertEquals(expectedResult,maximumResult);
    }

    @Test
    public void Given_Max_Float_at_2nd_Position_return_the_Same_Float() {
        Float maximumResult=maximum.checkMaximum(4.4f,5.5f,3.3f);
        Float expectedResult=5.5f;
        Assert.assertEquals(expectedResult,maximumResult);
    }
    @Test
    public void Given_Max_Float_at_3rd_Position_return_the_Same_Float(){
        Float maximumResult=maximum.checkMaximum(4.4f,3.3f,5.5f);
        Float expectedResult=5.5f;
        Assert.assertEquals(expectedResult,maximumResult);
    }

    @Test
    public void Given_Max_String_at_1st_Position_return_the_Same_String() {
        String maximumResult=maximum.checkMaximum("Dog","Ant","Cat");
        Assert.assertEquals("Dog",maximumResult);
    }
    @Test
    public void Given_Max_String_at_2nd_Position_return_the_Same_String() {
        String maximumResult=maximum.checkMaximum("Ant","Dog","Cat");
        Assert.assertEquals("Dog",maximumResult);
    }

    @Test
    public void Given_Max_String_at_3rd_Position_return_the_Same_String() {
        String maximumResult = maximum.checkMaximum("Ant", "Cat", "Dog");
        Assert.assertEquals("Dog", maximumResult);
    }
    @Test
    public void givenInteger_ShouldReturnMaximumInteger() {
        Comparable maximumResult=maximum.checkMaximum(1,2,3);
        Assert.assertEquals(3,maximumResult);
    }
    @Test
    public void givenFloat_UsingGenericClass_ShouldReturnMaximumFloat() {
        Comparable maximumResult=maximum.checkMaximum(1.1,2.2,3.3);
        Assert.assertEquals(3.3,maximumResult);
    }
    @Test
    public void givenString_UsingGenericClass_ShouldReturnMaximumString(){
        Comparable maximumResult=maximum.checkMaximum("peach","orange","apple");
        Assert.assertEquals("peach",maximumResult);
    }
    @Test
    public void givenNIntegers_UsingMoreThanThreeParameters_ShouldReturnMaximumInteger() {
        Integer maximumResult=maximum.checkMaximum_With_MoreThan_ThreeParameters(1,2,3,4,5,6);
        Integer expectedResult=6;
        Assert.assertEquals(expectedResult,maximumResult);
    }
    @Test
    public void givenNFloats_UsingMoreThanThreeParameters_ShouldReturnMaximumFloat(){
        Float maximumResult=maximum.checkMaximum_With_MoreThan_ThreeParameters(1.1f,2.2f,3.3f,4.4f,5.5f);
        Float expectedResult=5.5f;
        Assert.assertEquals(expectedResult,maximumResult);
    }
    @Test
    public void givenNStrings_UsingMoreThanThreeParameters_ShouldReturnMaximumString(){
        String maximumResult=maximum.checkMaximum_With_MoreThan_ThreeParameters("Dog","Cat","Ant","Tiger");
        Assert.assertEquals("Tiger",maximumResult);
    }

}
