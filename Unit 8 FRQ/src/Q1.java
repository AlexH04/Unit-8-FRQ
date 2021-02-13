public class Q1 {
    public class Plot

    {

        private String cropType;

        private int cropYield;



        public Plot(String crop, int yield)

        {

            /* implementation not shown */

        }



        public String getCropType()

        {

            return cropType;

        }



        public int getCropYield()

        {

            return cropYield;

        }

    }
    ////////////////////////////////////////////////////
    public class ExperimentalFarm {

        private Plot[][] farmPlots;


        public ExperimentalFarm(Plot[][] p) {

            /* implementation not shown */

        }


        /**
         * Returns the plot with the highest yield for a given crop type, as described in part (a).
         */

        public Plot getHighestYield(String c) {
            int max = 0;
            int maxr = 0,  maxc = 0;
            for (int i = 0; i < farmPlots.length; i++) {
                for (int j = 0; j < farmPlots[0].length; j++) {
                    if (farmPlots[i][j].cropType.equals(c)) {
                        if (farmPlots[i][j].cropYield > max) {
                            max = farmPlots[i][j].cropYield;
                            maxr = i;
                            maxc = j;
                        }
                    }
                }
            }
            return farmPlots[maxr][maxc];
        }


        /**
         * Returns true if all plots in a given column in the two-dimensional array farmPlots
         * <p>
         * contain the same type of crop, or false otherwise, as described in part (b).
         */

        public boolean sameCrop(int col) {
            for (int i = 1; i < farmPlots.length; i++) {
                if (!(farmPlots[i][col].cropType.equals(farmPlots[i - 1][col]))) {
                    return false;
                }
            }

            return true;
        }
    }
}
