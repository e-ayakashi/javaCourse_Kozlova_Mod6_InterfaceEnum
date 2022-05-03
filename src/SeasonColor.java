public enum SeasonColor {
    Winter("White"),
    Spring ("Blue"),
    Summer ("Green"),
    Autumn ("Orange");

    private String color;

    SeasonColor (String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
