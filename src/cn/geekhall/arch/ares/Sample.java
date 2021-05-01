package cn.geekhall.arch.ares;

/**
 * @author yiny
 * @Type Sample.java
 * @Desc
 * @date 5/1/21 11:51 AM
 */
public abstract class Sample implements IExecutable{
    private PatternType patternType;
    private String patternName;

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    private String englishName;

    public PatternType getPatternType() {
        return patternType;
    }

    public void setPatternType(PatternType patternType) {
        this.patternType = patternType;
    }

    public String getPatternName() {
        return patternName;
    }

    public void setPatternName(String patternName) {
        this.patternName = patternName;
    }

    @Override
    public String toString() {
        String tempPatternType = null;
        switch (patternType){
            case CREATION:
                tempPatternType = "创建型模式";
                break;
            case STRUCTURE:
                tempPatternType = "结构型模式";
                break;
            case BEHAVIOR:
                tempPatternType = "行为型模式";
                break;
        }

        return tempPatternType + patternName + "( " + englishName + " )";
    }
}
