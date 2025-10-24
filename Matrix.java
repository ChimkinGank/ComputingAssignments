public class Matrix{
  private double[][] contents;

  public Matrix(int m, int n){
    contents=new double[m][n];
  }

  public Matrix(double[][] mat){
    int c = double[0].length;
    for (int i = 0; i<double.length; i){
      if (double[i].length!=c){
        throw IllegalArgumentException("Matrices are rectangular");
      }
    }
    contents=mat;
  }

  private void elem1(int a, int b){
    double[] k=contents[a];
    contents[a]=contents[b];
    contents[b]=k;
  }

  private void elem2(int a, int b, double k){
    for(int c=0; c<contents[a]; c++){
      contents[b][c]+=k*contents[a][c];
    }
  }

  private void elem3(int a, double k){
    for(int c=0; c<contents[a]; c++){
      contents[a][c]*=k;
    }
  }


}
