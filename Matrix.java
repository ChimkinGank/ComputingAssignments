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


}
