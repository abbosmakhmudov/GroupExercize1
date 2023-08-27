public class T1WeeklyTemperatures {
    public static void main(String[] args) {
        int [] weeklyTemperetures={78,80,82,95,90,86,81};
        int highestTemperature=weeklyTemperetures[1];
        int lowestTemperature=weeklyTemperetures[0];
        for (int i = 0; i <weeklyTemperetures.length ; i++) {
            if(weeklyTemperetures[i]>=highestTemperature){
                highestTemperature=weeklyTemperetures[i];
            }
            if(weeklyTemperetures[i]<=lowestTemperature){
                lowestTemperature=weeklyTemperetures[i];
            }
        }
        System.out.println(highestTemperature);
        System.out.println(lowestTemperature);
    }
}
