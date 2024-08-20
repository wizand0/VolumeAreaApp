package ru.wizand.volumeareaapp;

public class FormulaClass {

    int formulaImg;
    String formulaName;

    public FormulaClass(int formulaImg, String formulaName) {
        this.formulaImg = formulaImg;
        this.formulaName = formulaName;
    }

    public int getFormulaImg() {
        return formulaImg;
    }

    public void setFormulaImg(int formulaImg) {
        this.formulaImg = formulaImg;
    }

    public String getFormulaName() {
        return formulaName;
    }

    public void setFormulaName(String shapeName) {
        this.formulaName = shapeName;
    }
}
