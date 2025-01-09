public class Heros {
    // max hp
    private static final int[][] ARC_TAB = new int[9][10];
    private static final int[][] WAR_TAB = new int[9][10];
    private static final int[][] MAG_TAB = new int[9][10];

    private static final int ROW_MAX_HP = 0;
    private static final int ROW_MAX_MP = 1;
    private static final int ROW_PA = 2;
    private static final int ROW_PD = 3;
    private static final int ROW_MA = 4;
    private static final int ROW_MD = 5;
    private static final int ROW_AG = 6;
    private static final int ROW_CC = 7;
    private static final int ROW_CD = 8;

    static {
    ARC_TAB[0] = new int[] {110, 130, 150, 170, 190, 210, 230, 250, 270, 290};
    ARC_TAB[1] = new int[] {120, 140, 160, 180, 200, 220, 240, 260, 280, 300};
    ARC_TAB[2] = new int[] {25, 35, 45, 55, 65, 75, 85, 95, 105, 115};
    ARC_TAB[3] = new int[] {20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
    ARC_TAB[4] = new int[] {25, 35, 45, 55, 65, 75, 85, 95, 105, 115};
    ARC_TAB[5] = new int[] {20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
    ARC_TAB[6] = new int[] {100, 110, 120, 130, 140, 150, 160, 170, 180, 190};
    ARC_TAB[7] = new int[] {100, 110, 120, 130, 140, 150, 160, 170, 180, 190};
    ARC_TAB[8] = new int[] {45, 55, 65, 75, 85, 95, 105, 115, 125, 135};

    WAR_TAB[0] = new int[] {120, 140, 160, 180, 200, 220, 240, 260, 280, 300};
    WAR_TAB[1] = new int[] {100, 120, 140, 160, 180, 200, 220, 240, 260, 280};
    WAR_TAB[2] = new int[] {30, 40, 50, 60, 70, 80, 90, 100, 110, 120};
    WAR_TAB[3] = new int[] {25, 35, 45, 55, 65, 75, 85, 95, 105, 115};
    WAR_TAB[4] = new int[] {20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
    WAR_TAB[5] = new int[] {15, 25, 35, 45, 55, 65, 75, 85, 95, 105};
    WAR_TAB[6] = new int[] {80, 90, 100, 110, 120, 130, 140, 150, 160, 170};
    WAR_TAB[7] = new int[] {90, 100, 110, 120, 130, 140, 150, 160, 170, 180};
    WAR_TAB[8] = new int[] {60, 70, 80, 90, 100, 110, 120, 130, 140, 150};

    MAG_TAB[0] = new int[] {100, 120, 140, 160, 180, 200, 220, 240, 260, 280};
    MAG_TAB[1] = new int[] {110, 130, 150, 170, 190, 210, 230, 250, 270, 290};
    MAG_TAB[2] = new int[] {20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
    MAG_TAB[3] = new int[] {15, 25, 35, 45, 55, 65, 75, 85, 95, 105};
    MAG_TAB[4] = new int[] {30, 40, 50, 60, 70, 80, 90, 100, 110, 120};
    MAG_TAB[5] = new int[] {25, 35, 45, 55, 65, 75, 85, 95, 105, 115};
    MAG_TAB[6] = new int[] {70, 80, 90, 100, 110, 120, 130, 140, 150, 160};
    MAG_TAB[7] = new int[] {70, 80, 90, 100, 110, 120, 130, 140, 150, 160};
    MAG_TAB[8] = new int[] {35, 45, 55, 65, 75, 85, 95, 105, 115, 125};
    }

    public static int getMaxHp(Role role, int level) {
        switch (role) {
            case ARCHER:
                return ARC_TAB[0][level - 1];
            case WARRIOR:
                return WAR_TAB[0][level - 1];
            case MAGE:
                return MAG_TAB[0][level - 1];
            default:
                break;
        }
        return -1;
    }

    public static int getMaxMp(Role role, int level) {
        switch (role) {
            case ARCHER:
                return ARC_TAB[1][level - 1];
            case WARRIOR:
                return WAR_TAB[1][level - 1];
            case MAGE:
                return MAG_TAB[1][level - 1];
            default:
                break;
        }
        return -1;
    }

    public static int getPa(Role role, int level) {
        switch (role) {
            case ARCHER:
                return ARC_TAB[2][level - 1];
            case WARRIOR:
                return WAR_TAB[2][level - 1];
            case MAGE:
                return MAG_TAB[2][level - 1];
            default:
                break;
        }
        return -1;
    }

    public static int getPd(Role role, int level) {
        switch (role) {
            case ARCHER:
                return ARC_TAB[3][level - 1];
            case WARRIOR:
                return WAR_TAB[3][level - 1];
            case MAGE:
                return MAG_TAB[3][level - 1];
            default:
                break;
        }
        return -1;
    }

    public static int getMa(Role role, int level) {
        switch (role) {
            case ARCHER:
                return ARC_TAB[4][level - 1];
            case WARRIOR:
                return WAR_TAB[4][level - 1];
            case MAGE:
                return MAG_TAB[4][level - 1];
            default:
                break;
        }
        return -1;
    }

    public static int getMd(Role role, int level) {
        switch (role) {
            case ARCHER:
                return ARC_TAB[5][level - 1];
            case WARRIOR:
                return WAR_TAB[5][level - 1];
            case MAGE:
                return MAG_TAB[5][level - 1];
            default:
                break;
        }
        return -1;
    }

    public static int getAg(Role role, int level) {
        switch (role) {
            case ARCHER:
                return ARC_TAB[6][level - 1];
            case WARRIOR:
                return WAR_TAB[6][level - 1];
            case MAGE:
                return MAG_TAB[6][level - 1];
            default:
                break;
        }
        return -1;
    }

    public static int getCc(Role role, int level) {
        switch (role) {
            case ARCHER:
                return ARC_TAB[7][level - 1];
            case WARRIOR:
                return WAR_TAB[7][level - 1];
            case MAGE:
                return MAG_TAB[7][level - 1];
            default:
                break;
        }
        return -1;
    }

    public static int getCd(Role role, int level) {
        switch (role) {
            case ARCHER:
                return ARC_TAB[8][level - 1];
            case WARRIOR:
                return WAR_TAB[8][level - 1];
            case MAGE:
                return MAG_TAB[8][level - 1];
            default:
                break;
        }
        return -1;
    }
}
