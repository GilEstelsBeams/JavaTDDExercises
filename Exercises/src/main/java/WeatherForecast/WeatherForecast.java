package WeatherForecast;

import java.util.Arrays;

public class WeatherForecast {
private double rainRain;
private double rainSun;
private double sunSun;
private double sunRain;

public WeatherForecast(){

}


private boolean checkProbabilities(){
    double[] checks= new double[] {rainSun+rainRain, rainRain+sunRain, sunRain+sunSun, rainSun+sunSun};
    double[] checksTrue= new double[] {1.0,1.0,1.0,1.0};
    return Arrays.equals(checks,checksTrue);
}
}
