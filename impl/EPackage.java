package impl;

public class Package {
    PLASTIC("пластик"), GLASS("стекло");
    
    private final String name;     
    Package (String material) {
        this.material = material;

    }

    public String getMaterial() {
        return material;
    }

}
