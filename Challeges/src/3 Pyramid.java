class Pyramid {
    public static void main(String[] args) {
        RHPyramid();
        ReHPyramid();
        LHPyramid();
    }

    static void RHPyramid(){
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * * ");
        System.out.println("* * * * ");
        System.out.println("* * * * *");
    }
    static void ReHPyramid(){
        System.out.println("* * * * *");
        System.out.println("* * * * ");
        System.out.println("* * * ");
        System.out.println("* *");
        System.out.println("*");
    }

    static void LHPyramid(){
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }
}
