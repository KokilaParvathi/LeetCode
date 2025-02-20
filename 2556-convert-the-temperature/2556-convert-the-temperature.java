class Solution {
    public double[] convertTemperature(double Celsius) {
      double[] arr = new double[2];

      arr[0] = Celsius + 273.15;
      arr[1] = Celsius * 1.80 + 32.00;

        return arr;
    }
}