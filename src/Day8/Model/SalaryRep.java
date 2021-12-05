package Day8.Model;

public class SalaryRep {
    private String regionName;
    private String countryName;
    private double minSal;
    private double maxSal;
    private double sumSal;
    private double avgSal;
    private double stdDev;

    public SalaryRep(String regionName, String countryName, double minSal, double maxSal, double sumSal, double avgSal, double stdDev) {
        this.regionName = regionName;
        this.countryName = countryName;
        this.minSal = minSal;
        this.maxSal = maxSal;
        this.sumSal = sumSal;
        this.avgSal = avgSal;
        this.stdDev = stdDev;
    }

    public String getRegionName() {
        return regionName;
    }

    public String getCountryName() {
        return countryName;
    }

    public double getMinSal() {
        return minSal;
    }

    public double getMaxSal() {
        return maxSal;
    }

    public double getSumSal() {
        return sumSal;
    }

    public double getAvgSal() {
        return avgSal;
    }

    public double getStdDev() {
        return stdDev;
    }

    @Override
    public String toString() {
        return "SalaryRep{" +
                "regionName='" + regionName + '\'' +
                ", countryName='" + countryName + '\'' +
                ", minSal=" + minSal +
                ", maxSal=" + maxSal +
                ", sumSal=" + sumSal +
                ", avgSal=" + avgSal +
                ", stdDev=" + stdDev +
                '}';
    }
}
