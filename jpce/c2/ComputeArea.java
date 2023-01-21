package jpce.c2;

class ComputeArea
{
    public static void main(String[] args) {
        double radius;
        double area;
        radius = 20;
        // compute area
        area = radius * radius * 3.14159;
        System.out.println("The area of the circle with radius " + radius + " is " + area);
    }
}