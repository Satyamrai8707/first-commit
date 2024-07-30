public class array {
    public static void main(String[] args) {
        // type[] arrayname = new type[size];
        // int[] marks = new int[7];
        int marks[] = new int[7];
        marks[0] = 97;
        marks[1] = 34;
        marks[5] = 57;
        
        marks[2] = 35;
        marks[3] = 45;
       
        // System.out.println(marks[3]);
        // System.out.println(marks[5]);
        // System.out.println(marks[0]);

        for(int i =0; i<7;i++){
            System.out.println(marks[i]);
        }
    }
    
}
