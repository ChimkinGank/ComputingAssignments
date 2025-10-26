public class Matrix{
  private double[][] contents;
  private int rows;
  private int columns;

  public String toString(){
    String returned = "";
    for (int i=0; i<rows; i++){
      returned+="[";
      for (int j=0; i<columns; j++){
        returned+=contents[i][j]+", ";
      }
      returned+=contents[i][columns]+"]"+"\n";
    }
    return returned;
  }

  public Matrix(int m, int n){
    contents=new double[m][n];
    rows=m;
    columns=n;
  }

  public Matrix(double[][] mat){
    int c = contents[0].length;
    for (int i = 0; i<contents.length; i++){
      if (contents[i].length!=c){
        throw new IllegalArgumentException("Matrices are rectangular");
      }
    }
    contents=mat;
    rows=contents.length;
    columns=contents[0].length;
  }

  private void elem1(int a, int b){
    double[] k=contents[a];
    contents[a]=contents[b];
    contents[b]=k;
  }

  private void elem2(int a, int b, double k){
    for(int c=0; c<columns; c++){
      contents[b][c]+=k*contents[a][c];
    }
  }

  private void elem3(int a, double k){
    for(int c=0; c<columns; c++){
      contents[a][c]*=k;
    }
  }


}
