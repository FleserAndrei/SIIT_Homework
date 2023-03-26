import java.time.LocalTime;

public class Athlete {
    private int athleteNumber;
    private String athleteName;
    private String countryCode;
    private LocalTime skiTime;
    private String firstShootingRange;
    private String secondShootingRange;
    private String thirdShootingRange;

    public int getAthleteNumber() {
        return athleteNumber;
    }

    public void setAthleteNumber(int athleteNumber) {
        this.athleteNumber = athleteNumber;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public LocalTime  getSkiTime() {
        return skiTime;
    }

    public void setSkiTime(LocalTime  skiTime) {
        this.skiTime = skiTime;
    }

    public String getFirstShootingRange() {
        return firstShootingRange;
    }

    public void setFirstShootingRange(String firstShootingRange) {
        this.firstShootingRange = firstShootingRange;
    }

    public String getSecondShootingRange() {
        return secondShootingRange;
    }

    public void setSecondShootingRange(String secondShootingRange) {
        this.secondShootingRange = secondShootingRange;
    }

    public String getThirdShootingRange() {
        return thirdShootingRange;
    }

    public void setThirdShootingRange(String thirdShootingRange) {
        this.thirdShootingRange = thirdShootingRange;
    }

    public LocalTime getFinalTime(){
        int count = 0;
        count += this.firstShootingRange.length() - this.firstShootingRange.replace("o", "").length();
        count += this.secondShootingRange.length() - this.secondShootingRange.replace("o", "").length();
        count += this.thirdShootingRange.length() - this.thirdShootingRange.replace("o", "").length();

        LocalTime finishTime = this.skiTime.plusSeconds(10 * count);

        return finishTime;

    }

    public Athlete(int athleteNumber, String athleteName, String countryCode, LocalTime skiTime, String firstShootingRange, String secondShootingRange, String thirdShootingRange) {
        this.athleteNumber = athleteNumber;
        this.athleteName = athleteName;
        this.countryCode = countryCode;
        this.skiTime = skiTime;
        this.firstShootingRange = firstShootingRange;
        this.secondShootingRange = secondShootingRange;
        this.thirdShootingRange = thirdShootingRange;
    }
    /* write a software that takes as an input a CSV file where every entry represents the results of a biathlon athlete
    based on the entries identify the first 3 places (Winner, Runner-up and Third Place)
    the rules are simple, each athlete has a time-results for the entire skiing session, and 3 shooting range results
    each shooting range has 5 shot results
for every missed shot the athlete obtains a 10 second penalty which affects the final time-result
    final standings are based on the time-results that have been updated with the shooting range results
    CSV example

11,Umar Jorgson,SK,30:27,xxxox,xxxxx,xxoxo

1,Jimmy Smiles,UK,29:15,xxoox,xooxo,xxxxo

27,Piotr Smitzer,CZ,30:10,xxxxx,xxxxx,xxxxx

            COLUMNS

    AthleteNumber,AthleteName,CountryCode,SkiTimeResult(Minutes:Seconds),FirstShootingRange,SecondShooting,ThirdShooting

    every shooting range consists of 5 characters, where x means hit, o mean miss
for every o there should be 10 seconds added to the final time
            RESULTS

    Winner - Piotr Smitzer 30:10 (30:10 + 0)

    Runner-up - Jimmy Smiles 30:15 (29:15 + 60)

    Third Place - Umar Jorgson 30:57 (30:27 + 30)

    TASK

    write tests for the CSV parsing and the standing calculation

    in your tests you must not use real files

    make sure the CSVs are read from memory to keep the tests fast

    use Comparator / Comparable for sorting

    use at least 1 Enum (in any situation) and at least 2 Annotations (they don't need to be custom)

    */


}
