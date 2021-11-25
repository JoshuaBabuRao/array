package multidimensionalArray;

public class Spiral_Matrix {

  public static void main(String[] args)
  {

    int[][] a =new int[4][4];
    int i =1;
    


  //1
  int row =0;
  int col =0;
  while(col<a[row].length)
  {
  a[row][col]=i;
  i++;
  col++;  
  }
  row++;//1
  col--;//3
  
  
  //2
  while(row<a.length)
  {
    a[row][col]=i;
    i++;
    row++;

  } 
  row--;//3
  col--;//2
  
  
  //3  
  while(col>=0)
  {
    a[row][col]=i;
    i++;
    col--;
  }
  row--;//2
  col++;//0
  
  
  //4
  while(row>0)
  {
    a[row][col]=i;
    i++;
    row--;
  }
  row++;//1
  col++;//1
  
  //5
  while(col< a[row].length-1)
  {
    a[row][col]=i;
    i++;
    col++;
    
  }
  col--;//2 
  row++;//2
  
  //6
  while(col>0)
  {
    a[row][col]=i;
    col--;
  }
  
   
  
    
  
  int i1 =0;
  int j1 = 0;
  while(j1<a.length)
  {
  while(i1<a.length)
  {
    System.out.print(a[j1][i1]+"\t");
    i1++;
  }
    j1++;
    i1=0;
    System.out.println();
  }  
  }

}



/*
1	     2	    3  	4	
12	13	14	5	
11	15	15	6	
10	9  	8  	7	


*/