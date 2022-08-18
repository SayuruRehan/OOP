//S.R.Bopitiya - IT21470004 - Malabe - G8.1
//OOP Assignment 1 - Q2

import java.util.Random;

public class RandNum{
    int[][] num = new int [5][5];
    int minNum = 101;
    int maxNum = 0;
    double avgValue;
  
    //constructor RandNum
    public RandNum(){
      
      Random rand1 = new Random();
  
      for(int i = 0; i < 5; i++)
      {
        for(int j = 0; j < 5; j++)
        {
          int randInt = rand1.nextInt(100);
          num[i][j] = randInt + 1;
        }
      }
    }
  
  
  //Calculating minimum, maximum, average
  public void calculateValues()
  {
    int sum = 0;
    int count = 0;
  
    for(int i = 0; i < 5; i++)
    {
      for(int j = 0; j < 5; j++)
      {
        //minimum number
        if(minNum > num[i][j])
        {
          minNum = num[i][j];
        }
  
        //maximum number
        if(maxNum < num[i][j])
        {
          maxNum = num[i][j];
        }
  
        //calculate sum of 25 numbers
        sum = sum + num[i][j];
        count++;
      }
    }
    //calculate average
    avgValue = sum / (double)count;
  }
  
  public int getmin()
  {
    return minNum;
  }
  
  public int getmax()
  {
    return maxNum;
  }
  
  public double getavg()
  {
    return avgValue;
  }
  
  //display values
  public void displayValues(int minNo, int maxNo, double average)
  {
    System.out.println("Array Values: ");
  
    for(int i = 0; i < 5; i++)
    {
      for(int j = 0; j < 5; j++)
      {
          //display values in array
          System.out.print(num[i][j] + "\t");
      }
      //new line
      System.out.println();
    }
    System.out.println("\n--------------------");
    System.out.println("\nMinimum Number = " + minNo);
    System.out.println("\nMaximum Number = " + maxNo);
    System.out.println("\nAverage = " + average);
  }
}


