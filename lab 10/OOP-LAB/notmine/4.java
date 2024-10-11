class Building {
    private int squareFootage;
    private int stories;

    // Constructor
    public Building(int squareFootage, int stories) {
        this.squareFootage = squareFootage;
        this.stories = stories;
    }

    // Getters and Setters
    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public int getStories() {
        return stories;
    }

    public void setStories(int stories) {
        this.stories = stories;
    }
}

class House extends Building {
    private int bedrooms;
    private int baths;

    // Constructor
    public House(int squareFootage, int stories, int bedrooms, int baths) {
        super(squareFootage, stories);
        this.bedrooms = bedrooms;
        this.baths = baths;
    }

    // Getters and Setters
    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBaths() {
        return baths;
    }

    public void setBaths(int baths) {
        this.baths = baths;
    }
}

class School extends Building {
    private int classrooms;
    private String gradeLevel;

    // Constructor
    public School(int squareFootage, int stories, int classrooms, String gradeLevel) {
        super(squareFootage, stories);
        this.classrooms = classrooms;
        this.gradeLevel = gradeLevel;
    }

    // Getters and Setters
    public int getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(int classrooms) {
        this.classrooms = classrooms;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a House object
        House myHouse = new House(2000, 2, 3, 2);
        System.out.println("House Info:");
        System.out.println("Square Footage: " + myHouse.getSquareFootage());
        System.out.println("Stories: " + myHouse.getStories());
        System.out.println("Bedrooms: " + myHouse.getBedrooms());
        System.out.println("Baths: " + myHouse.getBaths());
        System.out.println();

        // Create a School object
        School mySchool = new School(10000, 3, 20, "Elementary");
        System.out.println("School Info:");
        System.out.println("Square Footage: " + mySchool.getSquareFootage());
        System.out.println("Stories: " + mySchool.getStories());
        System.out.println("Classrooms: " + mySchool.getClassrooms());
        System.out.println("Grade Level: " + mySchool.getGradeLevel());
    }
}
